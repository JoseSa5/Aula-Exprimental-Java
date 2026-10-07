package org.example;

public class Main {
    public static void main(String[] args) {
        int acabou = 10;
        int contador = 5;
        String palavra = "palavra";

        if (acabou == 11) {
            System.out.println("É 10");
        } else  {
            System.out.println("Não é 10");
        }

        switch (acabou) {
            case 10:
                System.out.println("Caso 10");
                break;
            case 11:
                System.out.println("Caso 11");
                break;
            default:
                System.out.println("Default");
                break;
        }


        do {
            System.out.println("Contador é " + contador++);
        } while (contador <= 10);

        for (int i = 0; i < acabou; i++) {
            System.out.print(i+1);
        }
    }
}