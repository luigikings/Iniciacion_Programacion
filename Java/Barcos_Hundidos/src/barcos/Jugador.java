package barcos;

import java.util.Scanner;

public class Jugador {

	public String nombre;
	public int eleccionX;
	public int eleccionY;
	
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.eleccionX=0;
		this.eleccionY=0;
	}
	
	//metodos
	
	public void elegirJugada() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elige 2 Posiciones");
		System.out.println("PosX: ");
		this.eleccionX = sc.nextInt();
		System.out.println("PosY: ");
		this.eleccionY = sc.nextInt();
	}

	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEleccionX() {
		return eleccionX;
	}

	public void setEleccionX(int eleccionX) {
		this.eleccionX = eleccionX;
	}

	public int getEleccionY() {
		return eleccionY;
	}

	public void setEleccionY(int eleccionY) {
		this.eleccionY = eleccionY;
	}
	
	
}
