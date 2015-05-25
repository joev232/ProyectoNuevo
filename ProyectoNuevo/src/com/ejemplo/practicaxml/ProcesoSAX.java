package com.ejemplo.practicaxml;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class ProcesoSAX {

	public static void main(String[] args) {  

		try {  
			// Creamos nuestro objeto libro vacío  
			Libro libro = new Libro();  
			// Creamos la factoria de parseadores por defecto  
			XMLReader reader = XMLReaderFactory.createXMLReader();  

			// Añadimos nuestro manejador al reader pasandole el objeto libro  
			//reader.setContentHandler(new LibroXML(libro));
			//instancia cada vez q no es necesario solo una vez
			LibroXML libroXML=new LibroXML(libro);
			reader.setContentHandler(libroXML);
			//para errores se le pasa clase error handler 
			
			//reader.setErrorHandler(arg0);
			// Procesamos el xml de ejemplo  
			//reader.parse(new InputSource(new FileInputStream("libro.xml")));
			reader.parse(new InputSource(new FileInputStream("libros.xml")));

			//Libro li=new Libro();
			HashMap<String , Libro> maplibro=libroXML.getMapalibros();
			System.out.println("VOY A MOSTRAR LA COLECCIÓN DE LIBROS");
			System.out.println("VOY A MOSTRAR LA COLECCIÓN DE LIBROS");
			System.out.println("VOY A MOSTRAR LA COLECCIÓN DE LIBROS");
			System.out.println("VOY A MOSTRAR LA COLECCIÓN DE LIBROS");
			
			System.out.println(maplibro);
					
			
			//System.out.println(libro.toString());           
		} catch (SAXException e) {  
			e.printStackTrace();  
		} catch (IOException e) {  
			e.printStackTrace();  
		}  

	}  
}
