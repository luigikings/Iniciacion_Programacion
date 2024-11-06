package CineApp;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Cine cinex = new Cine("Cinex");
		 
		 Pelicula peli1 = new Pelicula(1, "Avergers", "Accion", "2h 32m");
		 Pelicula peli2 = new Pelicula(2, "Marico el ultimo", "Suspenso", "1h 25m");
		 Pelicula peli3 = new Pelicula(3, "Buscando a Nemo", "Infantil", "3h 02m");
		 
		 cinex.agregarPelicula(peli1);
		 cinex.agregarPelicula(peli2);
		 cinex.agregarPelicula(peli3);
		 
		 Sala sala1 = new Sala("1", peli1, 5);
		 Sala sala2 = new Sala("2", peli2, 5);
		 Sala sala3 = new Sala("3", peli3, 5);
		 
		 for(Butaca butaca: sala1.getButacas()) {
			 System.out.println(butaca.getNumero());
		 }
		 
		 cinex.agregarSala(sala1);
		 cinex.agregarSala(sala2);
		 cinex.agregarSala(sala3);
		 
		 cinex.mostrarCartelera();
		 
		 Cliente cliente1 = new Cliente("Luigidasilv@gmail.com", "Luis Angel Jose", "Da Silva Veliz");
		 cliente1.comprarEntradas(cinex);
		 
		 
	}

}
