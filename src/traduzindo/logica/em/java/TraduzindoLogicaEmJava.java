package traduzindo.logica.em.java;

import java.util.Scanner;

public class TraduzindoLogicaEmJava {

    public static void main(String[] args) {

//        # Tipos Primitivos e Manipulação de Dados

//            -soma de números inteiros simples
//                Scanner scan = new Scanner (System.in);
//                System.out.println("Qual o seu nome? ");
//                String nome = scan.nextLine();
//                System.out.println("Agora me diga dois números pressionando a tecla enter.");
//                    int v1 = scan.nextInt();
//                    int v2 = scan.nextInt();
//                    int soma = v1 + v2;
//                System.out.println("A soma de "+ v1 +" mais "+ v2 +" é "+ soma +", "+ nome +".");
//                           
//            -lista com exemplos:
//                  System.out.println("Tipos de dados em Java: \n" +
//                      "\nMenor Byte: " + Byte.MIN_VALUE +
//        	        "\nMaior Byte: " + Byte.MAX_VALUE +
//        	        "\nMenor Short Int: " + Short.MIN_VALUE +
//        	        "\nMaior Short Int: " + Short.MAX_VALUE +
//        	        "\nMenor Int: " + Integer.MIN_VALUE +
//        	        "\nMaior Int: " + Integer.MAX_VALUE +
//        	        "\nMenor Long: " + Long.MIN_VALUE +
//        	        "\nMaior Long:" + Long.MAX_VALUE +
//        	        "\nMenor Float: " + Float.MIN_VALUE +
//        	        "\nMaior Float: " + Float.MAX_VALUE +
//        	        "\nMenor Double: " + Double.MIN_VALUE +
//        	        "\nMaior Double: " + Double.MAX_VALUE);
//
//                        byte tipoByte = 127;
//                        short tipoShort = 32767;
//                        char tipoChar = 'C';
//                        float tipoFloat = 2.6f;
//                        double tipoDouble = 3.59;
//                        int tipoInt = 2147483647;
//                        long tipoLong = 9223372036854775807L;
//                        boolean tipoBooleano = true;
//                        System.out.println("Valor do tipoByte = " + tipoByte);
//                        System.out.println("Valor do tipoShort = " + tipoShort);
//                        System.out.println("Valor do tipoChar = " + tipoChar);
//                        System.out.println("Valor do tipoFloat = " + tipoFloat);
//                        System.out.println("Valor do tipoDouble = " + tipoDouble);
//                        System.out.println("Valor do tipoInt = " + tipoInt);
//                        System.out.println("Valor do tipoLong = " + tipoLong);
//                        System.out.println("Valor do tipoBooleano = " + tipoBooleano);
                        
//        # Operadores Aritméticos, Operadores Lógicos, Relacionais, Condicionais

//            -Operadores Aritméticos e de incremento e decremento.
//                int desafioUm = 5;
//                System.out.println(desafioUm + ++desafioUm);
//
//                int desafioDois = 5;
//                System.out.println(desafioDois + desafioDois++);
//             
//            -Operadores de igualdade
//                Scanner scan = new Scanner (System.in);
//                    System.out.println("Digite dois valores! \n"+
//                        "\n Primeiro valor: ");
//                int valorA = scan.nextInt();
//                    System.out.print("Segundo valor: ");
//                int valorB = scan.nextInt();
//                if(valorA == valorB){
//                    System.out.println("Os valores são iguais.");
//                }else if(valorA > valorB){
//                    System.out.println("Os valores são diferentes, "+ valorA +" é maior que "+ valorB +".");
//                }else{
//                    System.out.println("Os valores são diferentes, "+ valorB + " é maior que "+ valorA +".");
//                }

               Scanner scan = new Scanner (System.in);
               System.out.println("Quer namorar comigo? [Sim/Não/Talvez]");
               String querNamorarComigo = scan.nextLine();
               switch(querNamorarComigo) {
                    case "Sim":
                        System.out.println("Ela me ama! :D");
                        break;
                    case "Talvez":
                        System.out.println("Ela nao sabe...");
                        break;
                    case "Não":
                        System.out.println("Ela nao me ama :(");
                        break;
                    default:
                        System.out.println("Pode responder [Sim/Não/Talvez] para que eu possa entender?! <3");
                        break;
               }
               
                
                
//        #Class Math
//        ....
//
//        # Estruturas de Repetição
//        ....
    
            }
}
