package com.mycompany.app;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class assertTest {

	@Test
	public void test() {
		
		//con mensaje si falla
		assertEquals("3 es distinto de 4",4, 4);
		
		//que sea falso o que sea verdadero
		assertFalse(false);
		assertTrue(true);
		
		//que no sea igual
		assertNotEquals(4, 3);
		
		//comprueba que los objetos sean los mismos (punteros, direccion de memoria)
		java.util.Date date1 = new Date();
		java.util.Date date2 = new Date();
		assertEquals(date1, date2);
		//assertSame("Fallo en la comparacion de objetos",date1, date2);
		
		
	}
	
	

}
