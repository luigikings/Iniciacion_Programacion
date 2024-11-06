/**
 * 
 */
package UT3;

import java.util.Scanner;
/**
 * @author luigi
 *
 */
public class Ejercicio38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Dibujar un cuadrado con * pidiendole al usuario el numero de * por lado,  
		//pero solo pintando los * pares en las lineas pares y los impares en las impares 
		
		Scanner sc = new Scanner (System.in);
		int lado;
		
		System.out.println("Introduzca el lado del cuadrado");
		lado = sc.nextInt();
		
		for(int i = 1; i <= lado; i++) {
			for(int j = 1; j <= lado; j++) {
				if(i%2==0) {
					if (j%2==0) {
						System.out.printf("* ");
					} else {
						System.out.printf(" ");
					}
				}else {
					if (j%2 == 0)
						System.out.printf(" ");
					else
						System.out.printf("* ");
				}
				
			}
			System.out.printf("\n");
			
		}
	}

}
