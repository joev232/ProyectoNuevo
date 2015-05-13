import java.util.Scanner;


public class MainPersona {

	//nombre=pedirNombre();
	
	static String pedirNombre(){
		String nombre;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		nombre=entrada.next();
		return nombre;
	}
	
	private static int pedirEdad() {
		int edad;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese su edad");
		edad=entrada.nextInt();
		return edad;
	}
	
	public static void main(String[] args) {
		String nombre;
		
		MainPersona p=new MainPersona();
		MainPersona p2=new MainPersona();
		p.pedirEdad();
		p2.pedirEdad();
		MainPersona.pedirEdad();
		
		int edad;
		Persona p=null;
		//Persona p2=null;
		for(int contador=0;contador<5;contador++){
			
			nombre=pedirNombre();
			edad=pedirEdad();
			
			p=new Persona(nombre, edad);
			p.mostrar();
		}
		
		
		
		if (p.esMayorDeEdad()) {
			//parte verdadera
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
				
//		System.out.println("Ingrese su nombre");
//		nombre=entrada.next();
//		System.out.println("Ingrese la edad");
//		edad=entrada.nextInt();
//		
//		p=new Persona(nombre, edad);
//		
//		System.out.println("Ingrese su nombre");
//		nombre=entrada.next();
//		System.out.println("Ingrese la edad");
//		edad=entrada.nextInt();
//		//p2=new Persona(nombre,edad);
//		
//		p.mostrar();
//		//p2.mostrar();
		
	}
}
