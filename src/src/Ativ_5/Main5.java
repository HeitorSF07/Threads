package Ativ_5;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main5 {
    public static void main(String[] args){
        BlockingQueue<Integer> fila = new ArrayBlockingQueue<>(10);

        Thread p = new Thread(new Produtor(fila));
        Thread c = new Thread(new Consumidor(fila));

        p.start();
        c.start();
    }
}
