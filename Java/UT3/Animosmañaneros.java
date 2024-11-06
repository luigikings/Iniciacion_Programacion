/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author LuisDaSilva
 *
 */
public class Animosmañaneros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaro variable
		int animo;
		Scanner sc= new Scanner(System.in);
		
		//Mostramos el menu
		do {
		System.out.println("¡Buenos Días! ¿Como se encuentra hoy?");
		System.out.println("Elige algunas de las siguientes opciones seleccionando el numero correspondiente:");
		System.out.printf("(1)Alegre - (2)Enfadado - (3)Triste - (4)Cansado - (5)Enfermo -- (6)Salir de la aplicación");
		
		//leemos del teclado
		animo = sc.nextInt();
		
		//switch para 6 casos
		switch (animo) {
		case 1:
			System.out.println("Bienvenido al Mundo");
			break;
		case 2:
			System.out.println("riete");
			break;
		case 3:
			System.out.println("uwu");
			break;
		case 4:
			System.out.println("toma cafe");
			break;
		case 5:
			System.out.println("paracetamol");
			break;
		case 6:
			System.out.println("adioooos!");
			break;
		default:
			System.out.println("Opcion incorrecta");
			break;
			
		}
		
		//volvemos a pintar menu si no igual a 6  
		}while (animo != 6);

	}
	
	 

}
