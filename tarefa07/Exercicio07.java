package tarefa07;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int privalor = sc.nextInt();
		
		System.out.println("Digite o segundo valor");
		int segvalor = sc.nextInt();
		
		if (privalor == segvalor) {
			System.out.println("Os valores são iguais");
		} else if (privalor > segvalor) {
			System.out.println("O primeiro valor é maior");
		}
		if (segvalor > privalor) {
			System.out.println("O segundo valor é maior");
		}
		sc.close();
	}
}
