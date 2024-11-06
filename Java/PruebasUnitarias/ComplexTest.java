package PruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest {

	
	

	
	@Test
	public void testSumar() {
		//Declaramos 2 numeros complejos
		Complex numA = new Complex(2,3);
		Complex numB = new Complex(4,1);
		//declaramos resultado esperado
		Complex esperado = new Complex(6,4);
		//declaramos resultado obtenido
		Complex obtenido = numA.sumar(numB);
		//assert para comprobar si esperado = obtenido
		assertEquals(esperado, obtenido);
	}
	@Test
	public void testRestar() {
		//Declaramos 2 numeros complejos
		Complex numA = new Complex(2,2);
		Complex numB = new Complex(2,2);
		//declaramos resultado esperado
		Complex esperado = new Complex(0,0);
		//declaramos resultado obtenido
		Complex obtenido = numA.restar(numB);
		//assert para comprobar si esperado = obtenido
		assertEquals(esperado, obtenido);
	}
	@Test
	public void testMultiplicarComplex() {
		//Declaramos 2 numeros complejos
		Complex numA = new Complex(2,3);
		Complex numB = new Complex(4,1);
		//declaramos resultado esperado
		Complex esperado = new Complex(5,14);
		//declaramos resultado obtenido
		Complex obtenido = numA.multiplicar(numB);
		//assert para comprobar si esperado = obtenido
		assertEquals(esperado, obtenido);
	}
	@Test
	public void testMultiplicarDouble() {
		//Declaramos 2 numeros complejos
		Complex numA = new Complex(2,1);
		int numN = 2;
		//declaramos resultado esperado
		Complex esperado = new Complex(4,2);
		//declaramos resultado obtenido
		Complex obtenido = numA.multiplicar(numN);
		//assert para comprobar si esperado = obtenido
		assertEquals(esperado, obtenido);
	}
	@Test 
	public void testDividir() {
		//Declaramos 2 numeros complejos
	    Complex numA = new Complex(0,0);
		Complex numB = new Complex(3,4);
		//declaramos resultado esperado
		Complex esperado = new Complex(0,0);
		//declaramos resultado obtenido
		Complex obtenido = numA.dividir(numB);
		//assert para comprobar si esperado = obtenido
		assertEquals(esperado, obtenido);
	}
}
