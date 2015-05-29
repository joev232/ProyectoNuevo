package com.ejemplo.repaso;
import java.io.Serializable;  
  
public class Persona implements Serializable,Comparable<Persona> {  
	  
	private int edad;  
	private String nombre;  
	
	public Persona(String nombre, int edad) {  
		this.edad = edad;  
		this.nombre = nombre;  
	}  
  
  
	public int getEdad() {  
		return edad;  
	}  
  
  
	public void setEdad(int edad) {  
		this.edad = edad;  
	}  
  
  
	public String getNombre() {  
		return nombre;  
}  
  
  
	public void setNombre(String nombre) {  
		this.nombre = nombre;  
	}  
	  
	@Override  
	public String toString() {  
		return this.nombre + " " + this.edad;  
	}


	@Override
	public int compareTo(Persona p) {
		// TODO Auto-generated method stub
		//orden natural 
		int resultado=-2;
		if(this.edad>p.edad){
			resultado=1;
		}else if(this.edad<p.edad){
			resultado=-1;
		}else{
			resultado=0;
		}
		return resultado;
	}  
}  
