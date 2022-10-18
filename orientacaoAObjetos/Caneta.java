package orientacaoAObjetos;

public class Caneta {
	String marca = "Bic", modelo = "Básico", material = "Plástico", cor = "Azul";
	int preco = 2;
	
	public static void main(String[] args) {
		
		Caneta cadastroCaneta = new Caneta();
		System.out.println("Marca: "+cadastroCaneta.marca);
		System.out.println("Modelo: "+cadastroCaneta.modelo);
		System.out.println("Material: "+cadastroCaneta.material);
		System.out.println("Cor: "+cadastroCaneta.cor);
		System.out.println("Preço: "+cadastroCaneta.preco);

	}

}