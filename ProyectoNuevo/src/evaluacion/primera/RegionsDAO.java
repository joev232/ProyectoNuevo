package evaluacion.primera;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import org.apache.log4j.Logger;

import com.ejemplo.jdbcDAO_DTO.Conexion;
import com.ejemplo.jdbcDAO_DTO.EmpleadoDTO;
import com.ejemplo.jdbcDAO_DTO.InstruccionesSQL;



public class RegionsDAO {

	private static Logger log = Logger.getLogger("mylog");

	private static RegionsDTO resObjeto  (ResultSet rs)  throws SQLException
	{
		RegionsDTO regions=null;

		int region_id=rs.getInt(1);
		String region_name=rs.getString(2);
		
		regions=new RegionsDTO(region_id, region_name);

		return regions;
	}

	public static List<RegionsDTO> obtenerTodos () throws SQLException
	{
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          		List<EmpleadoDTO> lista_empleados = null;
		Connection conexion = null;
		Statement stmt = null;
		ResultSet rs = null;
		RegionsDTO regionsDTO= null;
		
		
		try {
		
		conexion = Conexion.obtenerConexion();
		stmt = conexion.createStatement();
		rs=stmt.executeQuery(InstruccionSQL.CONSULTAR_REGIONES);
		List<RegionsDTO> lista_regions = new ArrayList<RegionsDTO>();
		while (rs.next())
		{
			regionsDTO = resObjeto(rs);
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
		
}
