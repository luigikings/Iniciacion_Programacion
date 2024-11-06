package redSocial;

public class Mensaje {
	//Atributos:
	private Usuario remitente;
	private boolean leido;
	private String mensaje;
	
	//Constructor:
	public Mensaje(Usuario remitente, boolean leido, String mensaje) {
		this.remitente = remitente;
		this.leido = leido;
		this.mensaje = mensaje;
	}

	//Getters and Setters
	public Usuario getRemitente() {
		return remitente;
	}

	public void setRemitente(Usuario remitente) {
		this.remitente = remitente;
	}

	public boolean isLeido() {
		return leido;
	}

	public void setLeido(boolean leido) {
		this.leido = leido;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
	
	

}
