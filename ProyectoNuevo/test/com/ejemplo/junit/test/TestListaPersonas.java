package com.ejemplo.junit.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import com.ejemplo.repaso.Alumno;
import com.ejemplo.repaso.ListaPersonas;
import com.ejemplo.repaso.Persona;
import com.ejemplo.repaso.exceptions.InsertarPersonaException;

public class TestListaPersonas {
	
	static ListaPersonas  lp= null;
	
	
	@Test
	public void testListaPersonas() throws InsertarPersonaException {
		
		ListaPersonas lp = new ListaPersonas();
		Persona[] array=lp.getListaPersonas();
		//List<ListaPersonas> perso=new ArrayList<ListaPersonas>();
		//Persona p=new Persona("Jose", 13);
		Persona p2=new Persona("Carlos", 8);
//		lp.insertarPersona(p);
//		lp.insertarPersona(p2);
		
		//matcher hago un for
		
//		for(Persona pe:array){
//		assertThat(pe, IsEqual.equalTo(null));
//		
//		}
//		
		//fail("Not yet implemented");
		//cons assert
		assertNotNull(p2);
		
	}
//
//	@Test
//	public void testGetListaPersonas() {
//		
//		assertNotNull(lp);
//		//fail("Not yet implemented");
//	}
//
//	@Test
//	public void testBuscarPersonaString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testBuscarPersonaInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSerializar() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeserializar() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testInsertarPersona() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testEliminarPersona() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testNumeroPersonas() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testEstaLlena() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testEstaVacia() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMostrar() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testForEach() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testIterator() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSpliterator() {
//		fail("Not yet implemented");
//	}

}
