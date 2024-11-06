package barcos;

import java.util.Random;

public class Barco {
	
	public int posX;
	public int posY;
	public boolean hundido;
	
	//COnstructor: Iniciamos hundido como false porque el barco inicia sin estar hundido no jeje 
	public Barco() {
		this.posX = 0;
		this.posY = 0;
		this.hundido = false;
	}

	//metodos:
	
	public void generarPos(int tamanio) {
		Random rd = new Random();
		this.posX =  rd.nextInt(0,tamanio);
		this.posY =  rd.nextInt(0,tamanio);
	}

	//getters and setters
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public boolean isHundido() {
		return hundido;
	}

	public void setHundido(boolean hundido) {
		this.hundido = hundido;
	}
	
	

}
