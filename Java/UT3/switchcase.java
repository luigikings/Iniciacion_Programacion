/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author LuisDaSilva
 *
 */
public class switchcase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Escriba un numero del 1-7");
	 int dia = entrada.nextInt();
	 
	 switch (dia) {
	 	case 1:
	 		System.out.println("Lunes");
	 		break;
	 	case 2:
	 		System.out.println("Martes");
	 		break;
	 	case 3:
	 		System.out.println("Miercoles");
	 		break;
	 	case 4:
	 		System.out.println("Jueves");
	 		break;
	 	case 5:
	 		System.out.println("Viernes");
	 		break;
	 	case 6:
	 		System.out.println("Sabado");
	 		break;
	 	case 7:
	 		System.out.println("Domingo");
	 		break;
	 	default:
	 		System.out.println("Dia de la semana incorrecto");
	 }

	}

}
