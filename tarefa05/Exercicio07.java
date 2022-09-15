// 7) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

package tarefa05;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o valor 1: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Informe o valor 2: ");
		int valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			System.out.println(valor2+", "+valor1);
			
		} else if (valor1 < valor2) {
			System.out.println(valor1+", "+valor2);
sc.close();
		}
	}

}
