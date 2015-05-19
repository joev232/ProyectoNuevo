package com.ejemplo.repaso;

import java.util.ArrayList;
import java.util.Iterator;

public class MainListaPersonas {

	
	public static void main(String[] args) {
		
		ArrayList<Persona> persona=new ArrayList<Persona>();
		Persona pe=new Persona("Alba", 28);
		
		persona.add(new Persona("Carlos",20));
		persona.add(new Persona("Ricardo", 15));
		persona.add(new Persona("Sebastian", 19));
		persona.add(pe);
		//recibe indice arrarlist
		persona.remove(2);
		//tambien objeto
		persona.remove(pe);
		
		for(Persona pers:persona){
			System.out.println(pers);
		}
		//hace lo mismo q el for 
		Iterator<Persona> i_personas=persona.iterator();
		 while(i_personas.hasNext()){
			 Persona p=i_personas.next();
			 System.out.println(p);
			 //i_personas.remove();
		 }
	}
}
