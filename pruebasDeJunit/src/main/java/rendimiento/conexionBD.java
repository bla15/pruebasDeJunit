package rendimiento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conexionBD {

	String url ="jdbc:mysql://localhost:3306/?useSSL=false&serverTimezone=UTC";
	String user = "root";
	String password = "root";
	public Connection con;

	/**
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void connect(){

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(url, user, password);
			Statement stt = con.createStatement();
			
			//create and select DB
			stt.execute("CREATE DATABASE IF NOT EXISTS concesionarioParaiso");
			stt.execute("USE concesionarioParaiso");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * Desconectarse del archivo sqlite.De la base de datos.
	 */
	public void disconnect() {
		
		
		try {
			con.close();
		} catch (SQLException e) {
		}
		
	}
	
	public void crearTablaUsuarios(){

	
		try {
			
			Statement stt = con.createStatement();
			//create out table USUARIOS
			stt.execute("CREATE TABLE IF NOT EXISTS USUARIOS (" +
					"ID BIGINT NOT NULL AUTO_INCREMENT,"
					+"NICK VARCHAR(25),"
					+"PASSWORD VARCHAR(25),"
					+"NOMBRE VARCHAR(25),"
					+"SUELDO_ANUAL BIGINT,"
					+"CARGO VARCHAR(25),"
					+"ROL VARCHAR(25),"
					+"FECHA_INCORPORACION date,"
					+"ESTADO BOOLEAN,"
					+"PRIMARY KEY(ID)"
					+ ")");

			stt.close();
			//prep.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
		
}
