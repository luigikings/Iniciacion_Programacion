/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author luigi
 *
 */
public class Ejercicio81c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int n1;
		int n2;
		int intervalo;
		
		
		System.out.println("Introduzca el primer numero:");
		n1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo numero:");
		n2 = sc.nextInt();
		
		System.out.println("Introduzca el intervalo");
		intervalo = sc.nextInt();
		
		int array1[] = new int [(n2 - n1)/intervalo + 1];
		for (int i = n1, j = 0; i <= n2; i=i+intervalo, j++) {
			array1[j]=i;
			
			
		}
				
	}

}
