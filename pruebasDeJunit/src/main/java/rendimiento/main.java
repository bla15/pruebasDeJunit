package rendimiento;

public class main {

	 public static void main( String[] args ){
			
		 	metodoBueno r =new metodoBueno();
	    	metodoMalo m = new metodoMalo();
			try {
				
				for (int i = 0; i < 12000; i++) {
					
					r.conectarseBueno();
					m.ConectarseMalo();
					if(i==5000){
						System.out.println("");
					}
System.out.println("____"+i);
				}
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
