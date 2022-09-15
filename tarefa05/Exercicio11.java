/* 11) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual 
(saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo',
senão escrever a mensagem 'Saldo Negativo'. */

package tarefa05;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o Saldo: ");
		float saldo = sc.nextFloat();
		
		System.out.println("Informe o Débito: ");
		float debito = sc.nextFloat();
		
		System.out.println("Informe o Crédito: ");
		float credito = sc.nextFloat();
		
		float saldoAtual = saldo-debito+credito;
		
		if (saldoAtual >0 ) {
			System.out.println("Saldo Positivo - R$"+saldoAtual);
		} else {
			System.out.println("Saldo Negativo - R$"+saldoAtual);
sc.close(); 
		}
	}

}
