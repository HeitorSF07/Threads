package Ativ_2;
import java.util.Random;

public class Impares  implements Runnable{
    @Override
    public void run() {
        Random random = new Random();
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Erro na thread de impares");
            }
        }
    }
}
