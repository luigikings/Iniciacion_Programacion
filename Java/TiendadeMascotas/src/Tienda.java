import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creamos el cliente y la mascota
		Cliente cliente = new Cliente(0, "Elam", new ArrayList<Mascota>());
		
		Mascota mascota = new Mascota(0, "Jesus", "Shitztu", new ArrayList<CitaVeterinario>());
		Mascota mascota2 = new Mascota(0, "Zeuz", "perro", new ArrayList<CitaVeterinario>());
		
		
		//añadimos la mascota a su cliente
		cliente.añadirMascota(mascota);
		cliente.añadirMascota(mascota2);
		
		//creamos una cita para la mascota y se la programos a la mascota
		CitaVeterinario cita = new CitaVeterinario(0,new Date(0),mascota,"duele panza");
		CitaVeterinario cita2 = new CitaVeterinario(1,new Date(0),mascota,"duele panza2");
		CitaVeterinario cita3 = new CitaVeterinario(2,new Date(0),mascota,"duele panza3");
		mascota.programarCita(cita);
		mascota.programarCita(cita2);
		mascota.programarCita(cita3);
		
		//mostramos la informacion del cliente
		System.out.println("/////////////////////////////////////////////");
		System.out.println("INFO CLIENTE:");
		System.out.println("ID CLiente: "+cliente.getidCliente()+"\nNombre:"+cliente.getNombre());
		System.out.println("Nombre de las mascotas: ");
		//con el bucle miramos todas las mascotas que tiene el cliente
		for(int i=0;i<cliente.getListaMascota().size();i++) {
			System.out.println(cliente.getListaMascota().get(i).getNombreMascota()+" ");
			
		}
		
		//mostramos la info de la cita de la mascota
		System.out.println("/////////////////////////////////////////////");
		System.out.println("INFO CITAS DE "+mascota.getNombreMascota());
		
		//recorremos todas las citas que tenga la mascota
		mascota.listarCitas();
		
		//creamos un producto con 40 de Stock y le vendemos 5 de esta misma
		System.out.println("/////////////////////////////////////////////");
		Producto producto = new Producto(0, "Pollo Frito", 9.99F, 40);
		
		producto.venderProducto(5);
		System.out.println("Queda "+producto.getCantidadStock()+" en Stock de "+producto.getnombreProducto());
		
		//cancelamos la cita
		System.out.println("/////////////////////////////////////////////");
		cita.cancelarCita();
		cita.cancelarCita();
		mascota.listarCitas();
		
		
		

	}

}
