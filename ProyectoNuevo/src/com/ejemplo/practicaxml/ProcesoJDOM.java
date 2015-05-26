package com.ejemplo.practicaxml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class ProcesoJDOM {
	
	 Element transformarLibroAElemento(Libro l) {
			
			Element e_libro=new Element("libro");
			Element e_titulo=new Element("titulo");
			Element e_autor=new Element("autor");
			Element e_anyo=new Element("anyo");
			Element e_editorial=new Element("editorial");
			
			e_titulo.addContent(l.getTitulo());
			e_autor.addContent(l.getAutor());
			e_anyo.addContent(l.getAnyo());
			e_editorial.addContent(l.getEditorial());
			
			e_libro.setAttribute("isbn",l.getIsbn());
			e_libro.addContent(e_titulo);
			e_libro.addContent(e_autor);
			e_libro.addContent(e_anyo);
			e_libro.addContent(e_editorial);
						
			return e_libro;
		}
		
	public static void main(String[] args) throws FileNotFoundException,
			JDOMException, IOException {

		//CREAMOS EL PARSER
		SAXBuilder builder = new SAXBuilder();
		// Construimos el arbol DOM a partir del fichero xml
		Document documentJDOM = builder.build(new FileInputStream("libros.xml"));

		//MOSTRAMOS EL DOCUMENTO
		Element raiz = documentJDOM.getRootElement();
		
		//hago el arraylist de libros
		
		ArrayList<Libro> arraylibro = new ArrayList<Libro>();
		//arraylibro.addAll(arraylibro);
		
		
		// Recorremos los hijos de la etiqueta raíz
		List<Element> libros = raiz.getChildren();
		for (Element libro : libros) {
			//para cada libro, obtenemos su detalle
			//System.out.println(libro.getAttribute("isbn"));
			Libro li=new Libro();
			String isbn= libro.getAttribute("isbn").toString();
			li.setIsbn(isbn);
			
			List<Element> detalles = libro.getChildren();

			for (Element detalle : detalles) {
				
				System.out.println("Nombre =" + detalle.getName());
				//System.out.println("Valor =" + detalle.getValue());
		//hacer un switch 
				switch (detalle.getName()) {
				case "titulo":
					li.setTitulo(detalle.getValue());
					break;
				case "autor":
					li.setAutor(detalle.getValue());
					break;
				case "anyo":
					 li.setAnyo(detalle.getValue());
					 break;
				case "editorial":
					  li.setEditorial(detalle.getValue());
					  arraylibro.add(li);
				}
				System.out.println(arraylibro);
					
				Collections.sort(arraylibro, new OrdenarTitulo());
				
				//xml en memoria   org.jdom2.Document  
				Element raiz_libro=new  Element("libros");
				Document xml_doc = new Document(raiz_libro);
				xml_doc.getRootElement();
	
				
				for(int i=0;i<arraylibro.size();i++){

				//sformarLibroAElemento(libro);
					
					//e_raiz.addcontent(e_libro);
					//System.out.println(lib);
				}
						
				//detalle.getName();//titulo
				//detalle.getValue();// el ocho
				//li.setTitulo(detalle.getValue());
				//System.out.println(li);
			}
				
		}
				
		
		//AÑADO UN NUEVO HIJO
		Element padre = documentJDOM.getRootElement();
	    // Creamos una nueva etiqueta  
	    Element nuevolibro = new Element("libro");  
	    // Añadimos un atributo  
	    nuevolibro.setAttribute("isbn", "xxxx-yyyy");  
	    padre.addContent(nuevolibro);  
	    
	    
	    
	    Element titulo = new Element("titulo");
	    titulo.addContent("Los juegos");
	    nuevolibro.addContent(titulo);
	    //padre.addContent(nuevolibro);
	    
	    
	   //SERIALIZO EL DOCUMENT A UN FICHERO DE SALIDA
	    
	    Format format = Format.getPrettyFormat();
	    // Creamos el serializador con el formato deseado  
	    XMLOutputter xmloutputter = new XMLOutputter(format);
	    // Serializamos el document parseado  
	    String docStr = xmloutputter.outputString(documentJDOM); 
	    //Volcamos en un fichero
	    FileWriter fw = new FileWriter("lsalida3.xml");
	    fw.write(docStr);
	    fw.close();
	    
	}

}
