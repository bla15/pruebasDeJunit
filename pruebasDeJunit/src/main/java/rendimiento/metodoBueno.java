package rendimiento;


public class metodoBueno {
	
	private conexionBD objConversor = new conexionBD();


	public void conectarseBueno() throws ClassNotFoundException 
	{
		objConversor.connect();

		objConversor.crearTablaUsuarios();

		objConversor.disconnect();
	}
}
