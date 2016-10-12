package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoraBasicaTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testSuma() {
		int resultado = calculadoBasica.suma(2, 3);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testResta() {
		int resultado = calculadoBasica.resta(3, 2);
		int esperado = 1;
		assertEquals(esperado, resultado);
	}

}
