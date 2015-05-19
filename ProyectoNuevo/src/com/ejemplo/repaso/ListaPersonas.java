package com.ejemplo.repaso;

import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

import com.ejemplo.repaso.exceptions.InsertarPersonaException;  
  
public class ListaPersonas implements Iterable{  
	  
	public static final int CAPACIDAD = 10;  
	  
	private Persona[] array_personas;  
	
	private int numerosper;
	  
	/**  
 +	 * Es muy posible que haga falta añadir algún campo más  
 +	 */  
public ListaPersonas()  
	{  	
		//TODO HAY QUE HACER UN CONSTRUCTOR  
		//RECUERDA QUE EL CONSTRUCTOR SIRVE PARA  
			//RESERVAR MEMORIA  
			//INICIALIZAR EL ESTADO DEL OBJETO Y SUS ATRIBUTOS  
	this.array_personas=new Persona[CAPACIDAD];
	numerosper=0;
		
	}  
	  
	public Persona[] getListaPersonas ()  
	{  
		//TODO HAY QUE DEVOLVER EL ARRAY DE PERSONAS QUE CONFORMAN LA LISTA
		
		return this.array_personas;
		
	}  
	  
	public Persona buscarPersona(String nombre)  
	{  
		//TODO BUSCAR PERSONA POR NOMBRE Y DEVOLVERLA  
	//SI NO ESTÁ, DEVOLVER NULO  
		Persona persona=null;
		boolean encontrado=false;
		boolean fin=false;
		int cont=0;
		if( this.numerosper>0)
		{
		while((!encontrado)&&(cont<this.array_personas.length)){
				if(nombre.equals(array_personas[cont].getNombre())){
				persona=array_personas[cont];
				encontrado=true;
				
				cont++;
			}else{
				persona=null;
			}
		}
		}
		return persona;  
	}  
  
	public Persona buscarPersona (int edad)  
	{  
		//TODO BUSCAR PERSONA POR EDAD Y DEVOLVERLA  
		//SI NO ESTÁ, DEVOLVER NULO  
		Persona persona = null;
		boolean encontrado=false;
		boolean fin=false;
		int cont=0;
		
		while((!encontrado)&&(!fin)){
			
			if(edad==(array_personas[cont].getEdad())){
				persona=array_personas[cont];
				encontrado=true;
				fin=true;
				
				cont++;		
			}else{
				persona=null;
			}
		}
		return persona;  
	}  
	  
	public boolean serializar ()  
	{  
		//Hacer uso del fichero de propiedades serializa.properties,   
		//para obtener de él el valor de la clave destino,   
		//que representa el nombre del fichero de salida  
		
				
		return false;  
	}  
	  
	public boolean deserializar()  
	{  
		
		return false;  
	}  
	  
	public void insertarPersona (Persona p) throws InsertarPersonaException  
	{  
		// se aplica equals
		
		
	
	}  
	
	public boolean eliminarPersona(Persona p){
		
		//llamaria a buscarpersona
		
		
		return false;
	}
	  
	public int numeroPersonas()  
	{  
		
		return this.numerosper++;  
	}  
  
	public boolean estaLlena()  
	{  
		boolean estallena = false;
		
		if(estallena){
			this.numerosper=CAPACIDAD;
		}
			
		return estallena;  
	}  
	
	public boolean estaVacia(){
		
		boolean estavacia=false;
		if(estavacia){
			this.numerosper=0;
		}
		
		
		return estavacia;
	}
	  
	public void mostrar()  
	{  
		//TODO MOSTRAR LA LISTA DE PERSONAS  
		// pista: ayudarse del método toString de persona
		
		//polimorfismo xq puedo pasar personas y alumnos y ya sysout tostringadecuado
		
		
		
	}

	@Override
	public void forEach(Consumer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		
		//hacer un new recorrer persona
		//new RecorrerPersona
		return null;
	}

	@Override
	public Spliterator spliterator() {
		// TODO Auto-generated method stub
		return null;
	}  
  
}  
