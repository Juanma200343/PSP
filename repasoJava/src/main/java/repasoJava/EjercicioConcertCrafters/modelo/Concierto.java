package repasoJava.EjercicioConcertCrafters.modelo;

import java.time.LocalDate;

import repasoJava.EjercicioConcertCrafters.exception.CrafterException;

public class Concierto extends Evento {
	private String artistaPrincipal;
	private String [] artistasInv ;
	private int contadorArt;
	

	public Concierto(int identificador, String nombre, LocalDate fecha, int numEntradasVen, int capacidadMaxAsis,
			Estado estado, String artistaPrincipal, String[] artistas) throws CrafterException {
		super(identificador, nombre, fecha, numEntradasVen, capacidadMaxAsis, estado);
		this.artistaPrincipal = artistaPrincipal;
		this.artistasInv = new String [10];
	}

	public Concierto(int identificador, String nombre, LocalDate fecha, int numEntradasVen, int capacidadMaxAsis,
			Estado estado) throws CrafterException {
		super(identificador, nombre, fecha, numEntradasVen, capacidadMaxAsis, estado);
		// TODO Auto-generated constructor stub
	}

	
	
	public String getArtistaPrincipal() {
		return artistaPrincipal;
	}

	public void setArtistaPrincipal(String artistaPrincipal) {
		this.artistaPrincipal = artistaPrincipal;
	}

	public String[] getArtistasInv() {
		return artistasInv;
	}

	public void setArtistasInv(String[] artistasInv) {
		this.artistasInv = artistasInv;
	}

	@Override
	public double calcularCosteBase() {
		// TODO Auto-generated method stub
		double calculo = 5000 + 2000 + 500 * contadorArt  ;
		
		return calculo;
	}

	public void agregarArtista(String ar) {
		if(contadorArt < artistasInv.length) {
			this.artistasInv[contadorArt]= ar;
			contadorArt = contadorArt +1;
		}
		
	}
	
	

}
