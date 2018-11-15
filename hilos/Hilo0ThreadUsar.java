package hilos;

public class Hilo0ThreadUsar {

	public static void main(String[] args) {
		Hilo0Thread h0 = new Hilo0Thread();
		h0.start();
		System.out.println("Soy la clase que lanza el hilo...");
	}

}
