package Ativ_2;

public class Main2 {
    public static void main(String[] args) {
        Impares impares = new Impares();
        Pares pares = new Pares();

        Thread threadPares = new Thread(pares);
        Thread threadImpares = new Thread(impares);

        threadPares.start();
        threadImpares.start();
    }
}
