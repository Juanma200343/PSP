package EjercicioChat.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Conversion {
	
	private int id;
	private String pregunta;
	private String respuesta;
	private LocalDate fechaConversion;
	private int numValoracionesPositivas;
	private TipoAgente tipo;
	
	public Conversion(int id, String pregunta, String respuesta, LocalDate fechaConversion,
			int numValoracionesPositivas,TipoAgente tipo) {
		super();
		this.id = id;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.fechaConversion = fechaConversion;
		this.numValoracionesPositivas = numValoracionesPositivas;
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public LocalDate getFechaConversion() {
		return fechaConversion;
	}
	public void setFechaConversion(LocalDate fechaConversion) {
		this.fechaConversion = fechaConversion;
	}
	public int getNumValoracionesPositivas() {
		return numValoracionesPositivas;
	}
	public void setNumValoracionesPositivas(int numValoracionesPositivas) {
		this.numValoracionesPositivas = numValoracionesPositivas;
	}
	
	
	public TipoAgente getTipo() {
		return tipo;
	}
	public void setTipo(TipoAgente tipo) {
		this.tipo = tipo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conversion other = (Conversion) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Conversion [id=" + id + ", pregunta=" + pregunta + ", respuesta=" + respuesta + ", fechaConversion="
				+ fechaConversion + ", numValoracionesPositivas=" + numValoracionesPositivas + "]";
	}
	
	
	

}
