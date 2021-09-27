package orientacao_a_objeto;

import java.util.Scanner;

public class OrientacaoAObjeto {

	public static void main(String[] args) {
//		Controle controle1 = new Controle();
//		controle1.carga = false;
//		controle1.setMarca("samsung");
//		controle1.setModelo("smart tv");
//		controle1.btnNetflix = false;
//		controle1.btnPrime = true;
		//controle1.statusLigado = false;
		
//		controle1.ligar();
//		controle1.assistirSerie();
//		controle1.desligar();
		
		Controle controle2 = new Controle(true, "samsung", "smart tv", false, false);
		
		controle2.ligar();
		controle2.assistirSerie();
		controle2.desligar();
		
		System.out.println("Deseja instalar Prime Video ou Netflix?");
		Scanner scan = new Scanner(System.in);
		String resp = scan.nextLine().intern();
		if ( (resp == "netflix") || (resp == "Netflix") ){
			controle2.setNetflix(true);
		}
		else if( (resp == "Prime Video") || (resp == "prime video") ) {
			controle2.setPrime(true);
		}
			
		controle2.ligar();
		controle2.assistirSerie();
		controle2.desligar();
	}
}
