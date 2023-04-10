package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {

	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el n�mero de venta)
	Integer contadorDeVentas; // Identificador del n�mero de venta

	public Supermercado(String nombre) {
		this.nombre = nombre;
		this.productosDisponibles = new ArrayList<>();
		this.productosExistentes = new HashSet<>();
		this.ventasRealizadas = new HashMap<>();
		this.contadorDeVentas = 0;
	}

	public void ingresarProducto(Producto nuevo) {
		// Ingresa un nuevo producto
		productosExistentes.add(nuevo);
		productosDisponibles.add(nuevo);
//		if (!productoExiste(nuevo.getCodigo())) {
//			this.productosDisponibles.add(nuevo);
//		}

	}

	public Set<Producto> getOfertaDeProductos() {

		// Devuelve el conjunto de productos que se comercializan
		return productosExistentes;
	}

	public Integer getStock(Integer codigo) {
		int contadorStock = 0;
		for (Producto producto : productosDisponibles) {
			if (producto.getCodigo().equals(codigo)) {
				contadorStock++;
			}
		}
		return contadorStock;
		// Devuelve la cantidad de unidades de un producto determinado
	}

	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente {
		boolean siExiste = false;

		if (!productosExistentes.isEmpty()) {
			for (Producto producto : productosExistentes) {
				if (producto.getCodigo().equals(codigoDeProducto)) {
					siExiste = true;

				}
			}
		}
		if (siExiste == false) {
			throw new ProductoInexistente("codigo" + codigoDeProducto + "no existe");
		}
		return siExiste;
		// Verifica si un producto existe
	}

	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
		Producto productoBuscado = null;
		if (!productosDisponibles.isEmpty()) {
			for (Producto producto : productosDisponibles) {
				if (producto.getCodigo().equals(codigoDeProducto)) {
					productoBuscado = producto;
				}
			}
		}
		if (productoBuscado == null) {
			throw new ProductoSinStock("codigo" + codigoDeProducto + "sin stock");
		}
		return productoBuscado;
	}

	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}

	public Venta getVenta(Integer nueroDeVenta) {

		// Devuelve una venta en funci�n de su n�mero identificatorio
		return ventasRealizadas.get(nueroDeVenta);

	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto)
			throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el
		// "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		if (productoExiste(codigoDeProducto)) {
			Producto p = getProductoPorCodigo(codigoDeProducto);
			if (p != null) {
				productosDisponibles.remove(p);
				Venta v = ventasRealizadas.get(numeroDeVenta);
				Double importe = v.getImporte() + p.getPrecio();
				v.setImporte(importe);
				ventasRealizadas.remove(numeroDeVenta);
				ventasRealizadas.put(numeroDeVenta, v);
			}
		}
	}

}