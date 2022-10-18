package orientacaoAObjetos;

public class ExibirDadosBicicleta {
	public static void main(String[] args) {
		
		Bicicleta cadastroBicicleta = new Bicicleta();
		cadastroBicicleta.marca = "Caloi";
		cadastroBicicleta.modelo = "MontainBike Velox"; 
		cadastroBicicleta.aro = "29'";
		cadastroBicicleta.freio = "V-Brake";
		cadastroBicicleta.quadro = "Alumínio";
		cadastroBicicleta.preco = 999.99f;
			
		System.out.println("Marca: "+cadastroBicicleta.marca);
		System.out.println("Modelo: "+cadastroBicicleta.modelo);
		System.out.println("Aro: "+cadastroBicicleta.aro);
		System.out.println("Quadro: "+cadastroBicicleta.quadro);
		System.out.println("Freio: "+cadastroBicicleta.freio);
		System.out.println("Preço: "+cadastroBicicleta.preco);
	}
	

}
