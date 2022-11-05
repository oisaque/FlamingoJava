// 3) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

package tarefa07;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor");
		int privalor=sc.nextInt();
		
		System.out.println("Insira o segundo valor");
		int segvalor=sc.nextInt();
		
		System.out.println("Insira o terceiro valor");
		int tervalor=sc.nextInt();
		
		if(privalor>tervalor && segvalor>tervalor) {
			System.out.println(privalor+segvalor);
		}
		else if(privalor>segvalor && tervalor>segvalor) {
			System.out.println(privalor+tervalor);
		}
		if(segvalor>privalor && tervalor>privalor) {
			System.out.println(segvalor+tervalor);
		}
		sc.close();
	}
}
