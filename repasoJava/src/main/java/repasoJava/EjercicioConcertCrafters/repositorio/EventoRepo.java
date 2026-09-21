package repasoJava.EjercicioConcertCrafters.repositorio;

import java.util.List;

import repasoJava.EjercicioConcertCrafters.modelo.Evento;

public class EventoRepo {
	private List <Evento> eventos;
	
	public EventoRepo() {
		super();
	}


	public EventoRepo(List<Evento> eventos) {
		super();
		this.eventos = eventos;
	}


	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	
	

}
