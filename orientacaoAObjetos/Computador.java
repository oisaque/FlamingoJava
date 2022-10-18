package orientacaoAObjetos;

public class Computador {

	String marca = "DELL", modelo = "Inspiron", fabricante = "DELL", so = "Windows", processador = "i7", geracao = "11th",
	tipoArmazenamento = "Hard Disk";
	String armazenamento = "1TB";
	float preco = 5500;
	
	public static void main(String[] args) {
		Computador cadastroComputador = new Computador();
		System.out.println("Marca: "+cadastroComputador.marca);
		System.out.println("Modelo: "+cadastroComputador.modelo);
		System.out.println("Fabricante: "+cadastroComputador.fabricante);
		System.out.println("Sistema Operacional: "+cadastroComputador.so);
		System.out.println("Processador: "+cadastroComputador.processador);
		System.out.println("Geração: "+cadastroComputador.geracao);
		System.out.println("Armazenamento: "+cadastroComputador.armazenamento);
		System.out.println("Preço: "+cadastroComputador.preco);
	}
}
