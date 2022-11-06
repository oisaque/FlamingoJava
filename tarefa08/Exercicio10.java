// 10) Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores pares situados na faixa numérica de 50 a 70.

package tarefa08;

public class Exercicio10 {
	public static void main(String args[]) {

		int soma = 0, cont = 50, par;

		while (cont < 71)
		{
			if (cont % 2 == 0)
			{
				soma = cont + soma;
				par = cont;
				cont++;
			} else {
				cont++;
			}
		}
		
		int media = soma / 11;

		System.out.println("A soma dos valores é: " + soma);

		System.out.println("A média dos valores é: " + media);

	}
}
