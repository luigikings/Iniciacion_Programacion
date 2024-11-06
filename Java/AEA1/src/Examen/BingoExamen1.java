//Luis Angel Da Silva
package Examen;

import java.util.Scanner;

public class BingoExamen1 {
	public static void main(String[] args) {
		//Haremos un bucle para jugar al bingo otra vez siempre que el jugador nos lo pida en la funcion continuar
		do {
			jugarBingo();
		} while (continuar());
	}

	//En esta función Generamos toda la partida:
	public static void jugarBingo() {
		//primero generamos los 2 cartones de los jugadores
		int[][] cartonJugador1 = generarCarton();
		int[][] cartonJugador2 = generarCarton();

		//mostramos ambos cartones para ver con que número van a jugar
		System.out.println("Cartón del Jugador 1:");
		imprimirCarton(cartonJugador1);

		System.out.println("\nCartón del Jugador 2:");
		imprimirCarton(cartonJugador2);
		
		//Generamos el bombo de números
		int[] bombo = generarBombo();

		//y con los cartones y el bombo ya podemos empezar a jugar
		System.out.println("\nComienza el juego de Bingo:");
		jugarBingo(cartonJugador1, cartonJugador2, bombo);
	}

	//En esta función devolvemos una array de enteros que sera nuestro bombo
	public static int[] generarBombo() {
		//como vamos a jugar hasta el 20 la creamos con 20 espacios
		int[] bombo = new int[20];
		//y con un bucle llenamos cada posicion del 1 al 20
		for (int i = 0; i < 20; i++) {
			bombo[i] = i + 1;
		}
		return bombo;
	}

	//Con esta función mostramos por pantalla los 2 cartones
	public static void imprimirCarton(int[][] carton) {
		//con los bucles recorremos la array bidimensional y la mostramos
		for (int x = 0; x < carton.length; x++) {
			for (int y = 0; y < carton[x].length; y++) {
				System.out.print(carton[x][y] + "  ");
			}
			System.out.println();
		}
	}

	//Esta función verifica si el número dado por el bombo se encuentra dentro del carton dado, si es asi devuelve un true en caso contrario devuelve un false
	public static boolean contieneNumero(int[][] carton, int numero) {
		for (int x = 0; x < carton.length; x++) {
			for (int y = 0; y < carton[x].length; y++) {
				if (carton[x][y] == numero) {
					carton[x][y]=0;
					return true;
				}
			}
		}
		return false;
	}

	// Esta función solicita al usuario si desea continuar
	// jugando y devuelve true si la respuesta es "S" (Sí) o false si es "N" (No).
	public static boolean continuar() {
		// A GENERAR!!!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Si quieres volver a jugar introduce (S) o si no deseas volver a jugar introduce (N)");
		String res = sc.nextLine();
		//convertimos a mayusculas asi no damos fallo entre si el usuario escribe a mayusculas o minusculas
		res = res.toUpperCase();

		//y con una condicional verificamos si ha seleccionado S o N o en caso de escribir otra cosa volver a llamar la función
		if (res.equals("S")) {
			return true;
		} else if (res.equals("N")) {
			return false;
		} else {
			return continuar();
		}

	}

