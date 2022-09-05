/* 5) Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real. O programa deve solicitar o valor
da cotação do dólar e também a quantidade de reais disponível com o usuário, para que seja apresentado o valor em moeda americana.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o valor da cotação do dolar atual: ");
		float cotacao = sc.nextFloat();
		
		System.out.println("Insira o valor em reais que você possui: ");
		float real = sc.nextFloat();
		
		float dolar = real/cotacao;
		
		String dolarString = String.format("%.2f", dolar);
		
		System.out.println("Com o esse valor em reais está disponível $"+dolarString+" dólares.");
sc.close();
	}

}

