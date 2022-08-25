// 3) Solicite dois valores do teclado e exiba a soma deles.

package exercicio;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite outro valor");
		int numero2 = sc.nextInt();

		int soma = numero1+numero2;
		System.out.println("A soma dos números digitados é igual a: " +soma);
sc.close();
	}

}