	// Esta función genera un cartón de Bingo aleatorio de 2x5,
	// llenando cada celda con números únicos entre 1 y 20.
	// tiene que haber la misma cantidad de número 1-10 que 11-20
	public static int[][] generarCarton() {
        // A GENERAR!!!
		//Creamos una array bidimensional para el carton y otra array que sera la lista de números del 1 al 20 para asegurarnos de no repetir números
    	int [][] carton = new int [2][5];
    	 int[] numeros = new int[20];
    	 
    	 //En este bucle rellenamos la lista de números del 1 al 20
         for (int i = 0; i < 20; i++) {
             numeros[i] = i + 1;
         }
    	
         //on este bucle recorremos el carton
    	for (int i = 0; i<carton.length;i++) {
    		for (int j=0; j<carton[i].length;j++) {
    			//queremos que la primera fila sea solo números del 1-10 asi que le decimos que si nos encontramos en la primera fila rellena de la siguiente forma:
    			if (i==0) {
    				//haremos un bucle infinito ya que pediremos un número al azar de la lista creada anteriormente y queremos asegurarnos de que no se repita
    				while (true) {
    					//Generamos un número del 0 - 10
    					int num = (int)(Math.random()*10);
    					//verificamos que la posicion que generamos no este con un 0, que significa que ya ha sido usado ese número
        				if (numeros[num]!=0) {
        					//en caso de que no sea 0 meteremos ese número en el carton y lo convertimos en 0 para no volverlo a usar
        					carton[i][j]=numeros[num];
        					numeros[num]=0;
        					break;
        				}else {
        					//en caso de que sea 0 volver a repetir el bucle
        					continue;
        				}
    				}
    				//en caso de que pasemos a la 2da fila repetiremos el proceso pero con números del 11 al 20
    			} else {
    				while (true) {
    					int num = (int)(Math.random()*10+10);
        				if (numeros[num]!=0) {
        					carton[i][j]=numeros[num];
        					numeros[num]=0;
        					break;
        				}else {
        					continue;
        				}
    				}
    			}	
    		}
    	}
    	return carton;
    }

	// Esta función simula el juego de Bingo,
	// extrayendo números del bombo y verificando si
	// algún jugador ha completado su cartón.
	public static void jugarBingo(int[][] cartonJugador1, int[][] cartonJugador2, int[] bombo) {
		// A GENERAR!!!
		//Creamos un boolean para saber cuando paramos de generar números
		boolean jugar=true;
		//utilizamos un bucle para parar en el momento que 1 carton se haya completado
		while (jugar) {
			//creamos una variable para elegir una pos del bombo y otra para guardar el num del bombo
			int elegirNumBombo = (int) (Math.random() * 20);
			int numBombo = 0;
			//verificamos que la posicion elegida no contenga un 0 (si tiene un 0 es porque ya se ha usado ese número)
			if (bombo[elegirNumBombo] != 0) {
				//en caso de que no tenga el 0 utilizar ese número para jugar y convertirlo a 0 en el bombo
				numBombo = bombo[elegirNumBombo];
				bombo[elegirNumBombo] = 0;
				System.out.println("HA SALIDO: " + numBombo);
			} else {
				//en caso contrario volver al bucle para pedir otro número
				continue;
			}

			//con una condicional verificamos si el carton 1 ha completado su carton
			if (completoCarton(cartonJugador1, numBombo)) {
				//en caso de que este completo anunciamos ganador y convertimos el boolean en false para terminar en esta ronda
				System.out.println("Ha ganado el Jugador 1");
				jugar = false;
			}

			//repetimos el proceso con el carton del jugador 2 para ver si tambien ha completado el carton
			if (completoCarton(cartonJugador2, numBombo)) {
				System.out.println("Ha ganado el Jugador 2");
				jugar = false;
			}
		}
	}

	// Esta función verifica si un número
	// dado ha sido marcado en el cartón (reemplazado por 0),
	// lo que indica que el cartón está completo.
	// Retorna true si el cartón está completo, de lo contrario, retorna false.
	public static boolean completoCarton(int[][] carton, int numero) {
		// A GENERAR!!!
		
		//verificamos que el número dado este dentro del carton llamando a la funcion
		if (contieneNumero(carton, numero)) {
			//en caso afirmativo verificamos que al rellenar ese número si ha completado el carton
			return esCartonCompleto(carton);
		}
		//en caso contrario devolver false
		return false;
	}

	// Función para verificar si un cartón está completo.
	// Si todo el carton es 0 estará completo
	public static boolean esCartonCompleto(int[][] carton) {
		// A GENERAR!!!
		// miramos toda la array y si vemos algún número distinto a 0 devolver false
		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[i].length; j++) {
				if (carton[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
}
