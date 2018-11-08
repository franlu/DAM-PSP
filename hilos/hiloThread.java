package hilos;

public class hiloThread extends Thread{
	
	private int x;

	hiloThread(int x) {
		this.x = x;
	}

	public void run() {
		for (int i = 0; i < x; i++)
			System.out.println("En el Hilo... " + i);
	}

	public static void main(String[] args) {
		hiloThread p = new hiloThread(5);
		p.start();
	}// main
}
