// 6) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

package tarefa05;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o valor 1: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Informe o valor 2: ");
		int valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("O valor 1 é o maior.");
			
		} else if (valor1 < valor2) {
			System.out.println("O valor 2 é o maior. ");
sc.close();
		}
	}

}