// Solicite dois valores do teclado e exiba a divisão deles.

package exercicio;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		int numero2 = sc.nextInt();
		
		float divisao = numero1/numero2;
		
		System.out.println("A divisão dos valores digitado é: " +divisao);
sc.close();
	}

}
