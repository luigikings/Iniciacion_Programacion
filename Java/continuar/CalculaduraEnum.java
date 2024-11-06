package continuar;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculaduraEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		// declaramos la lista de números, el scanner y un booleano para salir del
		// programa
		ArrayList<Integer> listaNum = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		boolean salir = true;

		// Creamos un bucle que muestre el menú siempre que el usuario todavia no
		// seleccione para salir
		while (salir) {
			// mostramos las 4 opciones posibles y que el usuario eliga poniendo un numero
			System.out.println("Elige una de estas 4 opciones:");
			System.out.println("1)Añadir número a la lista \n2)Mostrar lista de números \n3)Calcular operacion con la lista\n4)Salir\n5)Limpiar Lista");

			// recogemos la opcion del usuario
			String usuario = sc.nextLine();
			MenuCalculadora opcion = convertirMenu(usuario);
			
			if (opcion == null) {
				System.err.println("NO FUNCIONA ESE NUMERO");
				continue;
			} 
			

			// utilizamos un switch para el menu para cada uno de los 4 casos, en caso que
			// el usuario coloque otra cosa notificar y empezaria el bucle
			switch (convertirMenu(usuario)) {
			// en caso 1 llamar la funcion a;adir numero
			case AÑADIR:
				añadirnumero(sc, listaNum);
				break;
			// en caso 2 llamar la funcion para mostrar la lista
			case MOSTRARLISTA:
				mostrarLista(listaNum);
				break;
			// en caso 3 llamar la funcion para hacer una operación con la lista
			case OPERACION:
				operacionLista(sc, listaNum);
				break;
			// en caso 4 cambiar el boolean salir a false y despedirse del usuario
			case SALIR:
				salir = false;
				System.out.println("ADIOS");
				break;
			case LIMPIAR:
				if (!listaNum.isEmpty()) {
					listaNum.clear();
					System.out.println("LISTA LIMPIADA");
					System.out.println();
					break;
				}
				System.err.println("LA LISTA YA ESTA VACIA");
				System.out.println();
				break;
			default:
				System.err.println("TE HAS EQUIVOCADO VUELVE A INTRODUCIR");
				System.out.println();
			}
		}
		System.out.println(listaNum);
		sc.close();
	}
	
	public static MenuCalculadora convertirMenu (String usuario) {
		MenuCalculadora opcion = null;
		
		switch (usuario) {
		case "1":
			opcion = MenuCalculadora.AÑADIR;
			break;
		case "2":
			opcion = MenuCalculadora.MOSTRARLISTA;
			break;
		case "3":
			opcion = MenuCalculadora.OPERACION;
			break;
		case "4":
			opcion = MenuCalculadora.SALIR;
			break;
		case "5":
			opcion = MenuCalculadora.LIMPIAR;
			break;
		default:
		}
		return opcion;
	}
	
	public static Operacion convertirOperacion (String usuario) {
		Operacion opcion = null;
		switch (usuario) {
		case "1":
			opcion = Operacion.SUMAR;
			break;
		case "2":
			opcion = Operacion.RESTAR;
			break;
		case "3":
			opcion = Operacion.MULTIPLICAR;
			break;
		case "4":
			opcion = Operacion.DIVIDIR;
			break;
		case "5":
			opcion = Operacion.POTENCIA;
			break;
		default:
			
		}
		return opcion;
	}

	// En esta funcion a;adiremos un numero a la lista
	public static void añadirnumero(Scanner sc, ArrayList<Integer> listaNum) {
		System.out.println("ESCRIBE QUE NÚMERO DESEAS AÑADIR");
		int usuario = 0;

		// le pedimos al usuario que nos de un numero por lo que colocamos un try para
		// que en caso de que se equivoque y salte una
		// excepcion volver a pedir un numero

		try {
			usuario = sc.nextInt();
			sc.nextLine();
		} catch (Exception e) {
			// TODO: handle exception

			// en caso de que el usuario sea tonto y no nos de un numero entonces volver a
			// llamar la funcion y lanzar un return
			// para que no utilize el valor iniciado

			System.err.println("ERROR, TIENE QUE INTRODUCIR UN NUMERO ENTERO");
			sc.nextLine();
			añadirnumero(sc, listaNum);
			return;
		}

		// añadimos el numero a la lista
		listaNum.add(usuario);
		System.out.println("///////////////////////");
		System.out.println("AÑADIDO " + usuario);
		System.out.println("///////////////////////");
		System.out.println();
	}

	// en esta función mostramos la lista de numeros
	public static void mostrarLista(ArrayList<Integer> listaNum) {
		// con esta condicional miramos si no esta vacia en caso contrario indicar que
		// esta vacia y volver al menu inicial
		if (!listaNum.isEmpty()) {
			System.out.println("///////////////////////");
			System.out.println("LISTA:");
			for (int i = 0; i < listaNum.size(); i++) {
				System.out.print(listaNum.get(i) + " ");
			}
		} else {
			System.err.println("LISTA VACIA");
			return;
		}
		System.out.println("");
		System.out.println("///////////////////////");
		System.out.println();
	}

	// en esta función le preguntaremos al usuario que operacion quiere hacer:
	// sumar, restar,multiplicar y dividir
	public static void operacionLista(Scanner sc, ArrayList<Integer> listaNum) {
		// igual que antes verificamos que la lista este vacia si es el caso notificar y
		// volver a mandar al meni inicial.
		if (listaNum.isEmpty()) {
			System.err.println("LISTA DE NÚMEROS VACÍA, AGREGA NUMEROS PRIMERO");
			return;
		}
		Operacion opcion = null;
		// mostramos la lista y pedimos que operacion quiere hacer el usuario
		while (true){
			mostrarLista(listaNum);
			System.out.println("Juguemos con la lista: que quieres hacer?");
			System.out.println("1)SUMAR \n2)RESTAR \n3)MULTIPLICAR \n4)DIVIDIR \n5)POTENCIA");
			String usuario = sc.nextLine();
			opcion = convertirOperacion(usuario);
			
			if (opcion == null) {
				System.err.println("ERROR OPCION MAL ESCOGIDA");	
			} else {
				break;
			}
		}
		
		
		
		// con otro switch a modo de menú ejecutamos según lo pedido el usuario en caso
		// que haya colocado otra cosa notificar y volver a pedir
		switch (opcion) {
		// en caso 1 sumaremos todos los números y guardaremos en un long (para
		// asegurarnos lo mas posible del tama;o del resultado)
		case SUMAR:
			long numSuma = sumarLista(listaNum);
			System.out.println("//////////////////////////////////////////////////////////////////");
			System.out.println("El resultado de la suma es: " + numSuma);
			System.out.println("//////////////////////////////////////////////////////////////////");
			System.out.println();
			break;
		// en caso 2 restamos todos los números y guardaremos en un long (para
		// asegurarnos lo mas posible del tama;o del resultado)
		case RESTAR:
			long numResta = restarLista(listaNum);
			System.out.println("/////////////////////////////////////////////////////////////////");
			System.out.println("El resultado de la resta es: " + numResta);
			System.out.println("/////////////////////////////////////////////////////////////////");
			System.out.println();
			break;
		// en caso 3 multiplicaremos todos los números y guardaremos en un long (para
		// asegurarnos lo mas posible del tama;o del resultado)
		case MULTIPLICAR:
			long numMultiplica = multiplicarLista(listaNum);
			System.out.println("/////////////////////////////////////////////////////////////////");
			System.out.println("El resultado de la multiplicacion es: " + numMultiplica);
			System.out.println("/////////////////////////////////////////////////////////////////");
			System.out.println();
			break;
		// en caso 4 primero verificamos si la lista tiene un 0, como no es posible una
		// division entre 0 notificamos al usuario
		// y regresaremos al menú inicial, en caso contrario dividiremos todos los
		// numeros y guardamos el resultado en un float
		case DIVIDIR:
			if (listaNum.contains(0)) {
				System.err.println("No se puede realizar la división ya que la lista tiene al menos un 0");
				System.out.println();
				break;
			}
			double numDividir = dividirLista(listaNum);
			System.out.println("/////////////////////////////////////////////////////////////////");
			System.out.println("El resultado de la division es: " + numDividir);
			System.out.println("/////////////////////////////////////////////////////////////////");
			System.out.println();
			break;
		// en caso 5 ahora las potencias del siguiente número hasta el final
		case POTENCIA:
			double numExponente = exponenteLista(listaNum);
			System.out.println("/////////////////////////////////////////////////////////////////");
			System.out.println("El resultado de potencia en la lista es: " + numExponente);
			System.out.println("/////////////////////////////////////////////////////////////////");
			System.out.println();
			break;
		default:
			System.err.println("TE HAS EQUIVOCADO VUELVE A INTRODUCIR");
			System.out.println();
			operacionLista(sc, listaNum);
		}
	}

	// función para sumar todos los números de una lista
	public static long sumarLista(ArrayList<Integer> listaNum) {
		long numSuma = listaNum.get(0);
		for (int i = 1; i < listaNum.size(); i++) {
			numSuma += listaNum.get(i);
		}
		return numSuma;
	}

	// función para restar todos los números de una lista
	public static long restarLista(ArrayList<Integer> listaNum) {
		long numResta = listaNum.get(0);
		for (int i = 1; i < listaNum.size(); i++) {
			numResta -= listaNum.get(i);
		}
		return numResta;
	}

	// función para multiplicar todos los números de una lista
	public static long multiplicarLista(ArrayList<Integer> listaNum) {
		long numMultiplicar = listaNum.get(0);
		for (int i = 1; i < listaNum.size(); i++) {
			numMultiplicar = numMultiplicar * listaNum.get(i);
		}
		return numMultiplicar;
	}

	// función para dividir todos los números de una lista
	public static double dividirLista(ArrayList<Integer> listaNum) {
		double numDividir = listaNum.get(0);
		for (int i = 1; i < listaNum.size(); i++) {
			numDividir = numDividir / listaNum.get(i);
		}
		return numDividir;
	}

	// función para hacer potencia con todos los números de una lista
	public static double exponenteLista(ArrayList<Integer> listaNum) {
		double numExponente = listaNum.get(0);
		for (int i = 1; i < listaNum.size(); i++) {
			numExponente = Math.pow(numExponente, listaNum.get(i));

		}
		if (Double.isInfinite(numExponente)) {
			System.out.println("FUERA DE RANGO PAPI");
		}
		return numExponente;
	}
}
