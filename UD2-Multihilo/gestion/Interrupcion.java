package gestion;

public class Interrupcion extends Thread {
  public void run() {
	    try {
	      while (!isInterrupted()) {
	        System.out.println("En el Hilo");
		    Thread.sleep(10);
	      }
	      } catch (InterruptedException e) {
		     System.out.println("HA OCURRIDO UNA EXCEPCIÓN");
		  }
	      
	      System.out.println("FIN HILO");
	   }
	  
	  
	   public void interrumpir() {
	       interrupt();
	   }
	   
	   public static void main(String[] args) {
		Interrupcion h = new Interrupcion();
	    h.start();
		for(int i=0; i<1000000000; i++) ;//no hago nada
		h.interrumpir();
  }

}
