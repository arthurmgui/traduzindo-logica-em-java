package orientacao.a.objeto;

public class OrientacaoAObjeto {

	public static void main(String[] args) {
		Controle controle1 = new Controle();
		controle1.carga = false;
		controle1.marca = "samsung";
		controle1.modelo = "smart tv";
		controle1.btnNetflix = false;
		controle1.btnPrime = true;
		//controle1.statusLigado = false;
		
		controle1.ligar();
		controle1.assistirSerie();
		controle1.desligar();
	}

}
