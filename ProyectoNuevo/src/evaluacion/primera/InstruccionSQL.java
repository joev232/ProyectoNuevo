package evaluacion.primera;
/**
 * 
 * @author alumno
 *
 */
public class InstruccionSQL {
	
	
	public static final String  CONSULTAR_REGIONES= "select * from regions";
	public static final String CREAR_REGIONES = "insert into regions(region_id,region_name) values(?,?)";
	public static final String RECUPERAR_REGIONES = "select * from regions where regions.region_id=?";
	
}
