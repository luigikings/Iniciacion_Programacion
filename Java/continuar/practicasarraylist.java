package continuar;

import java.util.ArrayList;

public class practicasarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(1);
		lista.add(4);
		lista.add(5);
		lista.add(66);
		lista.add(7777);
		lista.add(3);
		lista.add(1);
		lista.add(5555);
		lista.add(7777);
		
		System.out.println(lista);
		
		for(int i=0; i<lista.size();i++) {
			System.out.println("numero en la posición "+i+": "+lista.get(i));
		}
		
		System.out.println("-------------------------------------------");
		int pos=0;
		for (int aux: lista) {
			System.out.println("numero:en la posición "+pos+": "+aux);
			pos++;
		}
		
		
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		lista1.add(2);
		lista1.add(2);
		lista1.add(2);
		lista1.add(6);
		lista1.add(7722);
		lista1.add(77);
		
		//System.out.println(lista1);
		//Borramos todos los números dado de la lista
		//borrarnumeros(lista1, 1);
		//System.out.println(lista1);
		
		
		//borramos todos los números 2 en caso de que este repetido
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		lista2.add(1);
		lista2.add(2);
		lista2.add(3);
		lista2.add(4);
		lista2.add(5);
		lista2.add(6);
		lista2.add(7);
		lista2.add(8);
		lista2.add(8);
		lista2.add(2);
		lista2.add(2);
		lista2.add(1);
		lista2.add(1);
		lista2.add(8);
		
		
		System.out.println(lista2);
		borrarTodosRepetidos(lista2);
		System.out.println(lista2);
		
		//borrar todos los repetidos
		
		
	}
	public static void borrarTodosRepetidos (ArrayList<Integer> lista) {
		int max = lista.get(0);
		int min = lista.get(0);
		
		//bucle para ver el número mas grande y pequeño de la lista
		for(int aux: lista) {
			if(aux > max) {
				max = aux;
			}
			
			if (aux < min) {
				min = aux;
			}
		}		
		
		//bucle que mire todos los números del minimo al maximo
		for(int i=min;i<=max;i++) {
			//miramos por delante y por detras, en caso de ser la misma posicion solo esta 1 vez por lo que no se repite
			if (lista.indexOf(i)!=lista.lastIndexOf(i)) {
				//bucle infinito que borre todos los repetidos hasta que no haya más
				while (true) {
					if (lista.contains(i)) {
						lista.remove(lista.indexOf(i));
					}else {
						break;
					}
				}
			}
		} 
	}
	
	//Funcion para borrar los numeros de una lista si esta repetido
	public static void borrarRepetido (ArrayList<Integer> lista,int numero) {
		//miramos por delante y por detras, en caso de ser la misma posicion solo esta 1 vez por lo que no se repite
		if (lista.indexOf(numero)!=lista.lastIndexOf(numero)) {
			//bucle infinito que borre todos los repetidos hasta que no haya más
			while (true) {
				if (lista.contains(numero)) {
					lista.remove(lista.indexOf(numero));
				}else {
					break;
				}
			}
		}
	}
	
	//función para borrar todos los números del entero dado
	public static void borrarnumeros (ArrayList<Integer> lista,int numero) {
		while(lista.indexOf(numero)!= -1) {
			lista.remove(lista.indexOf(numero));
		}
	}
}
