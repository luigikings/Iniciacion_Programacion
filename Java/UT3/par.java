/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Luis Da Silva
 *
 */
public class par {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos Variables:
		int n1;
		Scanner sc= new Scanner(System.in);
		
		//pedimos el numero:
		System.out.println("por favor, introduce un numero");
		n1 = sc.nextInt();
		
		//Condicional (If) si es par o no
		if (n1%2==0){
			
			System.out.println("es par");
			
		} else {
			
			System.out.println("es impar");	
		}

	}

}
