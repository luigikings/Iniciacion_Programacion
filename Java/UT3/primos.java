/**
 * 
 */
package UT3;

import java.util.Scanner;
/**
 * @author LuisDaSilva
 *
 */
public class primos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Datos
		Scanner sc = new Scanner(System.in); 
        int numero; 
        int contador; 
        int i;
        int j;
         
        System.out.println("Escribe un numero:"); 
        numero = sc.nextInt(); 
        
        for(i = 1; i <= numero; i++) {
        	contador = 0;
        	for (j = 1; j <= i ; j++) {
        		
        		if((i % j)==0) {
        			contador++;	
                }
        		
                }
        	if(contador <= 2) { 
                System.out.println(i); 
            } 	
        }
    } 
} 