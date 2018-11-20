package creacion;

public class Hilo0Thread extends Thread {

	public void run() {
		for(int i=0; i<5; i++)
			System.out.println("Soy el hilo, me estoy ejecutando :-p");
	}
}
