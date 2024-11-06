package continuar;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declaramos una arraylist
		ArrayList<String> arrayList = new ArrayList<String>();
		List<Integer> lista = new ArrayList<Integer>();
		
		//añadir un elemento
		arrayList.add("txt 1");
		arrayList.add("txt 2");		
		arrayList.add("txt 3");		
		arrayList.add("txt 4");		
		arrayList.add("txt 5");
		arrayList.add("txt 6");
		
		//añadir elemento en un indice
		arrayList.add(3, null);
		//arrayList.add(10,"aaa");
		
		
		//Mostrar lista completa
		System.out.println("ARRAY LIST COMPLETA: "+arrayList);
		
			
		//buscar un dato en concreto
		System.out.println("\nEN LA POSICION 2 TENEMOS: "+arrayList.get(2));
		
		//mirar tamaño de la array
		System.out.println("\nEL TAMAÑO DE LA LISTA ES: "+arrayList.size());
		
		//Aqui sustiuimos una posicion de la lista
		arrayList.set(0,"NUEVO TXT");
		System.out.println("\nAHORA LA POSICION 0 CAMBIO: "+arrayList);
		
		//Aqui limpiamos toda la lista
		arrayList.clear();
		System.out.println("\nAHORA LA LISTA ESTA VACIA"+arrayList);
		
		//Verificar si la lista esta vacia (Devuelve un true o false)
		System.out.println("\nLA LISTA ESTA VACIA??? :"+arrayList.isEmpty());
		
		//Mirar si la lista contiene algo en especifico
		System.out.println("\nDENTRO DE LA LISTA CONTIENE (\"Hola buenos días\") :"+arrayList.contains("Hola buenos días"));
		
		//Miramos en que posicion de la lista esta el siguiente elemento (si no esta pondra -1)
		//tener en cuenta que si esta repetido te mostrara la posicion del primero que encuentre
		System.out.println(arrayList.indexOf("aaaaaa"));
		
		arrayList.add("txt 1");
		arrayList.add("txt 2");		
		arrayList.add("txt 3");		
		arrayList.add("txt 4");		
		arrayList.add("txt 5");
		arrayList.add("txt 6");
		
		System.out.println("\ntxt 3 se encuentra en la posicion: "+arrayList.indexOf("txt 3"));
		arrayList.add("txt 5");
		System.out.println("\n txt 5 se encuentra en la posicion: "+arrayList.indexOf("txt 5"));
		//si queremos empezar desde atras ponemos lastIndexOf
		System.out.println("\n txt 5 se encuentra desde el final en la posicion"+arrayList.lastIndexOf("txt 5"));
		
		
		
		
		
		
		
		
		
		

	}

}
