package orientacaoAObjetos;

public class ExibirDadosComputador {
	public static void main(String[] args) {
		Computador cadastroComputador = new Computador();
		cadastroComputador.marca = "Lenovo";
		cadastroComputador.modelo = "ThinkPad";
		cadastroComputador.fabricante = "Lenovo";
		cadastroComputador.processador = "i7";
		cadastroComputador.geracao = "9th";
		cadastroComputador.so = "Windows";
		cadastroComputador.armazenamento = "1TB";
		cadastroComputador.tipoArmazenamento = "SSD";
		cadastroComputador.preco = 4800;
		
		System.out.println("Marca: "+cadastroComputador.marca);
		System.out.println("Modelo: "+cadastroComputador.modelo);
		System.out.println("Fabricante: "+cadastroComputador.fabricante);
		System.out.println("Sistema Operacional: "+cadastroComputador.so);
		System.out.println("Processador: "+cadastroComputador.processador);
		System.out.println("Geração: "+cadastroComputador.geracao);
		System.out.println("Armazenamento: "+cadastroComputador.armazenamento);
		System.out.println("Tipo Armazenamento: "+cadastroComputador.tipoArmazenamento);
		System.out.println("Preço: "+cadastroComputador.preco);
	}

}
