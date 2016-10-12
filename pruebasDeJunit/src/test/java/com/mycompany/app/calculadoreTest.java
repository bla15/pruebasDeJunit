package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calculadoreTest {


	static calculadora cal;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("BEFOREEE Class");
		cal = new calculadora();
	}
	@Before
	public  void before(){
		System.out.println("BEFOREEE ");
		cal.clear();
	}
	
	@After
	public  void after(){
		System.out.println("AFTER");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("AFTER Class");
	}
	@Test
	public void testSum() {
		//calculadora cal = new calculadora();
		System.out.println("testSum");
		int result = cal.add(3,2);
		int esper = 5;
		assertEquals(5, result);
	}
	
	@Test
	public void testAnsSum() {
		//calculadora cal = new calculadora();
		System.out.println("testAnsSum");
		//ahora cojemos el resultado de la variale ans y no directamente cal.add
		cal.add(3,2);
		int result= cal.ans();
		assertEquals(5, result);	
	}
	
	//empezamos a usar expected
	@Test
	public void testDiv() {
		System.out.println("testDiv");
		cal.div(5,2);
		int result=cal.ans();
		assertEquals(2, result);
	}
	@Test(expected = ArithmeticException.class)
	public void testDivPor0() {
		System.out.println("testDivPor0");
		cal.div(5,0);
		int result=cal.ans();
		assertEquals(2, result);
	}
	
	//empezamos a usar time out
	@Test(timeout= 100)
	public void testOperacionMuyLarga() {
		System.out.println("testOperacionMuyLarga");
		cal.operacionMuyLarga();
		
	}
	
}
