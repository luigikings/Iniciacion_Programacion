import java.util.ArrayList;

public class Mascota {

	// Atributos:
	private int idMascota;
	private String nombreMascota;
	private String especie;
	private ArrayList<CitaVeterinario> listaCitas;

	// Contructor:

	public Mascota(int idMascota, String nombreMascota, String especie, ArrayList<CitaVeterinario> listaCitas) {
		this.idMascota = idMascota;
		this.nombreMascota = nombreMascota;
		this.especie = especie;
		this.listaCitas = listaCitas;
	}

	// metodos:

	public void programarCita(CitaVeterinario Cita) {
		listaCitas.add(Cita);
	}

	public void listarCitas() {
		for(int i=0;i<listaCitas.size();i++) {
			System.out.println("ID Cita: "+listaCitas.get(i).getidCita()+"\nFecha y hora: "+listaCitas.get(i).getFechayhora()+"\nMotivo de la cita:"+listaCitas.get(i).getMotivoCita()+"\nNombre de la Mascota: "+listaCitas.get(i).getMascota().getNombreMascota());
			System.out.println("------------------------------------------");
		}
		
	}

	// getters y setters:

	public int getidMascota() {
		return idMascota;
	}

	public void setidMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public ArrayList<CitaVeterinario> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(ArrayList<CitaVeterinario> listaCitas) {
		this.listaCitas = listaCitas;
	}
}
