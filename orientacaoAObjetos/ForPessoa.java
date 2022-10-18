package orientacaoAObjetos;

public class ForPessoa {
	
	String [] nome = {"Isaque", "Jose", "Francisco"};
	int [] idade = {22, 25, 34};
	String [] profissao = {"Analista de Dados", "PO", "DBA"};
	
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			ForPessoa cadastro = new ForPessoa();
			System.out.println(i+1+"Nome: "+cadastro.nome[i]);
			System.out.println("Idade: "+cadastro.idade[i]);
			System.out.println("Profissão: "+cadastro.profissao[i]);
			
		}
	}

}
