import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;


public class Traduccion {

	
	public static String ficheroAdecuado(String idioma) throws IOException{
		
		String elegido = null;
		
		Properties propiedad=new Properties();
		InputStream entrada=null;
		
		// abrir el fichero de acuerdp al idioma seleccionado
		
		
		entrada=new FileInputStream("story_en.properties"); 
		
		propiedad.load(entrada);
		
		
		return elegido;
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
	
	String idioma="";	
	Scanner elige=new Scanner(System.in);
	System.out.println("Ingrese el idioma preferido:");
	idioma=elige.nextLine();	
	
	Traduccion t=new Traduccion();
	t.ficheroAdecuado(idioma);
		
	//InputStream entrada=null;
		
	}
	
}
