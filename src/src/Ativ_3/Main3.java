package Ativ_3;

public class Main3 {
    public static boolean ordem = false;
    public static void main(String[] args) {

        Object controle = new Object();

        Impares2 impares2 = new Impares2(controle);
        Pares2 pares2 = new Pares2(controle);

        Thread threadPares2 = new Thread(pares2);
        Thread threadImpares2 = new Thread(impares2);

        threadPares2.start();
        threadImpares2.start();
    }
}
