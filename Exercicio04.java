// 4) Solicite dois valores do teclado e exiba a subtra��o deles.

package exercicio;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		int numero2 = sc.nextInt();
		
		int subtracao = numero1-numero2;
		System.out.println("A subtra��o dos n�meros digitados � igual a: " +subtracao);
sc.close();
	}

}
