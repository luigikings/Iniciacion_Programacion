package redSocial;

import java.util.ArrayList;
import java.util.List;

public class Chat {
	//Atributos:
	private List<Usuario> usuarios;
 	private List<Mensaje> mensajes;
 	private boolean bloqueado;
 	
 	//Constructor:
	public Chat() {
		this.usuarios = new ArrayList<Usuario>();
		this.mensajes = new ArrayList<Mensaje>();
		this.bloqueado = false;
	}
	
	//metodos:
	public void agregarUsuarios(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	
	
	//Getters and Setters
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

}
