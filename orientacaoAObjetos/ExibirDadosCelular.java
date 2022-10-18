package orientacaoAObjetos;

public class ExibirDadosCelular {
	public static void main(String[] args) {
		
	Celular cadastroCelular = new Celular();
	System.out.println("Marca: "+cadastroCelular.marca);
	System.out.println("Modelo: "+cadastroCelular.modelo);
	System.out.println("Fabricante: "+cadastroCelular.fabricante);
	System.out.println("Sistema Operacional: "+cadastroCelular.so);
	System.out.println("Processador: "+cadastroCelular.processador);
	System.out.println("Armazenamento: "+cadastroCelular.armazenamento);
	}
}
