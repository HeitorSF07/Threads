package Ativ_1;

public class Main1 {
    public static void main(String[] args) {

        Thread_1 thread1 = new Thread_1();

        Thread thread = new Thread(thread1);

        thread.start();
    }
}
