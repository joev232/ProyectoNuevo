package com.ejemplo.repaso;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Persona>{
	
	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
//		int resultado=-2;
//		
//		resultado=p1.getNombre().compareTo(p2.getNombre());
//		
//		return resultado;
		//devuelve el mismo entero si multi
		return p1.getNombre().compareTo(p2.getNombre());
	}

	

}
