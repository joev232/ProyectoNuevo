package com.ejemplo.junit.test;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Test;

import com.ejemplo.repaso.Alumno;
import com.ejemplo.repaso.exceptions.NotaException;

import static org.junit.Assert.*;
import static com.ejemplo.junit.test.EsAlumnoSobresaliente.*;
import static org.hamcrest.core.IsNot.*;
import static org.hamcrest.core.Is.*;

public class ClaseTestAlumno {
	
	@Test
	public void alumnoSobre () 
	 	{ 
	 		Alumno alumno; 
	 		try { 
	 			alumno = new Alumno("JuanJo", 39, 9); 
				Assert.assertThat(alumno, is(new EsAlumnoSobresaliente())); 
	 		} catch (NotaException e) { 
				// TODO Auto-generated catch block 
	 			e.printStackTrace(); 
	 		} 
	 		 
	 	} 

}
