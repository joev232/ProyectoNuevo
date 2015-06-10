package evaluacion.primera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import org.apache.log4j.Logger;

/**
 * 
 * @author alumno
 *
 */


public class RegionsDAO {

	private static Logger log = Logger.getLogger("mylog");

	private static RegionsDTO componerObjeto  (ResultSet rs)  throws SQLException
	{
		RegionsDTO regions=null;

		int region_id=rs.getInt(1);
		String region_name=rs.getString(2);
		
		regions=new RegionsDTO(region_id, region_name);

		return regions;
	}

	public static List<RegionsDTO> obteneConsulta () throws SQLException
	{
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          		
		Connection conexion = null;
		Statement stmt = null;
		ResultSet rs = null;
		RegionsDTO regionsDTO= null;
		List<RegionsDTO> lista_regions=null;
		
		try {
		
		conexion = Conexion.obtenerConexion();
		stmt = conexion.createStatement();
		rs=stmt.executeQuery(InstruccionSQL.CONSULTAR_REGIONES);
		lista_regions = new ArrayList<RegionsDTO>();
		while (rs.next())
		{
			regionsDTO = componerObjeto(rs);
			lista_regions.add(regionsDTO);
		}
		} catch (SQLException e) {
			e.printStackTrace();
			log.error("Error al recuperar la base de datos");
			lista_regions = null;
			throw e;
		}
		finally{
			Conexion.liberarRecursos(conexion, stmt, rs);
		}
		return lista_regions;
	}
	
	
	public static RegionsDTO recuperarRegions(int region_id) throws SQLException
	{
		
		/* Método para leer una región de la tabla por su id*/ 
 		Connection con = null; 
 		PreparedStatement pst = null; 
 		RegionsDTO region = null; 
 		ResultSet rs=null; 
 		try { 
 			con = Conexion.obtenerConexion(); 
 			pst = con.prepareStatement(InstruccionSQL.RECUPERAR_REGIONES); 
 			pst.setInt(1, region_id); 
 			rs = pst.executeQuery(); 
 			while (rs.next()) { 
 				region = new RegionsDTO(rs.getInt(1), rs.getString(2)); 
 			} 
 		} catch (SQLException e) { 
			e.printStackTrace(); 
 			log.error("Error al recuperar id"); 
 			throw e; 
 		} finally { 
			Conexion.liberarRecursos(con, pst, rs);
 		}
		return region; 
	}
//			Connection conexion = null; 
//	 		Statement stmt = null; 
//	 		PreparedStatement pstmt=null;
//	 		ResultSet rs = null; 
//	 		RegionsDTO regionsDTO= null;
//	 		List<RegionsDTO> lista_regions=new ArrayList<RegionsDTO>();
//	 		
//			try {
//				conexion = Conexion.obtenerConexion();
////				pstmt = conexion.prepareStatement(stmt);
//				pstmt = conexion.prepareStatement(InstruccionSQL.RECUPERAR_REGIONES);
//				pstmt.setInt(1,region_id);
//				
//				rs=pstmt.executeQuery();
//				
//				while(rs.next()){
//					int region_i = rs.getInt(1); 
//					String region_name = rs.getString(2); 
//					lista_regions.add(new RegionsDTO(region_i, region_name)); 
// 				}
//				
//				
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}finally{
//				//Conexion.liberarRecursos(conexion, pstmt, rs);
//			}
//	 		
//			return lista_regions; 

	
	public List<RegionsDAO> insertarRegion(RegionsDTO regionsDTO){
		
		//metodo para recuperar region 
		
		return null;
		
	}
	
}
