package Examen;

public class AEA1T1__LuisAngel_DaSilva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tabla de Multiplicar: Escribe un programa que solicite al usuario un número y muestre la tabla
		//de multiplicar de ese número del 1 al 10.
		System.out.println("--------------------------------");
		System.out.println("Tabla de Multiplicar:");
		tablaMultiplicar(7);
		
		//Divisores de un número: Escribe un programa que muestre por pantalla todos los divisores del
		//número 48.
		System.out.println("--------------------------------");
		System.out.println("Divisores de un número:");
		divisores(48);
		
		//Contador de Vocales: Escribe un programa que solicite al usuario una cadena de texto y cuente
		//cuántas vocales (a, e, i, o, u) contiene. Mostrar por pantalla cuantas vocales hay.
		System.out.println("\n--------------------------------");
		System.out.println("Contador de Vocales:");
		contarVocales("Hola PROFE porfa ponme el DiEz :)");
		
		/*Clasificación de Edades: Declara una variable que represente la edad y muestra un mensaje
		que indique si es un niño, adolescente, adulto joven o adulto mayor.
		Niño: hasta 12 años.
		Adolescente: hasta 18 años.
		Adulto joven: hasta 40 años
		Adulto mayor: hasta 110 años
		*/
		System.out.println("--------------------------------");
		System.out.println("Clasificación de Edades:");
		clasiEdad(23);
		
		
	}
	
	public static void tablaMultiplicar(int n1) {
		//Un sysout para mostrar de que número vamos a hacer la tabla:
		System.out.println("LA TABLA DEL "+n1);
		//Con un bucle for multiplicaremos el número dado por (i) que pasara desde el 1 hasta el 10:
		for (int i=1;i<=10;i++) {
			//Con el sysout mostramos la operacion que estamos haciendo y la mostramos:
			System.out.println(n1+" X "+i+" = "+n1*i);
		}
	}
	
	public static void divisores(int n2) {
		//Un sysout para mostrar de que número vamos a sacar los divisores:
		System.out.println("Los divisores del número "+n2+" son:");
		//Un bucle para pasar por cada divisor posible:
		for (int i=1;i<=n2;i++) {
			//Un if para comprobar si el posible divisor(i) es el divisor del número dado:
			if(n2%i==0) {
				//En caso de que si, mostrar el divisor:
				System.out.print(i+" ");
			}
		}
	}
	
	public static void contarVocales(String txt1) {
		//Primero pasaremos todo el texto a minuscula para no equivocarnos con las mayusculas:
		String txtcomp=txt1.toLowerCase();
		//creamos variable contador que sera el que cuenta cuantas vocales hay:
		int cont=0;
		//En un bucle miraremos el string caracter por caracter:
		for (int i=0;i<txtcomp.length();i++) {
			//con un condicional verificamos cada caracter para ver si es alguna vocal:
			if (txtcomp.charAt(i)=='a' || txtcomp.charAt(i)=='e' || txtcomp.charAt(i)=='i' || txtcomp.charAt(i)=='o' || txtcomp.charAt(i)=='u') {
				//En caso de si, suma 1 al contador:
				cont++;
			}
		}
		//Mostrar por pantalla el texto original y decir cuantas vocales tiene:
		System.out.println("El texto: ("+txt1+") tiene "+cont+" vocales");
	}
	public static void clasiEdad(int n3) {
		//Con el número dado verificaremos que este dentro del rango teniendo en cuenta que nadie tiene <0 años y que nadie tiene >110 años
		if (n3 >= 0 && n3 <=12) {
			System.out.println("El Usuario es un NIÑO");
		}else if(n3 > 12 && n3 <=18) {
			System.out.println("El Usuario es un ADOLESCENTE");
			
		} else if(n3 > 18 && n3 <= 40) {
			System.out.println("El Usuario es un ADULTO JOVEN");
		} else if(n3 > 40 && n3 <= 110) {
			System.out.println("El Usuario es un ADULTO MAYOR");
			
		} else {
			System.out.println("EDAD FUERA DE RANGO ENTRE (0-110) AÑOS");
		}
		
	}

}
