import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.io.ObjectInputStream.GetField; 
import java.util.Properties; 
	 
	
	 public class ClaseProperties {
	 
	 
	 	public static void imprimirPropiedades(FileInputStream fis) throws IOException{ 
	 		Properties propiedades = new Properties(); 
	 		File file = null; 
	 		FileWriter fw = null; 
	 		//cargamos las propiedades 
	 		propiedades.load(fis); 
	 		System.out.println(propiedades.getProperty("outfile")); 
	 		System.out.println(propiedades.getProperty("start")); 
	 		System.out.println(propiedades.getProperty("body")); 
	 		System.out.println(propiedades.getProperty("end")); 
	 		 
	 		file = new File(propiedades.getProperty("outfile")); 
	 		file.createNewFile(); 
	 		fw = new FileWriter(file); 
	 		fw.write(propiedades.getProperty("start")+"\n"); 
	 		fw.write(propiedades.getProperty("body")+"\n"); 
	 		fw.write(propiedades.getProperty("end")+"\n"); 
	 		fw.close(); 
	 	} 
	 	 
	 	public static void main(String[] args) throws FileNotFoundException { 
	 		// TODO Auto-generated method stub 
	 		FileInputStream fis = null; 
	 		 
	 		try{	 
	 			switch (args[0]) { 
	 			case "it": 
	 				System.out.print("Italiano: "); 
	 				fis = new FileInputStream("story_it.properties"); 
	 				break; 
	 			case "en": 
	 				System.out.print("Ingles: "); 
	 				fis = new FileInputStream("story_en.properties"); 
	 				break; 
	 	 
	 			default: //ES espa�ol 
	 				System.out.print("Espa�ol: "); 
	 				fis = new FileInputStream("story_es.properties"); 
	 				break; 
	 			} 
	 			 
	 			//imprimimos las propiedades 
	 			imprimirPropiedades(fis); 
	 			 
	 			 
	 			} catch (IOException ex) { 
	 		        ex.printStackTrace(); 
	 			    } finally { 
	 			        if (fis != null) { 
	 			            try { 
	 			                fis.close(); 
	 			            } catch (IOException e) { 
	 			                e.printStackTrace(); 
	 			            } 
	 		        } 
		    } 
	 		 
	 	 		 
	 		 
	 	} 
	 
	 
	 } 

	