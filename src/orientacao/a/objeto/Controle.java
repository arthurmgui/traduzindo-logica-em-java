package orientacao.a.objeto;

public class Controle {
	
	public boolean carga;
	public String marca;
	public String modelo;
	public boolean btnNetflix;
	public boolean btnPrime;
	private boolean statusLigado;
	
	public void ligar() {
		if( (carga == true) && (marca == "samsung") && (statusLigado == false)){
			System.out.println("LIGANDO SMART TV SAMSUNG");
			this.statusLigado = true;
		}
		else if( ( carga == false) && (marca == "samsung") ){
			System.out.println("SEM CARGA!\n"+
					"\nTroque as pilhas do seu controle!");
		}
		else if( ( carga == true) && (marca != "samsung") ){
			System.out.println("!Modelo de controle incompatível!");
		}
		else {
			System.out.println("ERRO!");
		}
	}
	
	public void desligar() {
		if( (carga == true) && (marca == "samsung") && (statusLigado == true)){
			System.out.println("DESLIGANDO SMART TV SAMSUNG");
			this.statusLigado = false;
		}
		else if( ( carga == false) && (marca == "samsung") ){
			System.out.println("SEM CARGA!\n"+
					"\nTroque as pilhas do seu controle!");
		}
		else if( ( carga == true) && (marca != "samsung") ){
			System.out.println("!Modelo de controle incompatível!");
		}
		else {
			System.out.println("ERRO!");
		}
	}
	
	public void assistirSerie() {
		if( ( (statusLigado == true) && (modelo == "smart tv") ) &&
			( (btnNetflix == true) || (btnPrime == true) ) ){

			if( (btnNetflix == true) && (btnPrime == false) ) {
				System.out.println("NETFLIX");
			}
			else if( (btnNetflix == false) && (btnPrime == true) ) {
				System.out.println("PRIME VIDEO");
			}
		}
		else if((statusLigado == true) && (modelo != "smart tv")) {
			System.out.println("SUA TV É INCOMPATÍVEL PARA ESSE SERVIÇO");
		}
		else if( (btnNetflix == false) && (btnPrime == false) ) {
			System.out.println("VOCÊ NÃO POSSUI SERVIÇOS DE STREAMER");
		}
	}
}

