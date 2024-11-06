package CineApp;

import java.util.ArrayList;
import java.util.List;

public class Cine {

	//Atributos:
	private String nombre;
	private List<Pelicula> peliculas;
	private List<Sala> salas;
	private List<Cliente> clientes;
	
	//Constructor:
	public Cine(String nombre) {
		this.nombre = nombre;
		this.peliculas = new ArrayList<Pelicula>();
		this.salas = new ArrayList<Sala>();
		this.clientes = new ArrayList<Cliente>();
	}
	//Metodos:
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void agregarPelicula(Pelicula peli) {
		peliculas.add(peli);
	}
	
	public void agregarSala(Sala sala) {
		salas.add(sala);
	}
	
	
	public void mostrarCartelera() {
		for(Pelicula peli: peliculas) {
			System.out.println("---------------------------------"
					+ "\nTitulo: "+peli.getTitulo()
					+ "\nGenero: "+peli.getGenero()
					+ "\nDuracion: "+peli.getDuracion()
					+ "\nSala: "+peli.getNumSala()
					+ "\nHorarios: ");
			for(String horario: peli.getHorario().values()) {
				System.out.print(horario+" / ");
			}
			System.out.println("");
		}
	}
	
	public void listarPelis() {
		for(Pelicula peli: peliculas) {
			System.out.println("-----------------------------"
					+ "\n"+peli.getNumSala()+": "+peli.getTitulo());
		}
	}
	
	public void listarSalas() {
		for(Sala sala: salas) {
			System.out.println(sala.getNumero());
		}
	}
	
	public Sala buscarSala(String usuario) {
		for(Sala sala: salas) {
			if(usuario.equals(sala.getNumero())) {
				return sala;
			}
		}
		return null;
	}
	

	//getters and Setters:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public List<Sala> getSalas() {
		return salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	

	
	
	
}
