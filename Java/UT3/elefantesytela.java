/**
 * 
 */
package UT3;

import java.util.Scanner;
/**
 * @author LuisDaSilva
 *
 */
public class elefantesytela {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Datos
		Scanner sc = new Scanner(System.in);
		int tela;
		int i;
		int suma;
		int elefante = 0;
		
		
		 do {
			//Pregunto cuanto aguanta la tela 
			 System.out.println("Si desea salir introduzca '0'");
			 System.out.println("Cuanto peso aguanta la tela?");
			 tela = sc.nextInt();
			 i = 0;
			 suma = 0;
			 
			 //Condicionsl distinto de 0
			 if (tela != 0) {
				 do {
					//Pregunto cuanto pesa los elefantes
					 i++;
					 System.out.println("Si desea salir introduzca '0'");
					 System.out.println("Cuanto pesa el elefante numero "+i);
					 elefante = sc.nextInt();
					 
					 //sumo y acumulo el peso de los elefantes
					 suma = suma + elefante;
					 
					 //condicional si suma es mas que tela se rompe la tela
					 if (suma > tela) {
						 System.out.println("Ya no aguanta!");
					 }
					//condicional si colocase 0 para salir
					 if (elefante == 0) {
						 System.out.println("La tela aguanto!");
						 
					 }
				 }while (suma <= tela && elefante != 0);
			 }
			 
			 
		 }while (tela != 0 && elefante != 0);
		 System.out.println("adios!");
			 
		
	}

}