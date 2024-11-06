package continuar;

public class buscaminas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Añadimos las minas de forma aleatoria para cada tablero, con un minimo de 25 y un maximo de 50.	
		int numeroMinas = (int) Math.floor(Math.random()*(25-50+1)+50);
		//System.out.println(numeroMinas);
		//Creamos un contador para guardar cuantos espacios en blanco tienen 6 minas alrrededor.
		int contadorEspaciosConSeisMinas = 0;
		//Creamos un tablero de tamaño variable con un minemos de 7 y un maximo de 14.
		int ejexTablero =  (int) Math.floor(Math.random()*(7-14+1)+14);
		int ejeyTablero = ejexTablero;
		//System.out.println(ejexTablero);Imprime el tamaño del tablero
		int[][] tablero = new int[ejexTablero][ejeyTablero];
		//Creamos un array de minas para guardar los datos de nuestras minas.
		int[][] arrayMinas = new int[numeroMinas][2];
		//Recorremos el numero de minas para crearlas con su posición
		for (int i = 0; i < numeroMinas; i++) {
			//System.out.println(i);
			//Se genera una posición x y una Y para cada mina
			int ejex=(int)(Math.random()*ejexTablero);
			int ejey=(int)(Math.random()*ejexTablero);
			//Se genera un objeto mina y se le dan los valores generados
			//Si es la primera mina generada se guarda sin comprobar las ya existentes.
			if (i==0) {
		//System.out.println("se ha creado la mina con posicion x "+ (ejex+1) + " y " + (ejey+1));
		arrayMinas[i][0] = ejex;
		arrayMinas[i][1] = ejey;
		
		//arrayMinas[i].setY(ejey);
	//Si no se mira que no esista una mina con la misma posición, si ya existe se resta una a i y no se guarda la actual mina para evitar generar duplicidades
			}else {
				int cont = 0;
				for(int e = 0; e < i;e++) {
					if(arrayMinas[e][0] == ejex && arrayMinas[e][1] == ejey ) {
						cont++;
					}
					if((e+1) == i && cont == 0) {
						//System.out.println("se ha creado la mina con posicion x "+ (ejex+1) + " y " + (ejey+1));
						arrayMinas[i][0] = ejex;
						arrayMinas[i][1] = ejey;
						 
					}else if((e+1) == i && cont != 0){
						//System.err.println("se ha rechazado la mina con posicion x "+ (ejex+1) + " y " + (ejey+1)+ " ya que la posicion ya esta ocupada");
						i--;
						
					}
				}
				cont =0;
			}
		}
		//Comenzamos a imprimir nuestro tablero, recorremos tanto el eje x como el y para comprobar si cada posición
		//tiene una mina o esta vacia
			 for (int i = 0; i < tablero.length; i++) {
					for (int j = 0; j < tablero[0].length; j++) {
						//Creamos un contador para ver cuantas minas tiene al rededor cada posicion
						int contMinas = 0;
						//Creamos un contador para guardar si una posición tiene una mina o no 
						int cont=0;
						//Recorremos el array de minas ,sumamos 1 al cont si la posicion actual y el de una mina coinciden
						// e imprimimos " * " para indicar que hay una mina
						for (int e = 0; e < arrayMinas.length; e++) {	
							
							if(i==arrayMinas[e][0] && j==arrayMinas[e][1]) {
							
								System.out.print(" * ");
								cont++;
							}	
					}
						//tras recorrerer el array de minas, si el contador es 0 imprimiremos " - " para indicar que el espacio esta 
						//vacio y contaremos cuantas mians tiene al reddedor
						if(cont==0) {
							System.out.print(" - ");
							//recorremos el array de minas para ver comprobar cuantas minas hay al reddedor de cada espacio en blanco.
							for (int e = 0; e < arrayMinas.length; e++) {	
							//Introducimos la logica para ver si tienen 6 minas al rededor añadir 1 al contMina.
							
							 if((i-1)== arrayMinas[e][0] &&(j-1)== arrayMinas[e][1] ){
								 contMinas++;
							 }	
							 if((i-1)== arrayMinas[e][0] &&(j)== arrayMinas[e][1] ){
								 contMinas++;
							 }
							 if((i-1)== arrayMinas[e][0] &&(j+1)== arrayMinas[e][1] ){
								 contMinas++;
							 }
							 if((i)== arrayMinas[e][0] &&(j-1)== arrayMinas[e][1] ){
								 contMinas++;
							 }
							 if((i)== arrayMinas[e][0] &&(j)== arrayMinas[e][1] ){
								 contMinas++;
							 }
							 if((i)== arrayMinas[e][0] &&(j+1)== arrayMinas[e][1] ){
								 contMinas++;
							 }
							 if((i+1)== arrayMinas[e][0] &&(j-1)== arrayMinas[e][1] ){
								 contMinas++;
							 }
							 if((i+1)== arrayMinas[e][0] &&(j)== arrayMinas[e][1] ){
								 contMinas++;
							 }
							 if((i+1)== arrayMinas[e][0] &&(j+1)== arrayMinas[e][1] ){
								 contMinas++;
							 }
							 }
							//si el espacio en blanco tiene 6 minas alrrededor se añade 1 al contador de espacios con 6 minas.
							//solo si tiene 6, ni mas ni menos.
							if (contMinas == 6) {
								contadorEspaciosConSeisMinas++;
							}
						}
					} 
					System.out.println(" ");
				}	
			
			//Se imprime la cantidad de espacios con 6 minas al rededor.
			System.out.println("Hay "+contadorEspaciosConSeisMinas + " espacios en blanco con 6 minas alrededor" );
		

	}
}	
	