package rendimiento;

public class metodoMalo {

	
	public void ConectarseMalo() throws ClassNotFoundException 
	{
		
		conexionBD objConversorDos = new conexionBD();
		
		objConversorDos.connect();


		
		
		objConversorDos.crearTablaUsuarios();
		
		

		

		objConversorDos.disconnect();
		
		
		
	}
}
