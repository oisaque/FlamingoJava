/* 9) Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do somatório e a média aritmética dos valores 
lidos.*/

package tarefa08;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o primeiro valor");
		int num1 = sc.nextInt();

		System.out.println("Insira o segundo valor");
		int num2 = sc.nextInt();

		System.out.println("Insira o terceiro valor");
		int num3 = sc.nextInt();

		System.out.println("Insira o quarto valor");
		int num4 = sc.nextInt();

		System.out.println("Insira o quinto valor");
		int num5 = sc.nextInt();

		System.out.println("Insira o sexto valor");
		int num6 = sc.nextInt();

		System.out.println("Insira o sétimo valor");
		int num7 = sc.nextInt();

		System.out.println("Insira o oitavo valor");
		int num8 = sc.nextInt();

		System.out.println("Insira o nono valor");
		int num9 = sc.nextInt();

		System.out.println("Insira o décimo valor");
		int num10 = sc.nextInt();

		int soma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;

		int media = soma / 10;

		System.out.println("A soma dos valores é de: " + soma);

		System.out.println("A média dos valores é de: " + media);

sc.close();
	}
}
