package orientacaoAObjetos;

public class ExibirDadosCadeira {
	public static void main(String[] args) {
		
		CadeiraGamer cadastroCadeira = new CadeiraGamer();
		cadastroCadeira.marca = "Pichau";
		cadastroCadeira.modelo = "Donek";
		cadastroCadeira.cor = "Branco";
		cadastroCadeira.material = "Couro";
		cadastroCadeira.peso = 180f;
		cadastroCadeira.base = "Metal";
		cadastroCadeira.braco = "Ajustaveis";
		cadastroCadeira.medidas = "190cm";
		cadastroCadeira.preco = 879.9f;
		
		System.out.println("Marca: "+cadastroCadeira.marca);
		System.out.println("Modelo: "+cadastroCadeira.modelo);
		System.out.println("Cor: "+cadastroCadeira.cor);
		System.out.println("Material: "+cadastroCadeira.material);
		System.out.println("Peso Suportado: "+cadastroCadeira.peso+"kg");
		System.out.println("Base: "+cadastroCadeira.base);
		System.out.println("Braço: "+cadastroCadeira.braco);
		System.out.println("Medidas: "+cadastroCadeira.medidas);
		System.out.println("Preço: R$"+cadastroCadeira.preco);
	}
}
