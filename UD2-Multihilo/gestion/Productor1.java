package gestion;
public class Productor1 extends Thread {
    private Cola cola;
    private int n;

    public Productor1(Cola c, int n) {
        cola = c;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            cola.put(i); //pone el número
            System.out.println(i + "=>Productor : " + n
                               + ", produce: " + i);
            try {
                sleep(100);
            } catch (InterruptedException e) { }			
			
        }
    }
}


