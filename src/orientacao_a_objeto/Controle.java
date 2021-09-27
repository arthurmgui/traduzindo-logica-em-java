package orientacao_a_objeto;

public class Controle {
	
	public boolean carga;
	private String marca;
	private String modelo;
	private boolean btnNetflix;
	private boolean btnPrime;
	private boolean statusLigado;
	
	public Controle(boolean carg, String ma, String mo, boolean netflix, boolean prime) {
		this.carga = carg;
		this.marca = ma;
		this.modelo = mo;
		this.btnNetflix = netflix;
		this.btnPrime = prime;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String mod) {
		this.modelo = mod;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marc) {
		this.marca = marc;
	}
	
	public void setNetflix(boolean net) {
		this.btnNetflix = net;
	}
	
	public boolean getNetflix() {
		return this.btnNetflix;
	}
	
	public void setPrime(boolean prim) {
		this.btnPrime = prim;
	}
	
	public boolean getPrime() {
		return this.btnPrime;
	}
	
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

