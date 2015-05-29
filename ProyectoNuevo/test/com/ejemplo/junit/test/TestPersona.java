package com.ejemplo.junit.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ejemplo.repaso.Persona;

public class TestPersona {
	
	static Persona p=null;
	
	//static Persona tester;
	
	@Before
	public void inicialPersona(){
		p = new Persona("jesus", 21);
	}
	
	
	
	@Test
	public void testGetEdad() {
		int edad=20;
		assertTrue(edad==p.getEdad());
	}
	

}
