package Creacion_procesos;

public class lanzadorProceso {

	public void ejecutar(String ruta){

        ProcessBuilder pb;
        try {
        	pb = new ProcessBuilder(ruta);
            pb.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	        String ruta=
	                "C:\\Program Files\\Notepad++\\notepad++.exe";
	        lanzadorProceso lp=new lanzadorProceso();
	        lp.ejecutar(ruta);
	        System.out.println("Finalizado");
	}

}
