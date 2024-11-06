/**
 * 
 */
package Examenprogramacion;

import java.util.Random;
import java.util.Scanner;
/**
 * @author luigi
 *
 */
public class Examen1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Variables:
		Scanner entrada = new Scanner(System.in);
		int[] taquillas = new int[10];
		int NumeroMenu;
		int salir = 1;
		int j = 0;
		int aux;
		Random aleatorio = new Random();
		int elegir;
		
		//Rellenamos la Array con 0 y 1
		for(int i=0; i<taquillas.length;i++) { 
 			taquillas[i] = j;
 			aux = aleatorio.nextInt(2);
 			taquillas[i] = aux;
		}
		
		//Bucle con while do
		do {
			
			//menu:
			System.out.println("Hola, Tenemos 10 taquillas:");
			System.out.println("Elige si desea Abrir taquilla presione '2', Si desea cerrar presione '1' y si desea salir presione '0' (Se mostraran las taquillas");
			NumeroMenu = entrada.nextInt();
			int cont = 0;
			//cerrar taquilla
		 	if (NumeroMenu == 1) {
		 		System.out.println("Cerramos 1 taquilla");
		 		for(int i=0; i<taquillas.length;i++) {
		 			//mostramos toda la array si tiene 0 esta abierta, si pone 1 esta cerrada.
		 			if (taquillas[i] == 0) {
		 				System.out.println("Taquilla numero:" + cont + ": esta ABIERTA");
			 			cont ++;
		 			} else {
		 				System.out.println("Taquilla numero:" + cont + ": esta CERRADA");
			 			cont ++;
		 			}
		 		}
		 			System.out.println("Eliga que taquilla quiere cerrar (numero de la taquilla)");
		 			elegir = entrada.nextInt();
		 			//verificamos si ya esta cerrada
		 			if (taquillas[elegir] == 0) {
		 				System.out.println("Cerramos taquilla");
		 				taquillas[elegir] = 1;
		 			} else {
		 				System.out.println("Ya esta cerrada!");
		 			}
		 	}
		 	//abrir taquilla
		 	else if (NumeroMenu == 2) {
		 		System.out.println("Abrimos 1 taquilla");
		 		for(int i=0; i<taquillas.length;i++) {
		 			//mostramos toda la array si tiene 0 esta abierta, si pone 1 esta cerrada.
		 			if (taquillas[i] == 0) {
		 				System.out.println("Taquilla numero:" + cont + ": esta ABIERTA");
			 			cont ++;
		 			} else {
		 				System.out.println("Taquilla numero:" + cont + ": esta CERRADA");
			 			cont ++;
		 			}
		 			System.out.println("Eliga que taquilla quiere abrir (numero de la taquilla)");
		 			elegir = entrada.nextInt();
		 			//verificamos si ya esta abierta
		 			if (taquillas[elegir] == 1) {
		 				System.out.println("Abrimos taquilla");
		 				taquillas[elegir] = 0;
		 			} else if(taquillas[elegir] == 0) {
		 				System.out.println("Ya esta Abierta!");
		 			}
		 		}
		 	}
		 	//salir
		 	else if(NumeroMenu == 0) {
		 		for(int i=0; i<taquillas.length;i++) {
		 			if (taquillas[i] == 0) {
		 				System.out.println("Taquilla numero:" + cont + ": esta ABIERTA");
			 			cont ++;
		 			} else {
		 				System.out.println("Taquilla numero:" + cont + ": esta CERRADA");
			 			cont ++;
		 			}
		 		}
		 		salir = 0;
		 	//Numero equivocado
		 	} else
		 		System.out.println("Ups, se ha equivocado de numero ");
			
		} while (salir != 0);
		
		System.out.println("Adios!");
	 		
		

	}

}
