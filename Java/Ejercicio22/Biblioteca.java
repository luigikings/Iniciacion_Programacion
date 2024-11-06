/**
 * 
 */
package Ejercicio22;

import java.util.Scanner;
/**
 * @author luigi
 *
 */
public class Biblioteca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		Scanner entrada = new Scanner(System.in);
		int opcion;
		int salir = 1;
		String titulo;
		String autor;
		int ejemplares;
		int prestados;
		int consultar;
		int eliminar;
		int prestar;
		libro libro1=new libro("la casa de la pradera","chiquito de la calzada",10,9);
		libro libro2=new libro("el ultimo mohicano","kiko rivera",5,4);
		libro libro3=new libro();
		
		
		//menu
		do {
			System.out.println("Por favor eliga 1 de estas opciones introduciendo el numero correspondiente:");
			System.out.println("1: Alta libro");
			System.out.println("2: Consulta libro");
			System.out.println("3: Baja libro");
			System.out.println("4: Prestamo de libro");
			System.out.println("0: Salir");
			opcion = entrada.nextInt();
			
			if (opcion == 1) {
				System.out.println("Dime el nombre de tu libro: ");
				libro3.setTitulo(entrada.next());
				System.out.println("Dime el Autor de tu libro: ");
				libro3.setAutor(entrada.next());
				System.out.println("Dime el numero de Libros que tienes: ");
				libro3.setNumEjemplares(entrada.nextInt());
				System.out.println("Dime el numero de Ejemplares Prestados tienes: ");
				libro3.setNumPrestados(entrada.nextInt());
				
				System.out.println("Libro Introducido!");
				
			} else if (opcion == 2) {
				System.out.println("De la siguiente lista eliga que libro quiere consultar:");
				System.out.println("1:"+libro1.getTitulo());
				System.out.println("2:"+libro2.getTitulo());
				System.out.println("3:"+libro3.getTitulo());
				
				consultar = entrada.nextInt();
				if (consultar == 1) {
					System.out.println(libro1.toString());
				} else if (consultar == 2) {
					System.out.println(libro2.toString());
				} else if (consultar == 3) {
					System.out.println(libro3.toString());
				} else {
					System.out.println("Numero Equivocado!");
				}
				
			} else if (opcion == 3) {
				System.out.println("De la siguiente lista eliga que libro quiera eliminar:");
				System.out.println("1:"+libro1.getTitulo());
				System.out.println("2:"+libro2.getTitulo());
				System.out.println("3:"+libro3.getTitulo());
				
				eliminar = entrada.nextInt();
				
				if (eliminar == 1) {
					libro1.setTitulo(null);
					libro1.setAutor(null);
					libro1.setNumEjemplares(0);
					libro1.setNumPrestados(0);
				} else if (eliminar == 2) {
					libro2.setTitulo(null);
					libro2.setAutor(null);
					libro2.setNumEjemplares(0);
					libro2.setNumPrestados(0);
				} else if (eliminar == 3) {
					libro3.setTitulo(null);
					libro3.setAutor(null);
					libro3.setNumEjemplares(0);
					libro3.setNumPrestados(0);
				} else {
					System.out.println("Numero Equivocado!");
				}
				
			} else if (opcion == 4) {
				
				System.out.println("De la siguiente lista eliga que libro quiere tomar prestado:");
				System.out.println("1:"+libro1.getTitulo());
				System.out.println("2:"+libro2.getTitulo());
				System.out.println("3:"+libro3.getTitulo());
				
				prestar = entrada.nextInt();
				
				if (prestar == 1) {
					libro1.prestamo();
				} else if (prestar == 2) {
					libro2.prestamo();
				} else if (prestar == 3) {
					libro3.prestamo();
				} else {
					System.out.println("Numero Equivocado!");
				}
				
			} else if (opcion == 0) {
				salir = 0;
				
			} else {
				System.out.println("Numero equivocado!");
			}
		} while (salir != 0);
		
		System.out.println("Adios!");

	}

}
