package Ativ_6;
import java.util.concurrent.BlockingQueue;

public class Produtor2 implements Runnable{

    private final BlockingQueue<Integer> fila;
    private final int num;

    public Produtor2(BlockingQueue<Integer> fila, int num){
        this.fila = fila;
        this.num = num;
    }

    @Override
    public void run(){
        try{
            int count = 0;
            while(true){
                fila.put(count);
                System.out.println("Produtor: "+num+" Produziu: "+ count);
                count++;
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
