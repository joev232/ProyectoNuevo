package com.ejemplo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BaseDatosPractica {

	public static void main(String[] args) throws Exception {

		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
		try
		{
			//registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
			//Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "PRUEBAS");
			//SET AUTOCOMMIT= false; seria para eliminar o actualizar 
			conn.setAutoCommit(false);
			//savepoint punto de guyarda
			Savepoint sp=conn.setSavepoint();
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from employees where salary>3000");
			List<Empleado> listaEmpleado=new ArrayList<Empleado>(); 
			while (rset.next()){
				//System.out.println (rset.getString(1));
				Empleado empleado=new Empleado(rset.getInt(1),rset.getString(2),rset.getString(3),rset.getString(4),rset.getString(5),rset.getString(6),rset.getString(7),rset.getFloat(8),rset.getFloat(9),rset.getInt(10),rset.getInt(11));
				listaEmpleado.add(empleado);
			}
			
			for(Empleado emp:listaEmpleado){
				System.out.println(emp.toString());
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//conn.rollback(sp);
		}
		finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
		{
			if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}

		}   

	}

}

