package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	static Integer CONT = 0;

	public Club(String nombre) {
		super();
		this.nombre = nombre;
		this.socios = new HashSet<>();
		this.competencias = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}

	public void agregarDeportista(Deportista deportista) {
		this.socios.add(deportista);

	}

	public Integer getCantidadSocios() {
		// TODO Auto-generated method stub
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento tipo, String nombre) {
		this.competencias.put(nombre, new Evento(tipo));

	}

	public Integer inscribirEnEvento(String nameEvento, Deportista deportista) throws NoEstaPreparado {
		Evento e = this.competencias.get(nameEvento);
		switch (e.getTipo()) {
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if (deportista instanceof Nadador) {
				e.setNumeroDeInscripcion(CONT++);
				e.getParticipantes().put(e.getNumeroDeInscripcion(), deportista);
			} else {
				throw new NoEstaPreparado("no esta preparado");
			}
			break;
		case TRIATLON_IRONMAN:
			if (deportista instanceof Nadador) {
				e.setNumeroDeInscripcion(CONT++);
				e.getParticipantes().put(e.getNumeroDeInscripcion(), deportista);
			} else {
				throw new NoEstaPreparado("no esta preparado");
			}
			break;
		case CARRERA_42K:
			if (deportista instanceof Corredor) {
				e.setNumeroDeInscripcion(CONT++);
				e.getParticipantes().put(e.getNumeroDeInscripcion(), deportista);
			} else {
				throw new NoEstaPreparado("no esta preparado");
			}
			break;
		default:
			break;
		}

		return e.getParticipantes().size();
	}

}
