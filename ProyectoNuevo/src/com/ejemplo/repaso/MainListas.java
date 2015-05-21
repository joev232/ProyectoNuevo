package com.ejemplo.repaso;

import org.apache.log4j.Logger;
import java.awt.List;
import java.awt.peer.SystemTrayPeer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


import com.ejemplo.repaso.exceptions.NotaException;

public class MainListas {
	
	private final static Logger log = Logger.getLogger("mylog");
	//metodo q reciba hasmap y devuelva un map

	public static void main(String[] args) throws NotaException {
		

		
//		ListaPersonas lp=new ListaPersonas();
//		Persona persona=new Persona("carlos", 20);
//		//p.busarPersona("carlos");
//		
//		//falta insertar personas
//		Persona p = lp.buscarPersona("carlos");
//		
//		if(p!=null){
//			System.out.println("Encontrado");
//			
//		}else{
//			System.out.println("No encontrado");
//		}
		
//		//tremap
//		Alumno a=new Alumno("sergio", 40, 8);
//		Alumno a2=new Alumno("carlos", 40, 5);
//		
//		Map<Integer, Alumno> alumno=new TreeMap<Integer,Alumno>();
//		alumno.put(a.getNota(), a);
//		alumno.put(a2.getNota(), a2);
//		System.out.println(alumno);
//		
		
		
		//Persona per=new Persona(nombre, edad);
		//para probar treeset
		
	
		
		Persona p=new Persona("Jose", 13);
		Persona p2=new Persona("Carlos", 10);
		Persona p3=new Persona("Ricardo", 17);
		Persona p4=new Alumno("Alberto", 20, 8);
		
		ArrayList<Persona> perso=new ArrayList<Persona>();
		
		perso.add(p);
		perso.add(p2);
		perso.add(p3);
		perso.add(p4);
		
		Collections.sort(perso, new OrdenarPorNombre());
		System.out.println(perso);
		
		log.info("Informando...");
		
//		OrdenarPorEdad comparador_edad = new OrdenarPorEdad();
//		Collections.sort(perso,comparador_edad);
//		System.out.println(perso);
		
		//System.out.println(perso);
		
		
		//casting de persona a alumno
		//Alumno al=(Alumno)p4;
		
//		//ejemplo collection
//		Set<Integer> setper=new TreeSet<Integer>();
//		setper.add(p.getEdad());
//		setper.add(p2.getEdad());
//		setper.add(p3.getEdad());
//		setper.add(p4.getEdad());
//		System.out.println(setper);
//		
		
			
		//linkedhasmap
//		Persona p=new Persona("carlos", 12);
//		Persona p2=new Persona("ricardo", 20);
//		Persona p3=new Persona("pedro", 8);
//		
//		Map<Integer, Persona> maper=new LinkedHashMap<Integer,Persona>();
//		maper.put(1, p3);
//		maper.put(5, p2);
//		maper.put(2, p);
//		
//		System.out.println(maper);
//		
//		Persona p2=new Persona("ricardo", 30);
//		Persona p3=new Persona("ricardo", 5);
//		Map<String, Persona> nombrep=new HashMap<String,Persona>();
//		nombrep.put(p2.getNombre(), p3);
//		System.out.println(nombrep);
		//System.out.println(p);
		
	}

}
