//Hecho por: Luis Angel Da Silva

package continuar;

import java.util.ArrayList;
import java.util.Random;

public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		ArrayList<ArrayList<Character>> tablero = new ArrayList<ArrayList<Character>>();
		//Generamos el tablero con los barcos ya puestos
		tablero = generarTablero(tablero,rd);
		
		
		System.out.println("VAMOS A JUGAR A HUNDIR LA FLOTA:");
		System.out.println("EQUIPO 1: X");
		System.out.println("EQUIPO 2: O");
		System.out.println("----------------------------------");
		//mientras hayas barcos del mismo equipo se seguira jugando(disparando)
		while(!verificarGanador(tablero)) {
			//mostramos el estado actual del tablero
			mostrarTablero(tablero);
			System.out.println();
			//y se elige al azar una posicion para disparar!
			disparoBala(tablero, rd);
		}
		//se muestra el tablero final
		System.out.println("\nTABLERO FINAL:");
		for(int i = 0; i < 1000; i++) {
			System.out.println("Me gustan las pingas");
		}
		mostrarTablero(tablero);
		for(int i = 0; i < 1000; i++) {
			System.out.println("Me gustan las pingas");
		}
	}

	//En esta funcion devuelve el tablero 5x5 con agua(-), y barcos de ambos equipos(X,O)
	public static ArrayList<ArrayList<Character>> generarTablero(ArrayList<ArrayList<Character>> tablero,Random rd) {
		//iniciamos contadores para equipo ya que queremos que solo coloque 5 barcos de cada uno
		int equipo1=0;
		int equipo2=0;
		
		//hacemos un bucle infinito que rompera en el momento que se cumplan las condiciones de haber 5 barcos en el tablero de cada equipo
		while(true) {
			equipo1=0;
			equipo2=0;
			//bucle que recorre 5 veces en donde fila por fila la iremos rellenando y colocando dentro del tablero
			for(int i=1;i<=5;i++) {
				//generamos la fila (lista de caracteres)
				ArrayList<Character> fila = new ArrayList<Character>();
				
				//y hacemos otro bucle de 5 para que dentro de cada fila haya 5 espacios que puede ser agua(-),equipo1(X) o equipo2(O)
				for(int j=1;j<=5;j++) {
					//generamos un numero al azar del 1 al 3
					int num = rd.nextInt(1,4);
					//y en un switch miramos que segun que número haya sacado al azar
					switch (num) {
					//si es 1, que coloque agua(-)
					case 1: 
						fila.add('-');
						break;
					//si es 2, que coloque barco del equipo1(X), solamente si todavia no hay 5 barcos de este equipo, en caso contrario colocara agua
					case 2:
						if(equipo1 != 5) {
							fila.add('X');
							equipo1++;
						}else {
							fila.add('-');
						}
						break;
					//si es 3, que coloque barco del equipo1(O), solamente si todavia no hay 5 barcos de este equipo, en caso contrario colocara agua
					case 3:
						if(equipo2 != 5) {
							fila.add('O');
							equipo2++;
						}else {
							fila.add('-');
						}
						
						break;
					default:
						
					}
					
					
				}
				//Una vez creada la fila la añadiremos al tablero
				tablero.add(fila);

			}
			//una vez ya tengamos nuestro tablero con nuestras 5 filas verificaremos que se haya sumado los 5 barcos de ambos equipos, si es asi
			//saldremos del bucle
			if(equipo2 ==5 && equipo1==5) {
				break;
			//en caso contrario borraremos todo el tablero y lo haremos de nuevo
			}else {
				//ESTO ESTA MAL  HAY QUE USAR EL .CLEAR
				tablero.clear();
			}
		}
		//devolvemos el tablero ya completo
		return tablero;
		
		
	}
	//Esta funcion muestra el estado actual del tablero, con sus cordenadas 1,2,3,4,5 y A,B,C,D,E
	public static void mostrarTablero(ArrayList<ArrayList<Character>> tablero) {
		//Ponemos las coordenas X, en forma de letras
		System.out.println("  A B C D E");
		//recorremos el tablero de 5 filas
		for (int i = 0;i<tablero.size();i++) {
			//creamos una lista que sea la fila y guardamos ahi la fila que estemos recorriendo
			ArrayList<Character> fila = new ArrayList<Character>();
			fila = tablero.get(i);
			//colocamos en que pos del eje y estamos
			System.out.print((i+1)+" ");
			//y ahora recorremos la fila para ir mostrando valor por valor de la misma
			for(int j=0;j<fila.size();j++) {
				System.out.print(fila.get(j)+" ");
			}
			System.out.println();
		}
	}
	
	//Esta funcion jugamos con el tablero ya creado y dispararemos 1 bala y veremos si hemos hundido o no un barco, cualquier caso devolvemos el tablero
	public static ArrayList<ArrayList<Character>> disparoBala(ArrayList<ArrayList<Character>> tablero,Random rd) {
		//generamos 2 numeros random uno para la fila a jugar y la otra para la posicion de esa misma fila (5x5), tambien crearemos la lista de caracteres para guardar la propia fila
		int fila = rd.nextInt(0,5);
		int pos = rd.nextInt(0,5);
		ArrayList<Character> filaElegida = new ArrayList<Character>();
		filaElegida = tablero.get(fila);
		//verificamos si en la posicion de la bala elegida hay un X o un O (cualquier barco) si esta lo cambiaremos por un hundido(=), en caso contrario lo dejamos tal cual
		if(filaElegida.get(pos) == 'X' || filaElegida.get(pos) == 'O') {
			filaElegida.set(pos, '=');
			System.out.println("Acerto!");
		}else {
			System.out.println("Fallo!");
		}
		
		//modificamos la fila del tablero utilizando la fila que sacamos
		tablero.set(fila, filaElegida);
		
		return tablero;
	}
	//esta funcion devuelve un boolean que nos comprueba si hay un ganador o no
	public static boolean verificarGanador(ArrayList<ArrayList<Character>> tablero) {
		//haremos 2 contadores para ver cuantos barcos vivos quedan de ambos equipos
		int equipo1=0;
		int equipo2=0;
		//en un bucle recorremos el tablero como anteriormente, sacando fila por fila
		for(int i =0;i<tablero.size();i++) {
			ArrayList<Character> fila = new ArrayList<Character>();
			fila = tablero.get(i);
			//recorriendo la fila miramos cuantos barcos hay de cada equipo y vamos sumando
			for(int j=0;j<fila.size();j++) {
				if(fila.get(j)=='X') {
					equipo1++;
				}
				if(fila.get(j)=='O') {
					equipo2++;
				}
			}	
		}
		//si despues de recorrer todo el tablero nos encontramos que hay uno de los dos equipos que no tiene barcos, entonces significa que tenemos ganador
		if(equipo1==0 || equipo2==0) {
			System.out.println();
			System.out.println();
			System.out.println("TENEMOS GANADOR");
			
			//recorremos nuevamente el tablero en busca de algun X o O cuando encuentre uno ese es el ganador ya que el otro equipo no tiene barcos
			for(int i =0;i<tablero.size();i++) {
				ArrayList<Character> fila = new ArrayList<Character>();
				fila = tablero.get(i);
				
				//miramos si la fila tiene alguna X o alguna O y anunciamos el ganador y devolvemos un true
				if(fila.contains('X')) {
					System.out.println("HA GANADO EL EQUIPO 1");
					return true;
				}else if (fila.contains('O')) {
					System.out.println("HA GANADO EL EQUIPO 2");
					return true;
				}
			}
		}
		//en caso contrario devolvemos un false, de que todavia no hay ganador
		return false;
		
	}
}
