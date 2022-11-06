// 7) Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares situados na faixa numérica de 1 a 10.

package tarefa09;

public class Exercicio07 {
	public static void main(String args[]) {

		// TODO Auto-generated method stub

		int numero = 10, contadora = 1, fatorial = 1;

		do {
			if (numero % 2 != 0) {

				fatorial = fatorial * contadora;
			}

			System.out.println(fatorial);

			contadora++;

		} while (contadora <= numero);
	}
}
