package com.ejemplo.repaso;

import java.util.Comparator;

public class OrdenarPorEdad implements Comparator<Persona>{
	
	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		
		//return p1.getEdad()-p2.getEdad();
		
		int resultado=-2;
		if(p1.getEdad()<p2.getEdad()){
			resultado=-1;
		}else if(p1.getEdad()>p2.getEdad()){
			resultado=1;
		}else{
			resultado=0;
		}
		
		return resultado;
	}
 

}
