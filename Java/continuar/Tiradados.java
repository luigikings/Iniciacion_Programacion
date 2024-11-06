package continuar;

import java.util.Random;
import java.util.Scanner;

public class Tiradados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de caras a jugar de 2 a 20");
		
		int caras = sc.nextInt();
		sc.nextLine();
		
		int result=0;
		
		result = rd.nextInt(0,caras+1);
		System.out.println("DADO DE "+caras+" CARAS: "+result);
		
		System.out.println("TIRAMOS EL DADO 100 VECES");
		
		int media =0;
		for(int i=0;i<100;i++) {
			result = rd.nextInt(1,caras+1);
			System.out.println("DADO DE "+caras+" CARAS: "+result);
			media = media + result;
		}
		System.out.println("La media es: "+media/100);
	}

}
