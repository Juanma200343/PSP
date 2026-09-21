package repasoJava.EjercicioConcertCrafters.modelo;

import java.time.LocalDate;

import repasoJava.EjercicioConcertCrafters.exception.CrafterException;

public class Deportivo extends Evento {
	
	private boolean televisivos;

	public Deportivo(int identificador, String nombre, LocalDate fecha, int numEntradasVen, int capacidadMaxAsis,
			Estado estado) throws CrafterException {
		super(identificador, nombre, fecha, numEntradasVen, capacidadMaxAsis, estado);
		// TODO Auto-generated constructor stub
		this.televisivos = televisivos;
	}

	
	
	
	@Override
	public double calcularCosteBase() {
		// TODO Auto-generated method stub
		return 0;
	}


}
