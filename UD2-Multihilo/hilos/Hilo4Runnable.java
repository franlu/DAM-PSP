package hilos;

public class Hilo4Runnable implements Runnable {
	
	/* Al utilizar la interfaz Runnable, se implementa obligatoriamente
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		for(int i=0; i<5; i++)
			System.out.println("Soy el hilo, me estoy ejecutando :-p");
	}
}
