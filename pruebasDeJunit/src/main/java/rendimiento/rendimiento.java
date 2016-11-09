package rendimiento;

public class rendimiento {
	
	private conexionBD objConversor = new conexionBD();


	public void cargarDatos() throws ClassNotFoundException 
	{
		objConversor.connect();
		objConversor.crearTablaUsuarios();
		objConversor.disconnect();
	}
	
	public void metodoMalo() throws ClassNotFoundException 
	{
		
		conexionBD objConversorDos = new conexionBD();
		
		objConversorDos.connect();
		objConversorDos.crearTablaUsuarios();
		objConversorDos.disconnect();
		
		
		
	}
	public void metodoMalo2() throws ClassNotFoundException 
	{
		conexionBD objConversortres = new conexionBD();

		objConversortres.connect();
		objConversortres.crearTablaUsuarios();
		objConversortres.disconnect();
	}

}
