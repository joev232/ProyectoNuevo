package com.ejemplo.repaso;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Spliterator;
import java.util.function.Consumer;

import org.apache.log4j.Logger;

import com.ejemplo.repaso.exceptions.InsertarPersonaException;  
  
public class ListaPersonas implements Iterable{  
	  
	public static final int CAPACIDAD = 10;  
	  
	private Persona[] array_personas;  
	
	private int numerosper;
	
	private final static Logger log = Logger.getLogger("mylog");
	
	  
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
	log.info("La lista ha sido creada");
		
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
	  
	public boolean serializar (){

		//Hacer uso del fichero de propiedades serializa.properties,   
		//para obtener de él el valor de la clave destino,   
		//que representa el nombre del fichero de salida  
		
		boolean serializa = true; 
		Properties properties = new Properties(); 
		try { 
			properties.load(new FileInputStream("serializa.properties")); 
		} catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block 
			serializa = false; 
			e.printStackTrace(); 
		} catch (IOException e) { 
			// TODO Auto-generated catch block 
			serializa = false; 
			e.printStackTrace(); 
		} 

		String ficheroDestino = properties.getProperty("destino"); 
		try { 
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroDestino)); 
			oos.writeObject(this); 
			oos.close(); 

		} catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block 
			serializa = false; 
			e.printStackTrace(); 
		} catch (IOException e) { 
			// TODO Auto-generated catch block 
			serializa = false; 
			e.printStackTrace(); 
		} 
		return serializa; 
	}  
	
	
	public boolean deserializar()  
	{  
		
		return false;  
	}  
	  
	public void insertarPersona (Persona p) throws InsertarPersonaException  
	{  
		// se aplica equals
		if (buscarPersona(p.getNombre())==null) 
			 		{ 
			 			System.out.println(p.getNombre() + " NO encontrado"); 
			 			if (!estaLlena()) 
			 			{ 
			 				System.out.println("Insertando a "+p.getNombre()); 
			 				int i = 0; 
			 				boolean insertado = false; 
			 				do 
							{ 
			 					if (array_personas[i]==null) 
			 					{ 
			 						array_personas[i] = p; 
			 						insertado = true; 
			 					} 
			 					i++; 
			 				}while ((insertado == false)&&(this.array_personas[i]==null)&&(i<this.array_personas.length)); 
			 				this.numerosper++; 
			 			} 
			 			else 
			 			{ 
			 				System.out.println("La lista esta llena, "+p.getNombre() + " no se ha podido insertar"); 
			 				throw new InsertarPersonaException(); 
			 			} 
			 		} 
			 		else 
			 		{ 
			 			System.out.println(p.getNombre() + " ya existe"); 
			 		} 
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
		
		if(this.numerosper==CAPACIDAD){
			estallena=true;
			}
			
		return estallena; 
		
	}  
	
	public boolean estaVacia(){
		
//		boolean estavacia=false;
//		if(estavacia){
//			this.numerosper=0;
//		}
		return this.numerosper==0;
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
