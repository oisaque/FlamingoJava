package orientacaoAObjetos;

public class ExibirDadosCliente {

	public static void main(String[] args) {
		Cliente cadastro01 = new Cliente();
		
		System.out.println("Nome: "+cadastro01.nome);
		System.out.println("CPF: "+cadastro01.cpf);
		System.out.println("Email: "+cadastro01.email);
		System.out.println("Endereço: "+cadastro01.endereco);
	}

}
