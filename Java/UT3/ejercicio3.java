/**
 * 
 */
package UT3;

import java.util.Scanner;


/**
 * @author Luis Da Silva
 *
 */
public class ejercicio3 { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para pedir datos al usuario nesecito una variable tipo Scanner
		//En este cso la llamo "sc" pero podria llamarle de cualquier modo.
		Scanner sc= new Scanner(System.in);
		
		System.out.println("por favor, introduce un numero");
		
		
		//Guardo en la variable numero lo que  el usuario introduzca por teclado
		int numero = sc.nextInt();
		
		System.out.print("El numero introducido es: ");
		System.out.println(numero);
 
	}

}
