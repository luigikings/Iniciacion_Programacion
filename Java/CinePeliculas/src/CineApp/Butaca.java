package CineApp;

public class Butaca {

	//atributos:
	private int numero;
	private boolean disponible;
	private double precio;
	private int sala;
	
	//Constructor:
	public Butaca(int numero, double precio, int sala) {
		super();
		this.numero = numero;
		this.disponible = true;
		this.precio = precio;
		this.sala = sala;
	
	}
	//Metodos:
	
	
	//getters and setters:
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
}
