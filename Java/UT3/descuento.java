/**
 * 
 */
package UT3;

import java.util.Scanner;


/**
 * @author LuisDaSilva
 *
 */
public class descuento {

	/**
	 * @param args
	 */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaro variable
		float importe;
		Scanner sc= new Scanner(System.in);
		
		//Pido importe
		System.out.println("Coloce su importe y le daremos el total a pagar");
		importe = sc.nextInt();
		
		if (importe >= 200) {
			System.out.printf("Debe pagar: %.2f",importe * 0.8);
		} 
		else if (importe >= 100 && importe < 200) {
			System.out.printf("Debe pagar: %.2f",importe * 0.9);
		}
		else {
			System.out.printf("No aplica descuento: %.2f",importe);
		}

	}

}
