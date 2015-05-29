package com.ejemplo.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ejemplo.repaso.ListaPersonas;


public class TestSuite {

	
	@RunWith(Suite.class)
	
	@Suite.SuiteClasses({ListaPersonas.class })
		
	
	
	
	
	
	@Test
	public void testListaPersonas() {
		//fail("Not yet implemented");
	}

}
