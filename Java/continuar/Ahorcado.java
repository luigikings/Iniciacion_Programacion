package continuar;

import java.util.ArrayList;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos las vidas (intentos a jugar), letras jugadas (para no repetir), palabra elegida para jugar y la palabra vacia que se ira rellenando.
		Scanner sc = new Scanner(System.in);
		int vidas = 11;
		ArrayList<Character> letras = new ArrayList<Character>();
		ArrayList<Character> palabra = new ArrayList<Character>();
		ArrayList<Character> palabraJugar = new ArrayList<Character>();
		
		//llamamos la funcion para guarda 1 de las palabras elegidas por el usuario
		palabra = elegirPalabra(sc);
		//mostramos y ahora creamos una lista de caracteres con "_" del mismo tañamo que el otro
		System.out.println(palabra);
		palabraJugar = vaciarPalabraJugar(palabraJugar, palabra);
		
		//bucle de saltos de linea para mover la consola y no se vea la palabra
		for (int i = 0;i<40;i++) {
			System.out.println();
		}
		
		//Bucle que solo termina si nos quedamos sin vidas!
		System.out.println("Empezemos a jugar:");
		while (vidas != 0) {
			//mostramos las letras que ya se hayan jugado y la cantidad de vidad a jugar y tambien mostramos el ahorcado.
			System.out.println("Te quedan "+vidas+" vidas:");
			letrasJugadas(letras);
			palabraJugar = mostrarPalabraOculta(palabra, letras, palabraJugar);
			//si falla restar 1 vida, y si vidas llega a 0 avisar al usuario que perdio
			if(!intentarAdivinar(sc,palabra, letras)) {
				vidas--;
				if (vidas==0) {
					System.out.println("PERDISTE!!!!");
				}
			}
			//aqui verificamos que se haya completado la palabra a descubir en caso afirmativo el usuario a ganado y salimos el bucle
			if (verificarGanar(palabraJugar, palabra,letras)) {
				mostrarPalabraOculta(palabra, letras, palabraJugar);
				System.out.println("\nGANASTE!!!!");
				break;
			}
			System.out.println("------------------------------------------------------------------------------------");
		}
	}
	//Una funcion para que el usuario Introduzca 4 palabras y el ordenador eliga 1 al azar
	public static ArrayList<Character> elegirPalabra(Scanner sc) {
		ArrayList<String> listaPalabras = new ArrayList<String>();
		System.out.println("Escribe 4 palabras una por una:");
		
		//pedimos 4 palabras con un bucle y cada palabra la guardamos en 1 lista
		for (int i=1;i<=4;i++) {
			System.out.println("Palabra número "+i+":");
			String usuario = sc.nextLine();
			usuario=usuario.toUpperCase();
			listaPalabras.add(usuario);
		}
		
		//pedimos al ordenador un numero del 1 al 4 y que con ese numero eliga y se guarde la palbra segun la posicion de la lista
		int elegirAzar = (int)((Math.random()*3)+1);
		String palabra = listaPalabras.get(elegirAzar);
		ArrayList<Character> palabraJugar = new ArrayList<Character>();
		
		//rellenamos la lista con los caracteres del string de la palabra elegida y retornamos esa misma lista
		for (int i = 0; i < palabra.length(); i++) {
			palabraJugar.add(palabra.charAt(i));
		}
		
		return palabraJugar;
		
		
	}
	//funcion para ir mostrando la palabra oculta, de manera que las letras ya jugadas se muestren en la propia palabra
	public static ArrayList<Character> mostrarPalabraOculta(ArrayList<Character> palabra,ArrayList<Character> letras, ArrayList<Character> palabraJugar) {
		//bucle para mirar que cada letra jugadas esten detro de la palabra si es afirmativo entonces cambiar "_" por dicha letra
		for(int i=0; i<palabra.size();i++) {
			for(int j=0; j<letras.size();j++) {
				if (letras.get(j).equals(palabra.get(i))) {
					palabraJugar.set(i, letras.get(j));
				}
			}
		}
		
		//bucle para mostrar toda la palabra oculta
		for(int i=0;i<palabra.size();i++) {
			System.out.print(palabraJugar.get(i)+" ");	
		}
		return palabraJugar;
	}
	//funcion para que el usuario jugue introduciendo una letra
	public static boolean intentarAdivinar(Scanner sc,ArrayList<Character> palabra,ArrayList<Character> letras) {
		String usuario= "";
		char letra = ' ';
		
		//bucle infinito para asegurarnos que el usuario introduce una solo letra y no se haya jugado aun!
		while (true) {
			System.out.println("\nIntroduce una letra:");
			usuario = sc.nextLine();
			usuario=usuario.toUpperCase();
			
			//verificamos que solo tenga 1 caracter
			if(usuario.length()>1) {
				System.err.println("Introduce 1 solo caracter!!!!!!");
			}else {
				//guardamos ese string a char
				System.out.println(usuario);
				letra = usuario.charAt(0);
				//y verificamos que esa letra no se haya jugado antes en la lista de caracteres jugados
				if (letras.contains(letra)) {
					System.err.println("La letra introducida ya se ha jugado!!!!!!");
					
				//caso que este el resto bien salir del bucle
				} else{
					break;
				}
			}	
		}
		
		//añadimos dicha letra a lista de letras
		letras.add(letra);
		System.out.println("Jugamos la letra "+letra);
		
		//y verificamos si dicha letra introducida se encuentra en la lista de la palabra completa caso afirmativo return true
		if(palabra.contains(letra)){
			System.out.println("Correcto si tiene la letra!"); 
			return true;
		} else {
			//caso negativo return false
			System.out.println("Incorrecto no tiene esa letra");
			return false;
		}
		
		
		
		
	}
	//funcion para mostrar todas las letras jugadas
	public static void letrasJugadas(ArrayList<Character> letras) {
		if (letras.isEmpty()) {
			System.out.println("No has jugado ninguna letra aún");
		} else {
			System.out.println("Letras jugadas: "+letras);
		}
	}
	
	//funcion para la nueva lista de la palabraoculta rellenarla con "_"
	public static ArrayList<Character> vaciarPalabraJugar (ArrayList<Character> palabraJugar, ArrayList<Character> palabra){
		for (int i = 0; i<palabra.size();i++) {
			palabraJugar.add('_');
		}
		
		return palabraJugar;
	}
	//funcion para verificar si la palabraoculta es igual a la palabra elegida, si son iguales return true y el jugador habria ganado
	public static boolean verificarGanar (ArrayList<Character> palabraJugar, ArrayList<Character> palabra,ArrayList<Character> letras) {
		
		//bucle para rellenar la palabra oculta con las letras jugadas en su posicion correspondiente
		for(int i=0; i<palabra.size();i++) {
			for(int j=0; j<letras.size();j++) {
				if (letras.get(j).equals(palabra.get(i))) {
					palabraJugar.set(i, letras.get(j));
				}
			}
		}
		
		//bucle para comprobar si de las 2 palabras son distintas si se encuentra 1 letra distinta retornar false.
		for (int i=0; i<palabra.size();i++) {
			if(!palabra.get(i).equals(palabraJugar.get(i))) {
				return false;
			}
		}
		return true;
	}
}
