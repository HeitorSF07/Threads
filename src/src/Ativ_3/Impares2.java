package Ativ_3;

import com.sun.tools.javac.Main;

import java.util.Random;

public class Impares2 implements Runnable{
    private final Object controle;

    public Impares2(Object controle){
        this.controle = controle;
    }


    @Override
    public void run() {

        for (int i = 1; i <=9; i += 2) {
            synchronized (controle) {
                while (Main3.ordem) {
                    try {
                        controle.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println(i);
                Main3.ordem = true;
                controle.notify();
            }

        }
    }
}
