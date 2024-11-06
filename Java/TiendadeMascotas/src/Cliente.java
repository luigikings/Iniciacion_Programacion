import java.util.ArrayList;

public class Cliente {

	// Atributos:
	private int idCliente;
	private String nombre;
	private ArrayList<Mascota> listaMascota;

	// Contructor:

	public Cliente(int idCliente, String nombre, ArrayList<Mascota> listaMascota) {

		this.idCliente = idCliente;
		this.nombre = nombre;
		this.listaMascota = listaMascota;
	}

	// metodos:

	public void añadirMascota(Mascota mascota) {
		listaMascota.add(mascota);
	}

	public void listarMascotas() {
		for(int i=0;i<listaMascota.size();i++) {
			System.out.println(listaMascota.get(i).getidMascota()+listaMascota.get(i).getNombreMascota());
		}
	}

	// getters y setters:

	public int getidCliente() {
		return idCliente;
	}

	public void setidCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Mascota> getListaMascota() {
		return listaMascota;
	}

	public void setListaMascota(ArrayList<Mascota> listaMascota) {
		this.listaMascota = listaMascota;
	}
}
