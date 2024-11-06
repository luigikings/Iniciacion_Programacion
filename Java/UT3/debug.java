/**
 * 
 */
package UT3;

/**
 * @author LuisDaSilva
 *
 */
public class debug {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 6;
		
		if (numero%2 == 0) {
			System.out.println("Es par");
		} else
			System.out.println("Es Impar");
		
		if (numero%10 == 0) {
			System.out.println("Es multiplo de 10");
		} else if (numero%2 == 0) {
			System.out.println("Es multiplo de 2");
		} else if (numero%3 == 0) {
			System.out.println("Es multiplo de 3");
		} else
			System.out.println("Ningun caso");
		
		if (numero%2 == 0 && numero%3 == 0 && numero%10 != 0) {
			System.out.println("Es multiplo de 2 y de 3 pero no de 0");
		} else
			System.out.println("Ningun caso");
		
		
			
		
		

	}

}
