package Ativ_4;

public class Incrementa implements Runnable{
    private final Contador count;
    private final int num;

    public Incrementa(Contador count, int num) {
        this.count = count;
        this.num = num;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100_000; i++) {
            count.incrementa();
        }

        System.out.println("Thread " + num + " terminou de incrementar");
    }

}
