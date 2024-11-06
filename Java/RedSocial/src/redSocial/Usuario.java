package redSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	//Atributos:
	private String nombre;
	private List<Chat> chats;
	
	//Constructor:
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.chats = new ArrayList<Chat>();
	}
	
	//Metodos:
	public void agregarContacto(Usuario usuario) {
		Chat chat = new Chat();
		chat.agregarUsuarios(usuario);
	}
	
	public void mandarMensaje() {
		System.out.println("Eliga un usuario:");
		if(!chats.isEmpty()) {
			for(Chat chat: chats) {
				for(Usuario usuario: chat.getUsuarios()) {
					System.out.println("-------------------------");
					System.out.println(usuario.getNombre());
					
				}
			}
		}else {
			System.out.println("No hay usuarios ;(");
		}
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Chat> getChats() {
		return chats;
	}

	public void setChats(List<Chat> chats) {
		this.chats = chats;
	}

}
