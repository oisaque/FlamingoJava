package tarefa07;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto");
		String produto = sc.next();
		
		System.out.println("Informe a quantidade comprada");
		double quantidade = sc.nextDouble();
		
		System.out.println("Insira o valor do produto");
		double preco = sc.nextDouble();
		
		double valor = quantidade * preco;
		double descontoate5 = (valor * 2) / 100;
		double descontomais5 = (valor * 3) / 100;
		double descontomais10 = (valor * 5) / 100;
		double pagamentoate5 = valor - descontoate5;
		double pagamentomais5 = valor - descontomais5;
		double pagamentomais10 = valor - descontomais10;
		
		if (quantidade <= 5) {
			System.out.println(
					"Valor da compra: " + valor + "Desconto: " + descontoate5 + "Valor total: " + pagamentoate5);
		} else if (quantidade > 5 && quantidade <= 10) {
			System.out.println(
					"Valor da compra: " + valor + "Desconto: " + descontomais5 + "Valor total: " + pagamentomais5);
		}
		if (quantidade > 10) {
			System.out.println(
					"Valor da compra: " + valor + "Desconto: " + descontomais10 + "Valor total: " + pagamentomais10);
		}
sc.close();
	}
}
