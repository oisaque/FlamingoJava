package orientacaoAObjetos;

public class Bicicleta {
	
	String marca = "GTS", modelo = "M1", aro = "29'", freio = "A Disco", quadro = "Alumínio";
	float preco = 899.99f;
	
	public static void main(String[] args) {
		
		Bicicleta cadastroBicicleta = new Bicicleta();
		
		System.out.println("Marca: "+cadastroBicicleta.marca);
		System.out.println("Modelo: "+cadastroBicicleta.modelo);
		System.out.println("Aro: "+cadastroBicicleta.aro);
		System.out.println("Quadro: "+cadastroBicicleta.quadro);
		System.out.println("Freio: "+cadastroBicicleta.freio);
		System.out.println("Preço: "+cadastroBicicleta.preco);
	}

}
