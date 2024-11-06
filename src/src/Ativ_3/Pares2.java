package Ativ_3;


import com.sun.tools.javac.Main;

import java.util.Random;

public class Pares2 implements Runnable{
    private final Object controle;

    public Pares2(Object controle){
        this.controle = controle;
    }


    @Override
    public void run() {

        for (int i = 2; i <= 10; i += 2) {
            synchronized (controle) {
                while (!Main3.ordem) {
                    try {
                        controle.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println(i);
                Main3.ordem = false;
                controle.notify();
            }

        }
    }
}
