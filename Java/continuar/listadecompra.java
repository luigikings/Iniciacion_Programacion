package continuar;

import java.util.ArrayList;
import java.util.Scanner;

public class listadecompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> carrito = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String usuario = "";
		boolean salir = true;
		
		//Iniciamos un bucle en donde siempre que salir sea true nos mantendremos en el
		System.out.println("VAMOS DE COMPRAS:");
		while (salir) {
			System.out.println("Elige una de estas 4 opciones:");
			System.out.println("1)Añadir al carrito \n2)Eliminar producto \n3)Mostrar carrito\n4)Salir");
			//Mostramos al usuario un menu de 4 opciones y le pedimos que eliga 1 colocando el numero correspondiente
			usuario = sc.nextLine();
			
			//como es un menu usaremos un switch de las 4 opciones y en caso de que se equivoque indicarlo y se reinicia el bucle 
			switch (usuario) {
			//caso 1 ir a la funcion añadir al carrito
			case "1": 
				añadirCarrito(carrito);
				break;
			//caso 2 ir a la funcion eliminar Producto
			case "2": 
				eliminarProducto(carrito);
				break;
			//caso 3 ir a la funcion que muestra el carrito
			case "3": 
				mostrarCarrito(carrito);
				break;
			//caso 4 cambiamos el boolean salir a false y terminarie el bucle
			case "4": 
				salir = false;
				break;
			//cualquier otro dato avisar del error
			default:
				System.err.println("TE HAS EQUIVOCADO VUELVE A INTRODUCIR");
			}
		}
		//Al salir mostramos el carrito
		System.out.println("ADIOS!");
		System.out.println(carrito);

	}
	
	//En esta funcion añadiremos un producto al carrito, pedimos al usuario que lo escriba y comprobamos todo para poder añadirlo 
	public static void añadirCarrito (ArrayList<String> carrito) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ESCRIBE QUE ARTICULO DESEAS AÑADIR");
		//pedimos al usuario que producto quiere añadir
		String usuario = sc.nextLine();
		//usamos esta funcion para convertir todo texto dado con la primera letra en mayuscula y el resto en miniscula (asi queda mas bonito)
		usuario = textoHermoso(usuario);
		//verificamos que lo añadido al carrito no este dentro en caso de que este entonces avisarle y pedirle otra vez un producto a añadir 
		if (carrito.contains(usuario)) {
			System.out.println("El producto ya se encuentra en el carrito");
			añadirCarrito(carrito);
		} else {
			carrito.add(usuario);
			System.out.println("AÑADIDO");
		}
	}
	//En esta funcion eliminaramos un producto del carrito, pedimos al usuario que escriba el producto a eliminar y verificamos que este
	public static void eliminarProducto (ArrayList<String> carrito) {
		Scanner sc = new Scanner(System.in);
		//primero miramos si el carrito no esta vacio, si no esta vacio entonces seguimos con la funcion, en caso contrario avisar al usuario y regresar 
		if (!carrito.isEmpty()) {
			//mostramos el carrito
			mostrarCarrito(carrito);
			System.out.println("ESCRIBE QUE ARTICULO DESEAS ELIMINAR");
			//pedimos al usuario que escriba el nombre
			String usuario = sc.nextLine();
			//convertimos al mismo tipo de texto que se ingresa
			usuario=textoHermoso(usuario);
			//en caso de que este dentro de la lista eliminarlo y avisarlo en casp contrario decir que no se encuentra en la lista y volver a pedi
			if (carrito.contains(usuario)) {
				carrito.remove(carrito.indexOf(usuario));
				System.out.println("ELIMINADO");
			} else {
				System.err.println("NO SE ENCUENTRA EN LA LISTA REPITE");
				eliminarProducto(carrito);
			}
		}else {
			System.err.println("CARRITO VACIO");
		}
	}
	//funcion para mostrar el carrito
	public static void mostrarCarrito(ArrayList<String> carrito) {
		System.out.println("--------------------------------");
		System.out.println("CARRITO:");
		//verificamos que el carrito no este vacio, si no esta vacio mostrar la lista de forma enumerada
		if (!carrito.isEmpty()) {
			for(int i=0;i<carrito.size();i++) {
				int num= i+1;
				System.out.println(num+") "+carrito.get(i));
			}
		}else {
			System.err.println("CARRITO VACIO");
		}
		System.out.println("--------------------------------");
		
	}
	//Funcion para convertir todo texto en minuscula y la primera letra en mayuscula
	public static String textoHermoso (String usuario) {
		usuario=usuario.toLowerCase();
		char car = usuario.charAt(0);
		car = Character.toUpperCase(car);
		String txt1= car+"";
		
		for(int i =1;i<usuario.length();i++) {
			txt1+=usuario.charAt(i);
		}
		return txt1;
	}
	
}
