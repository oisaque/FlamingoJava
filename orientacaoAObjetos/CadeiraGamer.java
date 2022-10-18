package orientacaoAObjetos;

public class CadeiraGamer {
	String marca = "TGT", modelo = "Heron", cor = "Preto", base = "Aço", braco = "Fixo", material = "Couro", medidas = "190cm";
	float peso = 120f, preco = 639.9f; 
	
	public static void main(String[] args) {
		CadeiraGamer cadastroCadeira = new CadeiraGamer();
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