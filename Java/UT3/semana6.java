/**
 * 
 */
package UT3;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author luigi
 *
 */
public class semana6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Datos
		Scanner sc = new Scanner(System.in);
		String palabra1;
		String palabra2;
		int salir = 1;
		
		do {
			//Leemos las 2 Palabras
			System.out.print("Por favor Introduzca la primera palabra:");
			palabra1 = sc.nextLine();
			System.out.print("Por favor Introduzca la segunda palabra:");
			palabra2 = sc.nextLine();
			
			//Ordenamos las letras de ambas palabras para igualarlas,
			//los pasamos de String a Char, ahi los ordenamos y despues lo volvemos pasar a String.
			char[] ordenar1 = palabra1.toCharArray();
			java.util.Arrays.sort(ordenar1);
			String palabraord1 = new String(ordenar1);
			
			char[] ordenar2 = palabra2.toCharArray();
			java.util.Arrays.sort(ordenar2);
			String palabraord2 = new String(ordenar2);
			
			
			System.out.println(palabraord1);
			System.out.println(palabraord2);
			
			//Ahora verificamos si son iguales
			if (palabraord1.equals(palabraord2)){
				System.out.println("Estas palabras SI son anagramas!");
			} else {
				System.out.println("Estas palabras NO son anagramas!");
			}
			
			System.out.println("Si desea salir pulse 0");
			salir = sc.nextInt();
			
			}while (salir != 0);
			
		}

	}
