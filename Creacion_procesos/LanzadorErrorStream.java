package Creacion_procesos;

import java.io.InputStream;

public class LanzadorErrorStream {

	public void lanzarOrden(){
	    String clase="com.creacion.ejecutarApp";
	    Process p;
	    try {
	        p = new ProcessBuilder(
                    "java",
                    clase
            ).start();
	        //pb.start();
	        
	        try {
	        	
	        }catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    
		    // Comprobar si el proceso ha finalizado de forma correcta
		    //  0 Bien
		    // -1 Mal 
		    
		    int valorSalida;
		    
		    try {
		    	valorSalida = p.waitFor();
		    	System.out.println("Valor de salida: " + valorSalida);
		    }catch (Exception e) {
		        e.printStackTrace();
		    }
		    
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args){
	    LanzadorErrorStream l=new LanzadorErrorStream();
	    l.lanzarOrden();
	    System.out.println("Ordenes ejecutadas con éxito");
	}    
}
