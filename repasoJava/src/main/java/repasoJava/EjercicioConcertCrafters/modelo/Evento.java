package repasoJava.EjercicioConcertCrafters.modelo;

import java.time.LocalDate;
import java.util.Objects;

import repasoJava.EjercicioConcertCrafters.exception.CrafterException;

public abstract class Evento {
	
	private static int contador;
	private int identificador;
	private String nombre;
	private LocalDate fecha;
	private int numEntradasVen;
	private int capacidadMaxAsis;
	private Estado estado;
	
	public Evento(int identificador, String nombre, LocalDate fecha, int numEntradasVen, int capacidadMaxAsis,Estado estado) throws CrafterException {
		super();
		contador++;
		this.identificador = contador;
		this.nombre = nombre;
		this.fecha = fecha;
		
		if(capacidadMaxAsis <= numEntradasVen && capacidadMaxAsis >0) {
			this.numEntradasVen = numEntradasVen;
			getCapacidadMaxAsis();
			
		}else {
			throw new CrafterException("No es posible construir un evento con esos datos");
		}

		this.estado = estado;
	
		}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getNumEntradasVen() {
		return numEntradasVen;
	}

	public void setNumEntradasVen(int numEntradasVen) {
		this.numEntradasVen = numEntradasVen;
	}

	public int getCapacidadMaxAsis() {
		if(this.capacidadMaxAsis <= 0 ) {
			System.out.println("Error numero no posible.");
		}
		
		return capacidadMaxAsis;
	}

	public void setCapacidadMaxAsis(int capacidadMaxAsis) {
		this.capacidadMaxAsis = capacidadMaxAsis;
	}
	

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(identificador));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return identificador == other.identificador;
	}

	
	public void modificaEstado(Estado estado) throws CrafterException {
		if(!this.estado.equals(estado)){
			setEstado(estado);
		}else {
			throw new CrafterException("No es posible pasar al estado: XXXX");
		}
		
	}
	
	public float getPorcentajeOcupacion() {
		float porcentaje  = 0;
		
		porcentaje  = getNumEntradasVen() / getCapacidadMaxAsis();
		
		
		return porcentaje;
		
	}
	

	public float getPorcentajeOcupacion(int numeroEntradas) {
		float porcentaje  = 0;
		
		if(numeroEntradas <= getCapacidadMaxAsis()) {
		
		porcentaje  = getNumEntradasVen() / getCapacidadMaxAsis();
		}else {
			System.out.println("El numero de entradas superó a la capacidad maxima.");
		}
		
		return porcentaje;
		
	}
	
	
	public abstract double calcularCosteBase();
	
	
	@Override
	public String toString() {
		return "Evento [identificador=" + identificador + ", nombre=" + nombre + ", fecha=" + fecha + ", estado="
				+ estado + "]";
	}
	
	
	
	
}
