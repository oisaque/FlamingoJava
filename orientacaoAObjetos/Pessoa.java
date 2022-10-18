package orientacaoAObjetos;

public class Pessoa {
	
	String [] nome = {"Isaque", "Jose", "Francisco"};
	int [] idade = {22, 25, 34};
	String [] profissao = {"Analista de Dados", "PO", "DBA"};
	
	public static void main(String[] args) {
		Pessoa cadastro01 = new Pessoa();
		System.out.println("Nome: "+cadastro01.nome[0]);
		System.out.println("Idade: "+cadastro01.idade[0]);
		System.out.println("Profissao: "+cadastro01.profissao[0]);
		
		Pessoa cadastro02 = new Pessoa();
		System.out.println("Nome: "+cadastro02.nome[1]);
		System.out.println("Idade: "+cadastro02.idade[1]);
		System.out.println("Profissao: "+cadastro02.profissao[1]);
		
		Pessoa cadastro03 = new Pessoa();
		System.out.println("Nome: "+cadastro03.nome[2]);
		System.out.println("Idade: "+cadastro03.idade[2]);
		System.out.println("Profissao: "+cadastro03.profissao[2]);
	}

}
