package CineApp;

import java.util.HashMap;

public class Pelicula {

	//Atributos:
	private int numSala;
	private String titulo;
	private String genero;
	private String duracion;
	private HashMap<Integer, String> horario;
	
	//Constructor
	public Pelicula(int numSala, String titulo, String genero, String duracion) {
		this.numSala = numSala;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.horario = agregarhorarios();
	}
	//Metodos
	
	public HashMap<Integer, String> agregarhorarios() {
		HashMap<Integer, String> horas = new HashMap<Integer, String>();
		int a = 16;
		for(int i=0;i<3;i++) {
			if(i==0) {
				
				horas.put(i,"14:30");
			}
			else {
				
				horas.put(i,a+":30");
				a += 2;
			}
		}
		return horas;
	}


	//getters and setters
	public int getNumSala() {
		return numSala;
	}


	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getDuracion() {
		return duracion;
	}


	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	public HashMap<Integer, String> getHorario() {
		return horario;
	}


	public void setHorario(HashMap<Integer, String> horario) {
		this.horario = horario;
	}
}
