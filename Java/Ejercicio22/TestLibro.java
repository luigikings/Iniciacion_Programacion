package Ejercicio22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLibro {

	@Test
	void testDevolver() {
		libro numprestados = new libro("Viajes espaciales","Rafael",4,-5);
		int esperado = (1);
		int resultado = numprestados.devolver();
		assertEquals(esperado, resultado);
	}

}
