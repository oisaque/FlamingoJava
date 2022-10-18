package orientacaoAObjetos;

public class Celular {
		
	String marca = "Iphone", modelo = "XS MAX", fabricante = "Apple", so = "IOS", processador = "Octa Core";
	int armazenamento = 256;
	float preco = 3500;
	
	public static void main(String[] args) {
		Celular cadastroCel = new Celular();
		System.out.println("Marca: "+cadastroCel.marca);
		System.out.println("Modelo: "+cadastroCel.modelo);
		System.out.println("Fabricante: "+cadastroCel.fabricante);
		System.out.println("Sistema Operacional: "+cadastroCel.so);
		System.out.println("Processador: "+cadastroCel.processador);
		System.out.println("Armazenamento: "+cadastroCel.armazenamento);
		System.out.println("Preco: "+cadastroCel.preco);
	}

}
