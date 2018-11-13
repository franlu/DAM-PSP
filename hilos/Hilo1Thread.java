package hilos;

public class Hilo1Thread extends Thread {
	
		// constructor
		public Hilo1Thread(String nombre) {
			super(nombre);
			System.out.println("CREANDO HILO:" + getName());
		}

		// método run
		public void run() {
			for (int i=0; i<5; i++) 
				System.out.println("Hilo:" + getName() + " C = " + i);
		}

		//
		public static void main(String[] args) {
			Hilo1Thread h1 = new Hilo1Thread("Hilo 1");
			Hilo1Thread h2 = new Hilo1Thread("Hilo 2");
			Hilo1Thread h3 = new Hilo1Thread("Hilo 3");
				
			h1.start();
			h2.start();
			h3.start();
			
			System.out.println("3 HILOS INICIADOS...");
		}// main
		
	
}
