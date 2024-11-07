package Ativ_5;
import java.util.concurrent.BlockingQueue;

public class Produtor implements Runnable{

    private final BlockingQueue<Integer> fila;

    public Produtor(BlockingQueue<Integer> fila){
        this.fila = fila;
    }

    @Override
    public void run(){
        try{
            int count = 0;
            while(true){
                fila.put(count);
                System.out.println("Produziu: "+ count);
                count++;
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
