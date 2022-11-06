/* 6) Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média aritmética e o 
total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa 
deve parar quando o usuário fornecer um valor negativo. Não se esqueça que o usuário pode entrar como primeiro número um número negativo, portanto,
cuidado com a divisão por zero no cálculo da média.*/

package tarefa09;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int contador = 0, soma = 0, num = 0;

		while (num >= 0) {
			System.out.println("Digite um número");
			num = sc.nextInt();

			if (num > 0) {
				contador++;
				soma += num;
			}

		}

		int media = soma / contador;

		System.out.println("Total de valores lidos: " + contador);

		System.out.println("Total da soma: " + soma);

		System.out.println("Total da média: " + media);

sc.close();
	}
}
