package gestion;
public class Productor2 extends Thread {
    private Cola cola;
    private int n;

    public Productor2(Cola c, int n) {
        cola = c;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            cola.put(i); //pone el número
        
            try {
                sleep(100);
            } catch (InterruptedException e) { }			
			
        }
    }
}


