package Ativ_6;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main6 {
    public static void main(String[] args){
        BlockingQueue<Integer> fila = new ArrayBlockingQueue<>(10);

        Thread p1 = new Thread(new Produtor2(fila, 1));
        Thread c1 = new Thread(new Consumidor2(fila, 1));
        Thread p2 = new Thread(new Produtor2(fila,2));
        Thread c2 = new Thread(new Consumidor2(fila, 2));
        Thread c3 = new Thread(new Consumidor2(fila,3));

        p1.start();
        c1.start();
        p2.start();
        c2.start();
        c3.start();

    }
}
