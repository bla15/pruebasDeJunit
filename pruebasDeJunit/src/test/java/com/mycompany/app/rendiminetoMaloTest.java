package com.mycompany.app;

import static org.junit.Assert.*;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;

import rendimiento.rendimiento;

public class rendiminetoMaloTest {

	@Rule
	// esto activa Contiperf
	public ContiPerfRule i = new ContiPerfRule();

	@Test
	@PerfTest(invocations = 1000, threads = 20)
	// son especificaciones de ejecucion
	@Required(max = 12000, average = 2500)
	// requeisitos de rendimiento
	public void test1() throws Exception {


		for(int i=0;i<300;i++ ){
			rendimiento uno = new rendimiento();

			uno.metodoMalo();
			rendimiento d = new rendimiento();

			d.metodoMalo();
			rendimiento dd = new rendimiento();

			dd.metodoMalo();
		}
		

	}
}
