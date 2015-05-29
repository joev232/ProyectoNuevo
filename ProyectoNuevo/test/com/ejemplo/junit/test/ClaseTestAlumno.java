package com.ejemplo.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ejemplo.repaso.Alumno;
import com.ejemplo.repaso.exceptions.NotaException;

public class ClaseTestAlumno {
	
	@Test
	public void alumnoSobre () 
	 	{ 
	 		Alumno alumno; 
	 		try { 
	 			alumno = new Alumno("JuanJo", 39, 9); 
				Assert.assertThat(alumno, (new EsAlumnoSobresaliente())); 
	 		} catch (NotaException e) { 
				// TODO Auto-generated catch block 
	 			e.printStackTrace(); 
	 		} 
	 		 
	 	} 

}
