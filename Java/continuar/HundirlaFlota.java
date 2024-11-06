package continuar;

import java.util.Random;

public class HundirlaFlota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		char[][] tablero = new char[5][5];
		
		tablero = generarTablero(tablero, rd);
		mostrarTablero(tablero);
		
		
	}
	public static char[][] generarTablero (char[][] tablero,Random rd) {
		
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				tablero[i][j]='-';
			}
		}
		for(int i=1;i<=5;i++) {
			int posx = rd.nextInt(5);
			int posy = rd.nextInt(5);
			
			if(tablero[posx][posy]=='-') {
				tablero[posx][posy]='X';
			}else {
				i--;
			}
		}
		for(int i=1;i<=5;i++) {
			int posx = rd.nextInt(5);
			int posy = rd.nextInt(5);
			
			if(tablero[posx][posy]=='-') {
				tablero[posx][posy]='O';
			}else {
				i--;
			}
		}
		
		return tablero;
	}
	
	
	public static void mostrarTablero (char[][] tablero) {
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				System.out.print(tablero[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static char[][] disparo (char[][] tablero,Random rd){
		
		
		return tablero;
	}
}
