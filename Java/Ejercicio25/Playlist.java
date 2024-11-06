/**
 * 
 */
package Ejercicio25;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author luigi
 *
 */
public class Playlist extends Cancion{
	/**
	 * ArrayList llamado playlist que tendra todas las canciones ahi
	 */
	
	private String nombrePlaylist;
	public Playlist() {}
	public Playlist(String Nombre) {
		this.nombrePlaylist=Nombre;
		setNombrePlaylist(Nombre);
	}
	
	ArrayList<Cancion> playlist = new ArrayList();
	public ArrayList<Cancion> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(ArrayList<Cancion> playlist) {
		this.playlist = playlist;
	}

	public String getNombrePlaylist() {
		return nombrePlaylist;
	}

	public void setNombrePlaylist(String nombrePlaylist) {
		this.nombrePlaylist = nombrePlaylist;
	}
	
	public void aniadirCancion() {
		Cancion cancionnueva = new Cancion();
		System.out.println("Dime el nombre de la cancion:");
		cancionnueva.getTitulo();
		System.out.println("Dime el nombre del Artista:");
		cancionnueva.getArtista();
		System.out.println("Dime la duracion (EN MINUTOS) de la cancion:");
		cancionnueva.getDuracion();
		playlist.add(cancionnueva);
		System.out.println("Su cancion se ha agregado a la Playlist");
		
	}
	public String obtieneCancion() {
		return getTitulo();
	}
	public int obtieneTotalCanciones() {
		return playlist.size();
	}
	public void mostrarPlaylist() {
		for (int i = 0; i < playlist.size(); i++) {
			System.out.println(playlist.get(i).getTitulo()+" En la posicion :"+(i+1));
		}
	}
	public int totalDuracionPlaylist() {
		int mintotal = 0;
		int duracionc = 0;
		for (int i = 0; i <= playlist.size(); i++) {
			duracionc = (int) getDuracion();
			mintotal = duracionc + mintotal;
		}
		return mintotal;
	}
	public void reproducirPlaylist() {
		for (int i = 0; i <= playlist.size(); i++ ) {
			reproducir();
		}
	}
	public void reproducirCancion(int posicion) {
		reproducir();
	}
	public void limpiarPlaylist() {
		playlist.removeAll(playlist);
		System.out.print("-Playlist Vacia-");
	}
	public boolean eliminarCancion(int posicion) {
		if (playlist.contains(posicion)) {
			playlist.remove(posicion);
			return true;
		} else {
			return false;
		}
	}
	public Cancion encontrarCancionPorTitulo(String nombre) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Indique el nombre de la Cancion:");
		nombre = sc.toString();
		System.out.println(playlist);
		Iterator<Cancion> it = playlist.iterator();
		while (it.hasNext()) {
		    Cancion current = it.next();
		    if (current.equals(nombre)) {
		        return current;
		    }
		    
		}
		return null;
	}
	public ArrayList<Cancion> encontrarCancionesPorArtista(String artista){
		Scanner sc=new Scanner(System.in);
		System.out.println("Indique el nombre de la Cancion:");
		artista = sc.toString();
		System.out.println(playlist);
		Iterator<Cancion> it = playlist.iterator();
		while (it.hasNext()) {
		    Cancion current = it.next();
		    if (current.equals(artista)) {
		        System.out.println(current);
		    }
		    
		}
		return null;
	}
}
