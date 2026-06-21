package threads;

public class Printer implements Runnable {

    @Override
    public void run() {
        System.out.println("Heelo Printer: " + Thread.currentThread().getName());
    }

}
