package orientacaoAObjetos;

public class ExibirDadosCaneta {
	public static void main(String[] args) {
		Caneta cadastroCaneta = new Caneta();
		cadastroCaneta.marca = "MontBlanc";
		cadastroCaneta.modelo = "RollerBall"; 
		cadastroCaneta.material = "Titanium";
		cadastroCaneta.cor = "Preto";
		cadastroCaneta.preco = 32000;
		
		System.out.println("Marca: "+cadastroCaneta.marca);
		System.out.println("Modelo: "+cadastroCaneta.modelo);
		System.out.println("Material: "+cadastroCaneta.material);
		System.out.println("Cor: "+cadastroCaneta.cor);
		System.out.println("Preço: "+cadastroCaneta.preco);
	}

}
