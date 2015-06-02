package com.ejemplo.practicabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conecction {
	
	static Connection conn = null;
	static ResultSet rset = null;
	static Statement stmt = null;
	
	public static void obtenerConexion(){

		try {
			//registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
			//Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "PRUEBAS");
			//stmt = conn.createStatement();
			//rset = stmt.executeQuery("select * from employees");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
		public static void liberarRecursos(){
			
			if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		}

}
