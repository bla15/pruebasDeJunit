package com.mycompany.app;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;

import rendimiento.rendimiento;

public class rendimientoTest {
	@Rule
	// esto activa Contiperf
	public ContiPerfRule i = new ContiPerfRule();

	@Test
	@PerfTest(invocations = 1000, threads = 20)
	// son especificaciones de ejecucion
	@Required(max = 12000, average = 2500)
	// requeisitos de rendimiento
	public void test1() throws Exception {
		rendimiento uno = new rendimiento();
		for(int i=0;i<300;i++ ){
			uno.cargarDatos();
			uno.cargarDatos();
			uno.cargarDatos();
		}

		

		
	}
}
