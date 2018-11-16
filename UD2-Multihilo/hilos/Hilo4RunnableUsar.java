package hilos;

public class Hilo4RunnableUsar {

	public static void main(String[] args) {
		Hilo4Runnable h4 = new Hilo4Runnable();
		Thread t = new Thread(h4);
		t.start();
		for(int i=0; i<5; i++)
			System.out.println("Soy la clase principal");

	}

}
