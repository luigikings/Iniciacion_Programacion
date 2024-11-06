package barcos;

public class Juego_Barcos_Hundidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos ambos jugadores
		Jugador jugador1 = new Jugador("Luis");
		Jugador jugador2 = new Jugador("Andrea");
		
		//Creamos el tablero de cada jugador y le asignamos su jugador correspondiente
		Tablero tablero1 = new Tablero(5,jugador1);
		Tablero tablero2 = new Tablero(5,jugador2);
		
		//Generamos la cantidad de barcos que queramos
		tablero1.generarBarcos(20);
		tablero2.generarBarcos(20);
		
		//Ya con los barcos asignados al tablero vamos a generar el tablero con sus barcos
		tablero1.generarTablero();
		tablero2.generarTablero();
		
		//Un bucle infinito que no termina hasta que se encuentre un ganador
		while(true) {
			//mostramos ambos tableros
			tablero1.mostrarTablero();
			tablero2.mostrarTablero();
			
			//Hay que tener en cuenta que el tablero1 realmente es el tablero del jugador
			//pero se le asigna al jugador 1 porque es de quien recibe el ataque
			tablero1.jugarJugador(jugador1);
			//comprobamos si en el tablero ya no hay barcos
			tablero1.comprobarTablero();
			//si todoHundido a cambiado a TRUE significa que ya no hay mas barcos
			//y el jugador que ha atacado ha ganado
			if(tablero1.todoHundido) {
				System.out.println("El ganador/a es: "+tablero1.getJugador().getNombre());
				break;
			}
			
			//repetimos el mismo proceso con el otro jugador!
			tablero2.jugarJugador(jugador2);
			tablero2.comprobarTablero();
			if(tablero2.todoHundido){
				System.out.println("El ganador/a es: "+tablero2.getJugador().getNombre());
				break;
			}
		}
	}
}
