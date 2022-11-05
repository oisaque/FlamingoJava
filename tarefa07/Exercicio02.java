//2) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

package tarefa07;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int privalor=sc.nextInt();
		
		System.out.println("Digite o segundo valor");
		int segvalor=sc.nextInt();
		
		System.out.println("Digite o terceiro valor");
		int tervalor=sc.nextInt();
		
		if(privalor>segvalor && privalor>tervalor) {
			System.out.println("O maior valor é o: " +privalor);
		}
		else if(segvalor>privalor && segvalor>tervalor) {
			System.out.println("O maior valor é o: " +segvalor);
		}
		if(tervalor>privalor && tervalor>segvalor) {
			System.out.println("O maior valor é o: " +tervalor);
		}
		sc.close();
	}
}
