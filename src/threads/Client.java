package threads;

public class Client {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello from Thread");
        Printer p = new Printer();
        Thread t = new Thread(p);
        Thread t2 = new Thread(new Printer());
        t2.start();

        t.start();
       
    }
    
}
