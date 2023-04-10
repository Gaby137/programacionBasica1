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
		// Constructor de la clase
		this.productosExistentes = new HashSet<>();
		this.productosDisponibles = new ArrayList<>();
		this.ventasRealizadas = new HashMap<>();
		contadorDeVentas = 0;

	}

	public void ingresarProducto(Producto nuevo) {
		// Ingresa un nuevo producto
		this.productosExistentes.add(nuevo);
		this.productosDisponibles.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		// Devuelve el conjunto de productos que se comercializan
		return this.productosExistentes;
	}

	public Integer getStock(Integer codigo) {
		// Devuelve la cantidad de unidades de un producto determinado
		Integer a = 0;
		for (Producto producto : productosDisponibles) {
			if (codigo.equals(producto.getCodigo())) {
				a++;
			}
		}
		return a;

	}

	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente {
		// Verifica si un producto existe
		Boolean existe = false;
		for (Producto producto : productosExistentes) {
			if (codigoDeProducto.equals(producto.getCodigo())) {
				existe = true;
			}
		}

		return existe;
	}

	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
		Producto a = null;
		for (Producto producto : productosDisponibles) {
			if (codigoDeProducto.equals(producto.getCodigo())) {
				a = producto;
			}
		}
		return a;

	}

	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}

	public Venta getVenta(Integer nueroDeVenta) {
		// Devuelve una venta en funci�n de su n�mero identificatorio

		return this.ventasRealizadas.get(nueroDeVenta);
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto)
			throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el
		// "numeroDeVenta", el producto identificado por el "codigoDeProducto"

		if (this.productoExiste(codigoDeProducto)) {
			if (this.getProductoPorCodigo(codigoDeProducto) != null) {
				Double varAux = this.getVenta(numeroDeVenta).getImporte();
				this.getVenta(numeroDeVenta)
						.setImporte(varAux + this.getProductoPorCodigo(codigoDeProducto).getPrecio());
				this.productosDisponibles.remove(this.getProductoPorCodigo(codigoDeProducto));

			} else {
				throw new ProductoSinStock("no hay stock");
			}
		} else {
			throw new ProductoInexistente("no existe el producto");
		}
	}

	public List<Producto> productosComestibles() {
		List<Producto> a = new ArrayList<>();

		for (Producto producto : productosDisponibles) {
			if (producto instanceof Comestible) {
				a.add(producto);
			}
		}
		return a;
	}

}
