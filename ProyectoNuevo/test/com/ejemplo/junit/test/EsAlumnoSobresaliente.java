package com.ejemplo.junit.test; 
import org.hamcrest.Description; 
import org.hamcrest.TypeSafeMatcher; 

 
import com.ejemplo.repaso.Alumno; 
import com.ejemplo.repaso.TipoNota; 
 



public class EsAlumnoSobresaliente extends TypeSafeMatcher<Alumno>{

	
	TipoNota nota = null;
	
	@Override
	public void describeTo(Description descripcion) {
		descripcion.appendText("Resultado esperado: alumno con " + TipoNota.SOBRESALIENTE+"\n");
		descripcion.appendText("Obtenido alumno:" + this.nota);

		
	}

	@Override
	protected boolean matchesSafely(Alumno alumno) {
		boolean b_dev = false;
		//NOTA: ESTE ALUMNO, ES EL PRIMER PAR�METRO DE LA LLAMADA
		//Assert.assertThat(alumno, (new EsAlumnoSobresaliente()));
		//Y DEL QUE VAMOS A COMPROBAR SU ESTADO
		
		this.nota = alumno.getNombre_nota();
		if (this.nota.equals(TipoNota.SOBRESALIENTE))
		{
			b_dev = true;
		}
		else
		{
			b_dev = false;
		}
		
		return b_dev;
	}

}
