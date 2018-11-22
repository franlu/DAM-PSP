package gestion;

public class HiloPrioridad2 extends Thread {
    HiloPrioridad2(String nom) {
        this.setName(nom);
    }
    
    public void run() {
        System.out.println("Ejecutando [" + getName() + "]");
        for (int i = 1; i <= 5; i++) 
            System.out.println("\t("+getName()+": " + i+")");   
    } 
    
    public static void main(String[] args) {
       HiloPrioridad2 h1 = new HiloPrioridad2("Uno");
       HiloPrioridad2 h2 = new HiloPrioridad2("Dos");
       HiloPrioridad2 h3 = new HiloPrioridad2("Tres");
       HiloPrioridad2 h4 = new HiloPrioridad2("Cuatro");
       HiloPrioridad2 h5 = new HiloPrioridad2("Cinco");    
       
       //asignamos prioridad
       h1.setPriority(Thread.MIN_PRIORITY);
       h2.setPriority(3); 
       h3.setPriority(Thread.NORM_PRIORITY);
       h4.setPriority(7); 
       h5.setPriority(Thread.MAX_PRIORITY);
       
       //se ejecutan los hilos
       h1.start();
       h2.start();
       h3.start();
       h4.start();
       h5.start();
    }

}
