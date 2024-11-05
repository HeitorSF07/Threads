import Ativ_1.Thread_1;
import Ativ_2.*;

public class Main {
    public static void main(String[] args) {

        Thread_1 thread1 = new Thread_1();

        Thread thread = new Thread(thread1);

        thread.start();



        Impares impares = new Impares();
        Pares pares = new Pares();

        Thread threadPares = new Thread(pares);
        Thread threadImpares = new Thread(impares);

        threadPares.start();
        threadImpares.start();

    }
}