// Solicite dois valores do teclado e exiba a multiplica��o deles.

package exercicio;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		int numero2 = sc.nextInt();
		
		int multiplicacao = numero1*numero2;
		
		System.out.println("A multiplica��o dos valores digitado �: " +multiplicacao);
sc.close();
	}

}
