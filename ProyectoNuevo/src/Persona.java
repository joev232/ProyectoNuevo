public class Persona {
	 static String nombre;
	 int edad;
	
	
	  public static Persona sumaAnio1(Persona p,int inc){
		 
		 //Persona p=null; 
		 Persona p2=null;
		 //int anio=2;
		 p2=new Persona(p.getNombre(), p.getEdad()+inc); 
		 //Persona(nombre, edad);
		// edad=p.edad+anio;
		 //p=new Persona(nombre, edad);
		// p2=p;
		 
		 return p2;
	 }
	 
	  
	  
	  
	  public void sumarAnio2(int inc){
		  //sumar años a persona no xq devuelve void
		  this.edad=this.edad+inc;
		  
	  }
	  
	  public static void sumarAnio3(Persona p,int edad){
		  //modificar años del objeto  llamante
		  //recibo una persona q recibo y le incremento
		  //paso por parametros
		  p.setEdad(p.getEdad()+edad);		  
		  
	  }
	 
	 public boolean esMayorDeEdad(){
		
		boolean esmayor=false;
	
		if (this.edad>17) {
			esmayor=true;
		
		} else {
				esmayor=false;
			}
		return esmayor;
	}

	public void mostrar(){
		System.out.print(this.getNombre());
		System.out.print(this.edad);
	
	}
	
	/**
	 * constructor de la clase persona q define dos parametros
	 * @param nombre indica nombre del nuevo objeto
	 * @param edad   indica edad del nuevo objeto
	 */
	public Persona(String nombre,int edad){
		
		this.setNombre(nombre);
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
