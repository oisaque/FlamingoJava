/* 4) Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar. O programa deve solicitar o 
 valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o valor da cotação do dolar atual: ");
		float cotacao = sc.nextFloat();
		
		System.out.println("Insira o valor em dólares que você possui: ");
		float dolar = sc.nextFloat();
		
		float real = cotacao*dolar;
		
		String realString = String.format("%.2f", real);
		
		System.out.println("Com o esse valor em dólares está disponível R$"+realString+" reais.");
sc.close();
	}

}
