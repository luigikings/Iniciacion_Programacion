import java.util.ArrayList;
import java.util.Date;

public class CitaVeterinario {

	// Atributos:
	private int idCita;
	private Date fechayhora;
	private Mascota mascota;
	private String motivoCita;

	// Contructor:
	public CitaVeterinario(int idCita, Date fechayhora, Mascota mascota, String motivoCita) {
		this.idCita = idCita;
		this.fechayhora = fechayhora;
		this.mascota = mascota;
		this.motivoCita = motivoCita;
	}

	// metodos:
	public void reprogramarCita(Date nuevafechayhora) {
		this.fechayhora = nuevafechayhora;
	}

	public void cancelarCita() {
		ArrayList<CitaVeterinario> citas = mascota.getListaCitas();

		citas.remove(idCita);

		mascota.setListaCitas(citas);
	}

	// getters y setters:
	public int getidCita() {
		return idCita;
	}

	public void setidCita(int idCita) {
		this.idCita = idCita;
	}

	public Date getFechayhora() {
		return fechayhora;
	}

	public void setFechayhora(Date fechayhora) {
		this.fechayhora = fechayhora;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public String getMotivoCita() {
		return motivoCita;
	}

	public void setMotivoCita(String motivoCita) {
		this.motivoCita = motivoCita;
	}
}
