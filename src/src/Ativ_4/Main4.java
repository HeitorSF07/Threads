package Ativ_4;

public class Main4 {
    public static void main(String[] args) {
        Contador count = new Contador();
        Thread[] threads = new Thread[5];

        // cria e inicia 5 threads
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new Incrementa(count, i + 1));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Soma final: " + count.getQuant());

    }
}
