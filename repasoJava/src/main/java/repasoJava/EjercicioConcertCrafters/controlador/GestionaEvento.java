package repasoJava.EjercicioConcertCrafters.controlador;

import java.time.LocalDate;

import repasoJava.EjercicioConcertCrafters.exception.CrafterException;
import repasoJava.EjercicioConcertCrafters.modelo.Concierto;
import repasoJava.EjercicioConcertCrafters.modelo.Deportivo;
import repasoJava.EjercicioConcertCrafters.modelo.Estado;
import repasoJava.EjercicioConcertCrafters.modelo.Evento;
import repasoJava.EjercicioConcertCrafters.repositorio.EventoRepo;

public class GestionaEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventoRepo repo = new EventoRepo();
		Evento e = null;
		//repo.getEventos().add(e);

		
		/*Apartado 1*/
	try {
		Deportivo e1 = new Deportivo(1,"Major 1",LocalDate.now(),600,500,Estado.PROGRAMADO);
	} catch (CrafterException e1) {
		// TODO Auto-generated catch block
		e1.getMessage();
	}
			
	/*Apartado 2*/
	try {
		Concierto c1 = new Concierto(2, "Major 2", LocalDate.now(), 200, 500, Estado.APLAZADO);
		c1.modificaEstado(Estado.APLAZADO);
	} catch (CrafterException e1) {
		// TODO Auto-generated catch block
		e1.getMessage();
	}
	
	
	
	}

}
