package continuar;

import java.util.ArrayList;
import java.util.Random;

public class TresenRayaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos la lista de listas de tipo String y declaramos ambos equipos X o O
		ArrayList<ArrayList<String>> tablero = new ArrayList<ArrayList<String>>();
		String Equipo1 = "X";
		String Equipo2 = "O";
		
		//generamos el tablero 3x3 y lo mostramos vacio
		tablero = generarTablero(tablero);
		mostrarTablero(tablero);
		//en un bucle recorremos hasta que gane 1 de los 2 equipos o se llene todas las casillas
		while(true) {
			//jugamos el turno del equipi 1 (X)
			jugarPartida(tablero, Equipo1);
			mostrarTablero(tablero);
			//comprobamos si con ese movimiento ha ganado, si es afirmativo entonces decimos el ganador y salimos del bucle
			if(comprobarGanador(tablero)) {
				System.out.println("HA GANADO EL EQUIPO X");
				break;
			}
			//despues comprobamos si con ese movimiento se lleno el tablero, en caso afirmativo decimos que hay empate y salimos del bucle
			if(!comprobarLleno(tablero)) {
				System.out.println("EMPATE!");
				break;
			}
			//ahora juega el turno del equipo contrario y repetimos el mismo proceso
			jugarPartida(tablero, Equipo2);
			mostrarTablero(tablero);
			if(comprobarGanador(tablero)) {
				System.out.println("HA GANADO EL EQUIPO O");
				break;
			}
			if(!comprobarLleno(tablero)) {
				System.out.println("EMPATE!");
				break;
			}
		}
		
		
	}

	//esta funcion devuelve un tablero de 3x3 lleno de "_"
	public static ArrayList<ArrayList<String>> generarTablero(ArrayList<ArrayList<String>> tablero) {
		
		//añadimos 3 listas dentro de la lista de listas
		for(int i=0;i<3;i++) {
			//creamos una fila que es la usaremos para meterlo dentro de la lista de listas
			ArrayList<String> fila = new ArrayList<String>();
			//y la llenamos con 3 "_"
			for(int j=0;j<3;j++) {
				fila.add("_");
			}
			//y la añadimos al tablero
			tablero.add(fila);
		}
		//y devolvemos el tablero
		return tablero;
	}
	//en este bucle iremos mostrando el estado actual del tablero
	public static void mostrarTablero(ArrayList<ArrayList<String>> tablero) {
		//creamos la lista de String para ir sacando las listas dentro del tablero y mostrarlas 1 a 1 con un bucle
		ArrayList<String> fila = new ArrayList<String>();
		
		System.out.println("\nTABLERO:");
		//recorremos las filas del tablero con el bucle
		for(int i=0;i<tablero.size();i++) {
			//sacamos la fila del tablero
			fila=tablero.get(i);
			//y la guardamos para ir mostrandola con otro bucle la recorremos y mostramos su contenido 1 a 1
			for(int j=0;j<fila.size();j++) {
				System.out.print(fila.get(j)+" ");
			}
			//salto de linea para que quede 3x3 en el sysout
			System.out.println();
		}
		
	}
	//en esta funcion jugamos el turno de uno de los 2 equipos
	public static void jugarPartida(ArrayList<ArrayList<String>> tablero,String Juega) {
		Random rd = new Random();
		//creamos un bucle infinito en donde solo se saldra si la jugada fue valida
		while(true) {
			//generamos 2 cordenadas al azar del 0-2 y la fila a sacar del tablero
			int posx = rd.nextInt(3);
			int posy = rd.nextInt(3);
			ArrayList<String> fila = new ArrayList<String>();
			//con la primera coordenada sacamos la fila y con la segunda sacamos la posicion de esa misma fila
			fila = tablero.get(posx);
			//comprobamos que tenga un "_" que significa que esta disponible y la rellenamos con el simbolo del equipo que este jugando
			if(fila.get(posy)=="_") {
				fila.set(posy, Juega);
				break;
			}
		}
	}
	//funcion para comprobar si en el tablero ya existe algun ganador, devolvera un boolean
	public static boolean comprobarGanador(ArrayList<ArrayList<String>> tablero) {
		//generamos el boolean a devolver y lo iniciamos como false y comprobramos en cada caso si hay ganador
		boolean ganador=false;
		
		//primero miramos si el ganador ya tiene alguna fila
		for(int i=0;i<tablero.size();i++) {
			ArrayList<String> fila = new ArrayList<String>();
			fila=tablero.get(i);
			if(!fila.contains("_")) {
				if(fila.get(0).equals(fila.get(1)) && fila.get(1).equals(fila.get(2))) {
					System.out.println("Ganador con fila");
					ganador = true;
				}
			}
		}
		
		
		ArrayList<String> fila1 = new ArrayList<String>();
		ArrayList<String> fila2 = new ArrayList<String>();
		ArrayList<String> fila3 = new ArrayList<String>();
		
		fila1=tablero.get(0);
		fila2=tablero.get(1);
		fila3=tablero.get(2);
		
		//comprobamos las columnas
		for(int i=0;i<tablero.size();i++) {
			if(!fila1.get(i).equals("_") && !fila2.get(i).equals("_") && !fila3.get(i).equals("_")) {
				if(fila1.get(i).equals(fila2.get(i)) && fila2.get(i).equals(fila3.get(i))) {
					ganador = true;
				}
			}
		}
		//comprobamos ambas diagonales
		if(!fila1.get(0).equals("_") && !fila2.get(1).equals("_") && !fila3.get(2).equals("_")) {
			if(fila1.get(0).equals(fila2.get(1)) && fila2.get(1).equals(fila3.get(2))) {
				ganador = true;
			}
		}
		
		if(!fila1.get(2).equals("_") && !fila2.get(1).equals("_") && !fila3.get(0).equals("_")) {
			if(fila1.get(2).equals(fila2.get(1)) && fila2.get(1).equals(fila3.get(0))) {
				ganador = true;
			}
		}
		
		return ganador;
	}
	//funcion para mirar si hay algun "_" para ver si se lleno el tablero.
	public static boolean comprobarLleno(ArrayList<ArrayList<String>> tablero) {
		for(int i=0;i<tablero.size();i++) {
			ArrayList<String> fila = new ArrayList<String>();
			fila = tablero.get(i);
			if(fila.contains("_")) {
				return true;
			}
		}
		return false;
	}
}
