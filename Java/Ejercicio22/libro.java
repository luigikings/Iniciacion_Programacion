package Ejercicio22;
 	/**
 	 * 
 	 * @author Luigi
 	 *
 	 */
public class libro {
	
	private String Titulo;
	private String Autor;
	private int numEjemplares;
	private int numPrestados;
	
	/**
	 * Constructor libro vacio
	 */
	public libro() {}
	public libro(String titulo,String autor,int numeroEjemplares,int numPrestados) {

		this.Titulo=titulo;
		this.Autor=autor;
		this.numEjemplares=numeroEjemplares;
		this.numPrestados=numPrestados;
	}
	
	public void prestamo() {
		if (numEjemplares>numPrestados) {
			numPrestados++;
			System.out.println("El prestamo se ha efectuado con exito");
		}else {
			System.out.println("No se puede prestar el libro por falta de Ejemplares");
		}
	}

	public int devolver() {

		if (numPrestados==0) {
			System.out.println("Este libro no se a prestado, No se ha hecho la devolucion del mismo");
			numPrestados = 0;
			return numPrestados;
		}else {
			numPrestados--;
			System.out.println("Devolucion con exito.");
			numPrestados = 1;
			return numPrestados;
		}
	}
	
	public String toString() {
		return "Titulo del Libro: "+getTitulo()+"\nNombre del autor: "+getAutor()+"\nEjemplares del libro: "+getNumEjemplares()+"\nLibros prestados: "+getNumPrestados();
	}
	
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getNumEjemplares() {
		return numEjemplares;
	}
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	public int getNumPrestados() {
		return numPrestados;
	}
	public void setNumPrestados(int numPrestados) {
		this.numPrestados = numPrestados;
	}
	
}
