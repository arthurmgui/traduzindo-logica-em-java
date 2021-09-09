package traduzindo.logica.em.java;

import java.util.Scanner;

public class TraduzindoLogicaEmJava {

    public static void main(String[] args) {

//        # Tipos Primitivos e Manipulação de Dados
//        ....
//        -soma de números inteiros simples
        Scanner scan = new Scanner (System.in);
        System.out.println("Qual o seu nome? ");
        String nome = scan.nextLine();
        System.out.println("Agora me diga dois números pressionando a tecla enter.");
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        int soma = v1 + v2;
        System.out.println("A soma de "+ v1 +" mais "+ v2 +" é "+ soma +", "+ nome +".");
        
//        # Operadores Aritméticos e Classe Math
//        ....
//
//        # Operadores Lógicos
//        ....
//
//        # Operadores Relacionais
//        ....
//
//        # Estruturas Condicionais
//        ....
//
//        # Estruturas de Repetição
//        ....
    }
    
}
