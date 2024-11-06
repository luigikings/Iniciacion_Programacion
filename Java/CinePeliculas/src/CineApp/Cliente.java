package CineApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	//Atributos:
	private String correo;
	private String nombre;
	private String Apellido;
	private List<Butaca> butacasCompradas;
	
	
	//Constructor:
	public Cliente(String correo, String nombre, String apellido) {
		super();
		this.correo = correo;
		this.nombre = nombre;
		Apellido = apellido;
		this.butacasCompradas = new ArrayList<Butaca>();
	}
	//metodos:
	
	public void comprarEntradas(Cine cine) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a Cinex! \n Elige que Pelicula quieres ver:");
		Sala sala = null;
		while(true) {
			System.out.println("Elige la pelicula:");
			cine.listarPelis();
			String usuario1 = sc.nextLine();
			sala = cine.buscarSala(usuario1);
			if(sala!=null) {
				break;
			}
			System.err.println("UPS!");
		}
		
		
		if(sala.sumarButacasDisponibles()!=0) {
			for(Butaca butaca: sala.generarButacas()) {
				if(butaca.isDisponible()) {
					butaca.setDisponible(false);
					butacasCompradas.add(butaca);
					System.out.println("Butaca comprada asiento numero:"+butaca.getNumero());
					break;
					
				}
			}
		} else {
			System.err.println("NO HAY MAS ASIENTOS!");
		}
	}
	
	public void mostrarButacas(Cine cine) {
		for(Butaca butaca: butacasCompradas) {
			System.out.println("Butaca: "+butaca.getNumero()+" de la pelicula:");
			Sala sala = cine.buscarSala(butaca.getNumero()+"");
			Pelicula peli = sala.getPelicula();
			System.out.print(peli.getTitulo());
			System.out.println("-------------------------");
		}
	}
	
	//Getters and Setters:
	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	public List<Butaca> getButacasCompradas() {
		return butacasCompradas;
	}


	public void setButacasCompradas(List<Butaca> butacasCompradas) {
		this.butacasCompradas = butacasCompradas;
	}
	
}
