/**
 * 
 */
package UT3;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author luis
 *
 */
public class escalerareal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		Scanner sc = new Scanner(System.in);
		int[] numero = new int[4];
		int p1;
		int p2;
		int p3;
		int p4;
		int n1;
		int auxcon=0;
		int auxesca=0;
		int con=0;
		int escalera=0;
		int noesca = 0;
		
		
		//pedimos cartas
		System.out.println("Hola,Coloque el numero y el palo de su mano");
		do {
			System.out.println("Carta 1 numero: ('0' Para Salir)");
			numero[0] = sc.nextInt();

			//condicional si 0 Salir
			if (numero[0]!=0) {
				System.out.println("Carta 1 palo: (Coloque la letra correspondiente para el palo)");
				System.out.println("Picas:'1', Diamantes:'2', Treboles:'3', Corazones:'4'");
				p1 = sc.nextInt();
				
				System.out.println("Carta 2 numero:");
				numero[1] = sc.nextInt();
				System.out.println("Carta 2 palo: (Coloque la letra correspondiente para el palo)");
				System.out.println("Picas:'1', Diamantes:'2', Treboles:'3', Corazones:'4'");
				p2 = sc.nextInt();
				
				System.out.println("Carta 3 numero:");
				numero[2] = sc.nextInt();
				System.out.println("Carta 3 palo: (Coloque la letra correspondiente para el palo)");
				System.out.println("Picas:'1', Diamantes:'2', Treboles:'3', Corazones:'4'");
				p3 = sc.nextInt();
				
				System.out.println("Carta 4 numero:");
				numero[3] = sc.nextInt();
				System.out.println("Carta 4 palo: (Coloque la letra correspondiente para el palo)");
				System.out.println("Picas:'1', Diamantes:'2', Treboles:'3', Corazones:'4'");
				p4 = sc.nextInt();
				
				//ordenamos de menor a mayor
				Arrays.sort(numero);
			
				//condicional que todos sean del mismo palo
				if (p1==p2 && p2==p3 && p3==p4) {
					//condicional (sin numeros negativos y maximo numero el 13)
					if (numero[0]<14 && numero[1]<14 && numero[2]<14 && numero[3]<14 && numero[0]>0 && numero[1]>0 && numero[2]>0 && numero[3]>0) {
						//bucle con condicionales
						for(int i=0; i<3;i++) {
							//resto 1 numero con siguiente para ver si da -1(asi si entre ellas son escalera)
							n1 = numero[i] - numero[i+1];
							//condicional son escaleras entre los 2
							if(n1==-1) {
								escalera++;
								//condicional para cuando las 4 cartas son escaleras de por si
								if (escalera == 3) {
									auxesca = numero[i] + 2;
									//como la carta maxima es el 13 colocamos un 1 en caso de que se pase
									if (auxesca<14) {
										
									}
									else {
										System.out.println("Escalera con 1");
									}
								}
								
							}
							//condicional cuando hay 1 hueco de 1 de diferencia entre 2 cartas
							else if (n1==-2) {
								auxcon = numero[i] + 1;
								con++;
								//condicional en el caso de que haya mas de 1 hueco entre varias cartas EJ: 1-3 y 3-5
								if (con>1) {
									System.out.println("Escalera no posible, es necesaria mas de 1 carta!");
									noesca =1;
								}
							}
							//si nada se cumple entonces no hay escalera
							else {
								System.out.println("No se puede escalera");
								noesca=1;
							}
						}
						//pintamos en pantalla
						System.out.println("La mano queda es:");
						for(int i=0; i<numero.length;i++) {
							System.out.println(numero[i]);
							
							//condicional para cuando de por si son escaleras (se añade 1+ alto)
							if (escalera == 3 && i==3 && auxesca<14) {
								auxesca = numero[i] + 1;
								System.out.print("Se nesecita un:"+auxesca);
								//Condicional para colocar cual palo es necesario
								if (p1==1) {
									System.out.println(" De Picas");
								} else if(p1==2) {
									System.out.println(" De Diamantes");
								}else if(p1==3) {
									System.out.println(" De Treboles");
								}else if (p1==4) {
									System.out.println(" De Corazones");
								}
							}
							//condicional cuando sea escalera de por si pero se pasen de 13(se pone el 1)
							else if(auxesca>=14 && i==3) {
								System.out.print("Se nesecita un: 1");
								if (p1==1) {
									System.out.print(" De Picas");
								} else if(p1==2) {
									System.out.print(" De Diamantes");
								}else if(p1==3) {
									System.out.print(" De Treboles");
								}else if (p1==4) {
									System.out.print(" De Corazones");
								}
							}//condicional cuando falte 1 hueco rellenarlo
							else if(auxcon<14 && i==3 && noesca==0) {
								System.out.print("Se nesecita un:"+auxcon);
								if (p1==1) {
									System.out.print(" De Picas");
								} else if(p1==2) {
									System.out.print(" De Diamantes");
								}else if(p1==3) {
									System.out.print(" De Treboles");
								}else if (p1==4) {
									System.out.print(" De Corazones");
								}
							}
							//condicinal cualquier otro caso no hay escalera
							else if (i==3) {
								System.out.println("No se puede Escalera");
							}
						}
					
						
					}
					//condicional si se coloca un numero mayor de 13 o menor que 0
					else {
						System.out.println("Se ha equivocado introduciendo alguna carta!");
					}
				}
				else {
					System.out.println("No se puede Escalera, no son del mismo palo!");
				}
			} else {
				System.out.println("Adios!");
			}
			
		}while (numero[0]!=0);
	}

}
