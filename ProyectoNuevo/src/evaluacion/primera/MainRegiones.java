package evaluacion.primera;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author alumno
 *
 */

public class MainRegiones {
	
			
		public static void main(String[] args) throws SQLException {
			
//			List<RegionsDTO> lista_regiones  = RegionsDAO.obteneConsulta();
//			System.out.println(lista_regiones);
//			
			
			//pruebo recuperar registro
			List<RegionsDTO> lista_reg=RegionsDAO.obteneConsulta();
			//System.out.println(lista_reg);
			
			
			System.out.println(RegionsDAO.recuperarRegions(1));
			
			//System.out.println(RegionDAO.leerRegion(5));
			//Prueba de consultar regions por id
//			List<RegionsDTO> lista_regiones=new ArrayList<RegionsDTO>();
//			RegionsDAO regionsDAO = new RegionsDAO();
//			lista_regiones=regionsDAO.recuperarRegions(2);
//			System.out.println(lista_regiones);
			
		}

	}


