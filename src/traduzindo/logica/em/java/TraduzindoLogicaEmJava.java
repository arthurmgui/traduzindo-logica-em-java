package traduzindo.logica.em.java;

import java.util.Scanner;


public class TraduzindoLogicaEmJava {
	
	public static void operadoresAritmeticos() {
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
	
    public static void operadoresRelacionais () {

    	Scanner scan = new Scanner (System.in);
        System.out.println("Digite dois valores! \n"+
        "\n Primeiro valor: ");
        int valorA = scan.nextInt();
        System.out.print("Segundo valor: ");
        int valorB = scan.nextInt();
        
        if(valorA == valorB){
            System.out.println("Os valores são iguais.");
        }else if(valorA > valorB){
            System.out.println("Os valores são diferentes, "+ valorA +" é maior que "+ valorB +".");
        }else{
            System.out.println("Os valores são diferentes, "+ valorB + " é maior que "+ valorA +".");
        }
    }
    
    public static void operadoresLogicos() {
    	
    	Scanner scan = new Scanner (System.in);
		System.out.println("Quer namorar comigo? [Sim/Não/Talvez]");
		String querNamorarComigo = scan.nextLine();
		
		if(
			( querNamorarComigo.equals("Sim") ) ||
			( querNamorarComigo.equals("sim") )
		){
				System.out.println("Ela me ama");
		}
		else if(
			(querNamorarComigo.equals("Não") ) || 
			(querNamorarComigo.equals("Nao") ) || 
			(querNamorarComigo.equals("não") ) || 
			(querNamorarComigo.equals("nao") )
		){
				System.out.println("Ela nao me ama :(");
		}
		else
		{
				System.out.println("Pode responder [Sim/Não/Talvez] para que eu possa entender?! <3");
		}
    }
    
    public static void estruturasCondicionais() {
        
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
	}

    public static void estruturasDeRepeticao() {

    	System.out.println("Digite um número para escolher qual estrutura vai usar: \n"+
    	    	"\n[1] while."+
    	    	"\n[2] do while."+
    	    	"\n[3] for.");
		Scanner scan = new Scanner (System.in);
		int estrutura = scan.nextInt();
		
		switch(estrutura) {
			case (1):
				System.out.println("Quer contar até quanto?");
				int cont1 = scan.nextInt();
				int x = 1;
				
				while(x <= cont1){
					System.out.print(x+", ");
					x++;
				}
			break;
			case (2):
				System.out.println("Quer contar até quanto?");
				int cont2 = scan.nextInt();
				int y = 1;
				do{
					System.out.print(y +", ");
					y++;
				}
				while (y <= cont2);
			break;
			case (3):
				System.out.println("Quer contar até quanto?");
				int cont3 = scan.nextInt();
				
				for(int z = 0; z <= cont3; z++ ){
					System.out.print(z +", ");
				}
			break;	
		}
    }
    
    public static void array() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Quantas pessoas participam da mentoria?");
		int quantAluno = scan.nextInt();
		String listAluno[] = new String[quantAluno];
		
		for (int c = 0; c < quantAluno; c++){
			System.out.println("Qual o nome do aluno?");
			String nomeAluno = scan.next();
			listAluno[c] = nomeAluno;
		}
		System.out.println("=======LISTA DE ALUNOS=======");
		
		for (int c = 0; c < quantAluno; c++){
			System.out.println( (c + 1) + "-" + listAluno[c] + ".");
		}
		
		//------------------------------------------------------------------------
		
		//for (int cont = 0; cont <= vetor.Length-1 ;cont++);
		//{
		//System.out.print(vetor[cont]);	
		//}
    }
    
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner (System.in);
    	String resp;
    	do {
	    	System.out.println("Olá! Digite um número para escolher o contúedo desejado em java: \n"+
	    	"\n[1] Operadores Aritméticos."+
	    	"\n[2] Operadores Relacionais."+
	    	"\n[3] Operadores Lógicos."+
	    	"\n[4] Estruturas Condicionais."+
	    	"\n[5] Estruturas de repetição."+
	    	"\n[6] Array.");
	    	int desejo = scan.nextInt();
	    	
	    	switch(desejo) {
		    	case (1):
		    		operadoresAritmeticos();
		    	break;
		    	case (2):
		    		operadoresRelacionais();
		    	break;
		    	case (3):
		    		operadoresLogicos();
		    	break;
		    	case (4):
		    		estruturasCondicionais();
		    	break;
		    	case (5):
		    		estruturasDeRepeticao();
		    	break;
		    	case (6):
		    		array();
		    	break;
	    	}
	    	System.out.println("Deseja continuar?");
	    	System.out.println("[sim/não]");
	    	resp = scan.next();
    	}
    	while (resp.equals("sim"));
			
   }
    	
}
