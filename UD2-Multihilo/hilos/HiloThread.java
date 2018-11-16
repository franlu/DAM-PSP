package hilos;

public class HiloThread extends Thread{
	
	private int x;

	HiloThread(int x) {
		this.x = x;
	}

	public void run() {
		for (int i = 0; i < x; i++)
			System.out.println("En el Hilo... " + i);
	}

	public static void main(String[] args) {
		HiloThread p = new HiloThread(5);
		p.start();
	}// main
}
