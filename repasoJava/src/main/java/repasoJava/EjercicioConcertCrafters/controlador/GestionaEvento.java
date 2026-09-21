package repasoJava.EjercicioConcertCrafters.controlador;

import repasoJava.EjercicioConcertCrafters.exception.CrafterException;
import repasoJava.EjercicioConcertCrafters.modelo.Evento;
import repasoJava.EjercicioConcertCrafters.repositorio.EventoRepo;

public class GestionaEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventoRepo repo = new EventoRepo();
		Evento e = null;
		repo.getEventos().add(e);
	}

}
