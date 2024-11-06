/**
 * 
 */
package Ejercicio25;

/**
 * @author luigi
 *
 */
public class Cancion {
	
	private String titulo;
	private String artista;
	private double duracion;
	
	/**
	 * Constructor vacio
	 */
	public Cancion() {}
	/**
	 * Constructor con parametos
	 * @param titulo Nombre de la cancion 
	 * @param artista Nombre del artista 
	 * @param duracion Duracion de la cancion 
	 */
	public Cancion(String titulo, String artista, double duracion) {
		this.titulo=titulo;
		this.artista=artista;
		this.duracion=duracion;
	}
	/**
	 * Metodo reproducir
	 * @return Reproduciendo titulo de la cancion
	 */
	public String reproducir() {
		return "Reproduciendo..."+this.titulo;
	}
	@Override
	/**
	 * Este metodo nos va a devolver todo sobre la cancion
	 */
	public String toString() {
		return this.titulo+" - "+this.artista+"| Duracion:"+this.duracion+", minutos";
	}

	/**
	 * Getters y setters
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	
}