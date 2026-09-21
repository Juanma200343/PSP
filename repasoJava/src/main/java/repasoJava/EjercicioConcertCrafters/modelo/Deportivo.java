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
		double precioAlquilerEstadio = 0;
		double calculo = 0;
		if(televisivos == true) {
		 calculo = precioAlquilerEstadio - 10000;
		}else {
			calculo = precioAlquilerEstadio;
		}
		return calculo;
	}


}
