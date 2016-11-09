package rendimiento;

public class rendimiento {
	
	final conexionBD objConversor = new conexionBD();


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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rendimiento uno = new rendimiento();
		try {
			uno.cargarDatos();
			uno.cargarDatos();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			uno.metodoMalo();
			uno.metodoMalo();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
