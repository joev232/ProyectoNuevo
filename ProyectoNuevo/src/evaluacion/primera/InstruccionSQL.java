package evaluacion.primera;

public class InstruccionSQL {
	
	//public static final String CONSULTAR_TODOS = "SELECT * FROM EMPLOYEES";
	public static final String  CONSULTAR_REGIONES= "select * from regions";
	public static final String CREAR_REGIONES = "insert into regions(region_id,region_name) values(5,'AFRICA')";
	public static final String RECUPERAR_REGIONES = "select * from regions where regions.region_id=5";
	
}
