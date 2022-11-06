/* 6) Elaborar um programa que apresente como resultado o valor de uma potência de uma base qualquer elevada a um expoente qualquer, ou seja, 
de BE, em que B é o valor da base e E o valor do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do 
portuguol (^).*/

package tarefa08;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int contador = 0;
		int soma = 0;
		int num = 0;

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
