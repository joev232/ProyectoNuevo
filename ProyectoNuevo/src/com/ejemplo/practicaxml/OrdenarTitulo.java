package com.ejemplo.practicaxml;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class OrdenarTitulo implements Comparator<Libro>{

	@Override
	public int compare(Libro l1, Libro l2) {
		// TODO Auto-generated method stub
		return  l1.getTitulo().compareTo(l2.getTitulo());
		
	}
	
}
