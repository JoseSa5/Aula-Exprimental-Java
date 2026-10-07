package com.jose.exercicios;

import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    static String nome = "José";
    static int idade = 21;
    static double altura = 1.83;
    static double nota = 7;
    static char turma = 'A';
    static boolean estaMatriculado = true;


    public static void main(String[] args) {
        int option;
        do {
            exercice8();
            System.out.println("Escolha uma opção: ");
            option = Integer.parseInt(SCANNER.nextLine());
            System.out.println(exercice9(option));
            switch (option) {
                case 1:
                     exercice1();
                     break;
                case 2:
                    exercice2();
                    break;
                case 3:
                    exercice3();
                    break;
                case 4:
                    exercice4();
                    break;
                case 5:
                    exercice5();
                    break;
                case 6:
                    exercice6();
                    break;
                case 7:
                    exercice7();
                    break;
                default:
                    System.out.println("Opcao Invalida.");;
                    break;
            }
        } while (option != 0);
        //exercice1();
        //exerice2();
        //exercice3();
        //exercice4();
        //exercice5();
        //exercice6();
        //exercice7();
        //System.out.println(exercice9(2));
        SCANNER.close();
    }

    static void exercice1() {
        System.out.println("O meu nome é " + nome + " tenho " + idade +
                " anos e tenho " + altura + " m de altura. A minha nota é " + nota + " valores, a minha turma é a " + turma +
                ". Estou matriculado? " + estaMatriculado);
    }

    static void exercice2() {
        System.out.println("Indica o teu nome: " + nome);
        nome = SCANNER.nextLine();

        System.out.println("Indica a tua idade: " + idade);
        idade = Integer.parseInt(SCANNER.nextLine());

        System.out.println("Indica a sua altura: "+ altura);
        altura = Double.parseDouble(SCANNER.nextLine());

        System.out.println("Indica a sua nota: "+nota);
        nota = Double.parseDouble(SCANNER.nextLine());

        System.out.println("Indica a sua turma: "+turma);
        turma = SCANNER.next().charAt(0);

        System.out.println("Indica se está matriculado: "+estaMatriculado);
        estaMatriculado = Boolean.parseBoolean(SCANNER.nextLine());
        exercice1();
    }

    static void exercice3() {

        if (estaMatriculado == false) {
            System.out.println("Nao está matriculado");
        } else {
            System.out.println("Está matriculado");
        }

        if (nota >= 7.0) {
            System.out.println("Aprovado");
        } else if (nota >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println((idade>=18?"Maior":"Menor") +" de idade.");
    }

    static void exercice4() {
        System.out.println("Indica o dia: ");
        int dia = Integer.parseInt(SCANNER.nextLine());
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
            case 7:
                System.out.println("Fim-de-Semana");
                break;
            default:
                System.out.println("Dia Inválido");
                break;
        }
    }

    static void exercice5() {

        System.out.println("Indique um numero: ");
        int numero = SCANNER.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = "+ numero*i);
        }
    }

    static void exercice6() {
        System.out.println("Indique um numero: ");
        int numero = SCANNER.nextInt();
        while (numero != 0) {
            System.out.println("Digite um novo numero ou 0 para parar: ");
            numero = SCANNER.nextInt();
        }
    }

    static void exercice7() {
        int opcao;
        do {
            System.out.println("Indique uma nota: ");
            nota = SCANNER.nextDouble();
            System.out.println("Nota informada: "+ nota);
            System.out.println("Deseja Informar outra nota? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
        } while (SCANNER.nextInt()== 1);
    }

    static void exercice8() {
        System.out.println("===== MENU =====\n" +
                "1 - Variáveis\n" +
                "2 - Entrada de dados\n" +
                "3 - Condições\n" +
                "4 - Switch\n" +
                "5 - Tabuada com for\n" +
                "6 - Repetição com while\n" +
                "7 - Repetição com do-while\n" +
                "0 - Sair\n" +
                "================\n");
    }

    static String exercice9(int number) {
        switch (number) {
            case 1:
                return "Exercicio 1";
            case 2:
                return "Exercicio 2";
            case 3:
                return "Exercicio 3";
            case 4:
                return "Exercicio 4";
            case 5:
                return "Exercicio 5";
            case 6:
                return "Exercicio 6";
            case 7:
                return "Exercicio 7";
            default:
                return "Exercicio não encontrado.";
        }
    }
}
