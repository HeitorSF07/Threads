package Ativ_5;
import java.util.concurrent.BlockingQueue;

public class Consumidor implements Runnable{

    private final BlockingQueue<Integer> fila;

    public Consumidor(BlockingQueue<Integer> fila){
        this.fila= fila;

    }

    @Override
    public void run(){
        try{
            while(true){
                int elemento = fila.take();
                System.out.println("Consumiu: "+elemento);
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
