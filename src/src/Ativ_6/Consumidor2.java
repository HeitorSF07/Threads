package Ativ_6;
import java.util.concurrent.BlockingQueue;

public class Consumidor2 implements Runnable{

    private final BlockingQueue<Integer> fila;
    private final int  num;

    public Consumidor2(BlockingQueue<Integer> fila, int num){
        this.fila = fila;
        this.num = num;
    }

    @Override
    public void run(){
        try{
            while(true){
                int elemento = fila.take();
                System.out.println("Pessoa: "+num+" Consumiu: "+elemento);
                Thread.sleep(800);

            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
