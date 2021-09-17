package traduzindo.logica.em.java;

import java.util.Scanner;

public class TraduzindoLogicaEmJava {
	
	public static void somaDeDoisNumeros() {
		//Tipos Primitivos e Manipulação de Dados
        //soma de números inteiros simples
            Scanner scan = new Scanner (System.in);
            System.out.println("Qual o seu nome? ");
            String nome = scan.nextLine();
            System.out.println("Agora me diga dois números pressionando a tecla enter.");
                int v1 = scan.nextInt();
                int v2 = scan.nextInt();
                int soma = v1 + v2;
            System.out.println("A soma de "+ v1 +" mais "+ v2 +" é "+ soma +", "+ nome +".");
	}

    public static void main(String[] args) {

    	somaDeDoisNumeros();

        //-Operadores Aritméticos e de incremento e decremento.
            //int desafioUm = 5;
            //System.out.println(desafioUm + ++desafioUm);
            //int desafioDois = 5;
            //System.out.println(desafioDois + desafioDois++);

        //-Operadores de igualdade
            //Scanner scan = new Scanner (System.in);
            //System.out.println("Digite dois valores! \n"+
            //"\n Primeiro valor: ");
            //int valorA = scan.nextInt();
            //System.out.print("Segundo valor: ");
            //int valorB = scan.nextInt();
            //if(valorA == valorB){
                //System.out.println("Os valores são iguais.");
            //}else if(valorA > valorB){
                //System.out.println("Os valores são diferentes, "+ valorA +" é maior que "+ valorB +".");
            //}else{
                //System.out.println("Os valores são diferentes, "+ valorB + " é maior que "+ valorA +".");
            //}
    	
        //-Operadores condicionais e lógicos.
            //Scanner scan = new Scanner (System.in);
            //System.out.println("Quer namorar comigo? [Sim/Não/Talvez]");
            //String querNamorarComigo = scan.nextLine();
            //switch(querNamorarComigo) {
                //case "Sim":
                    //System.out.println("Ela me ama! :D");
                //break;
                //case "Talvez":
                    //System.out.println("Ela nao sabe...");
                //break;
                //case "Não":
                    //System.out.println("Ela nao me ama :(");
                //break;
                //default:
                    //System.out.println("Pode responder [Sim/Não/Talvez] para que eu possa entender?! <3");
                //break;
                //}
            
    		//----------------------------------------------------------------
    	
			//Scanner scan = new Scanner (System.in);
			//System.out.println("Quer namorar comigo? [Sim/Não/Talvez]");
			//String querNamorarComigo = scan.nextLine();
			
			
			//if(
				//( querNamorarComigo.equals("Sim") ) ||
				//( querNamorarComigo.equals("sim") )
			//){
					//System.out.println("Ela me ama");
			//}
			//else if(
				//(querNamorarComigo.equals("Não") ) || 
				//(querNamorarComigo.equals("Nao") ) || 
				//(querNamorarComigo.equals("não") ) || 
				//(querNamorarComigo.equals("nao") )
			//){
					//System.out.println("Ela nao me ama :(");
			//}
			//else
			//{
					//System.out.println("Pode responder [Sim/Não/Talvez] para que eu possa entender?! <3");
			//}
            
    	//-Estruturas de Repetição
			//Scanner scan = new Scanner (System.in);
			//System.out.println("Quer contar até quanto?");
			//int cont = scan.nextInt();
			//int x = 1;
			
			//while(x <= cont)
			//{
				//System.out.print(x+", ");
				//x++;
			//}
    	
    		//----------------------------------------------------------------
			
			//Scanner scan = new Scanner (System.in);
			//System.out.println("Quer contar até quanto?");
			//int cont = scan.nextInt();
			//int x = 1;
			//do
			//{
				//System.out.print(x +", ");
				//x++;
			//}
			//while (x <= cont);

    		//-----------------------------------------------------------------
    		
			//Scanner scan = new Scanner (System.in);
			//System.out.println("Quer contar até quanto?");
			//int cont = scan.nextInt();
			
			//for(int x = 0; x <= cont; x++ )
			//{
				//System.out.print(x +", ");
			//}
			
    	//-Array e função
//			Scanner scan = new Scanner (System.in);
//    		System.out.println("Quantas pessoas participam da mentoria?");
//    		int quantAluno = scan.nextInt();
//			String listAluno[] = new String[quantAluno];
//			
//    		for (int c = 0; c < quantAluno; c++)
//    		{
//    			System.out.println("Qual o nome do aluno?");
//    			String nomeAluno = scan.next();
//    			listAluno[c] = nomeAluno;
//    		}
//    		System.out.println("=======LISTA DE ALUNOS=======");
//    		for (int c = 0; c < quantAluno; c++)
//    		{
//    			System.out.println( (c + 1) + "-" + listAluno[c] + ".");
//    		}
//    		
    		
    		
    		
    		
    		
    		
    		
			//for (int cont = 0; cont <= vetor.Length-1 ;cont++);
			//{
			//System.out.print(vetor[cont]);	
			//}
        }
    	
}
