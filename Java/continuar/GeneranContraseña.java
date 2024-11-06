package continuar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GeneranContraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		String txt1 = "qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXCVBNM<>1234567890'¡!·$%&/()=?¿^¨Ç*_:;ºª|@#~€¬7890'¡";
		
		System.out.println("Introduce la longitud de la contraseña:");
		int longitud = sc.nextInt();
		sc.nextLine();
		String contraseña = "";
		
		while(true) {
			contraseña = "";
			int contnum=0;
			int contletra=0;
			int contsimb=0;
			
			for(int i=0;i<longitud;i++) {
				
				char carcontra = txt1.charAt(rd.nextInt(0,100));
				
				if (Character.isDigit(carcontra)) {
					contnum++;
				} else if(Character.isLetter(carcontra)) {
					contletra++;
				}else {
					contsimb++;
				}
				
				contraseña = contraseña + carcontra;
			}
			if (contnum >= 3 && contletra >= 3 && contsimb >=3) {
				break;
			}
		}
		System.out.println(contraseña);
		System.out.println(contraseña.length());
		
		while(true) {
			try {
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
