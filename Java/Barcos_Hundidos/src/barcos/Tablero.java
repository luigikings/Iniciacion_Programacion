package barcos;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

	//Atributos:
	public List<List<Integer>> tabla;
	public int tamanio;
	public boolean todoHundido;
	public Jugador jugador;
	public List<Barco> barcos;
	
	//Contructor:
	public Tablero(int tamanio,Jugador jugador) {
		this.tabla = new ArrayList<List<Integer>>();
		this.tamanio = tamanio;
		this.todoHundido = false;
		this.jugador = jugador;
		this.barcos = new ArrayList<Barco>();
	}
	//Metodos:
	
	//Una funcion donde generamos el tablero segun el tamaño asignado en los atributos y 
	//añadimos los barcos de la lista de barcos
	public void generarTablero() {
		
		//bucle para crear el tablero segun el tamaño dado en los atributos
		for(int i=1;i<=this.tamanio;i++) {
			List<Integer> fila = new ArrayList<Integer>();
			for(int j=1; j<=this.tamanio;j++) {
				fila.add(0);
			}
			this.tabla.add(fila);
		}
		
		//recorremos la lista de barcos y añadimos cada barco al tablero
		//asegurandonos que ningun barco se colapse uno encima del otro
		for(Barco barco: this.barcos) {
			int posX = barco.getPosX();
			int posY = barco.getPosY();
			
			List<Integer> fila = this.tabla.get(posX);
			if(fila.get(posY)==4) {
				for(List<Integer> filas: tabla) {
					List<Integer> fila2 = filas;
					for(int pos: fila2) {
						if(pos==0) {
							fila2.set(pos, 4);
						}
					}
				}
			}else {
				fila.set(posY, 4);
			}
			
		}
	}
	
	public void generarBarcos(int cantBarcos) {
		this.barcos.clear();
		if((this.tamanio*this.tamanio)<cantBarcos) {
			
		}else {
			for(int i=0;i<cantBarcos;i++) {
				Barco barco = new Barco();
				barco.generarPos(this.tamanio);
				this.barcos.add(barco);
			}
		}
	}
	
	public boolean comprobarListaBarcos() {
		for(int i=0;i<this.barcos.size();i++) {
			for(int j=i+1;j<this.barcos.size();j++) {
				if(j>this.barcos.size()){
					break;
				}
				if(this.barcos.get(i).getPosX()==this.barcos.get(j).getPosX() && this.barcos.get(i).getPosY()==this.barcos.get(j).getPosY()) {
					System.err.println("Barcos Repetidos!");
					return true;
				}
				
				
			}
			
		}
		return false;
	}
	
	public void mostrarTablero() {
		System.out.println("Mostramos tablero");
		for(int i=0;i<this.tabla.size();i++) {
			List<Integer> fila = this.tabla.get(i);
			for(int j=0; j<fila.size();j++) {
				if(fila.get(j)==0) {
					System.out.print("~ ");
				} else if(fila.get(j)==4) {
					System.out.print("O ");
				} else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}
	
	public void jugarJugador(Jugador jugador) {
		jugador.elegirJugada();
		int x = jugador.getEleccionX()-1;
		int y = jugador.getEleccionY()-1;
		
		List<Integer> fila = this.tabla.get(y);
		if(fila.get(x)==4) {
			fila.set(x, 7);
			System.out.println("Acerto!");
		}else {
			System.out.println("Fallo!");
		}
		
	}
	
	public void comprobarTablero() {
		for(int i=0;i<this.tabla.size();i++) {
			List<Integer> fila = this.tabla.get(i);
			for(int j=0; j<fila.size();j++) {
				if(fila.get(j)==4) {
					return;
				}
			}
		}
		this.todoHundido=true;
	}

	public List<List<Integer>> getTabla() {
		return tabla;
	}

	public void setTabla(List<List<Integer>> tabla) {
		this.tabla = tabla;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public boolean isTodoHundido() {
		return todoHundido;
	}

	public void setTodoHundido(boolean todoHundido) {
		this.todoHundido = todoHundido;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public List<Barco> getBarcos() {
		return barcos;
	}

	public void setBarcos(List<Barco> barcos) {
		this.barcos = barcos;
	}

}
