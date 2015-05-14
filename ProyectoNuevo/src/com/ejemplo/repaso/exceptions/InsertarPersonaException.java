package com.ejemplo.repaso.exceptions;
import com.ejemplo.repaso.ListaPersonas;  
  
	public class InsertarPersonaException extends Exception{  
	  
	public static final String mensaje = "Numero de personas excecido. Máximo " + ListaPersonas.CAPACIDAD + " personas";  
	  
  
}  
