package orientacaoAObjetos;

public class Mesa {
	String marca = "E-Led Brasil", modelo = "Mesa de Jantar", materialTampa = "MDP", materialBase = "Aço Inoxidavel",
	comprimentoMaximo = "120cm", largura = "90cm", altura = "77cm";
	float preco = 370.49f;
	
	public static void main(String[] args) {
		
		Mesa cadastroMesa = new Mesa();
		System.out.println("Marca: "+cadastroMesa.marca);
		System.out.println("Modelo: "+cadastroMesa.modelo);
		System.out.println("Material da Tampa: "+cadastroMesa.materialTampa);
		System.out.println("Material da Base: "+cadastroMesa.materialBase);
		System.out.println("Comprimento Máximo: "+cadastroMesa.comprimentoMaximo);
		System.out.println("Largura: "+cadastroMesa.largura);
		System.out.println("Altura: "+cadastroMesa.altura);
		System.out.println("Preço: R$"+cadastroMesa.preco);
	}

}
