package example.microservice;

public class Cuenta {

	private String cedula;
	private String referencia;
	private String estado;
	
	
	public Cuenta(String cedula, String referencia, String estado) {
		super();
		this.cedula = cedula;
		this.referencia = referencia;
		this.estado = estado;
	}

	public String getCedula() {
		return cedula;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
