// 2) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.

package tarefa10;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número para obter sua tabuada");
		int numero = sc.nextInt();

		for (int contador = 0; contador < 11; contador++) {
			System.out.println(numero * contador);
		}

sc.close();
	}
}
