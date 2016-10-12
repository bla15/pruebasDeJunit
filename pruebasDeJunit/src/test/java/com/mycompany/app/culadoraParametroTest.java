package com.mycompany.app;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class culadoraParametroTest {

	@Parameters
	public static Iterable<Object[]> getData() {
		List<Object[]> obj = new ArrayList<Object[]>();
		obj.add(new Object[]{3, 1, 4});
		obj.add(new Object[]{3, 2, 5});
		obj.add(new Object[]{3, 3, 6});
		return obj;
	}
	private int a,b,exp;
	
	//juunit se encarga de llamamar a este constructor
	public culadoraParametroTest(int a, int b, int exp){
		this.a=a;
		this.b=b;
		this.exp=exp;
	}

	@Test
	public void testAdd() {
		calculadora cal = new calculadora();
		int result=cal.add(a,b);
		assertEquals(exp, result);
	}

}
