package com.ejemplo.junit.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ejemplo.junit.Operaciones;

public class TestOperaciones {
	static Operaciones tester;
	
	@BeforeClass
	public static void inicialClase(){
		tester= new Operaciones();
	}
	@AfterClass
	public static void finalClase(){
		tester=null;
	}
	@Test
	public void testSuma() {
		assertEquals("5 + 3 = 8",8,tester.suma(5, 3));
	}
	@Test
	public void testMultiplicacion() {
		assertEquals("5 * 3 = 15",15,tester.multiplicacion(5,3));
	}
	@Test
	public void testDivision() {
		assertEquals("6 / 3 = 2",2,tester.division(6, 3));
	}
	@Test
	public void testResta() {
		assertEquals("5 - 3 = 2",2,tester.resta(5,3));
	}
}
