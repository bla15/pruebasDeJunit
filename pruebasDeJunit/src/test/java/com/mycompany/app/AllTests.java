package com.mycompany.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, assertTest.class, calculadoreTest.class,
		culadoraParametroTest.class })
public class AllTests {

}
