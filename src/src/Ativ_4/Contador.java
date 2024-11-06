package Ativ_4;

public class Contador {
    private int quant = 0;
    public synchronized void incrementa() {
        quant++;
    }
    public int getQuant() {
        return quant;
    }
}
