// 4) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.

package tarefa07;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor");
		int privalor=sc.nextInt();
		
		System.out.println("Insira o segundo valor");
		int segvalor=sc.nextInt();
		
		System.out.println("Insira o terceiro valor");
		int tervalor=sc.nextInt();
		
		if(privalor>tervalor && privalor>segvalor && segvalor>tervalor) {
			System.out.println(privalor+ "," +segvalor);
		}
		else if(privalor<segvalor && privalor>tervalor && segvalor>tervalor) {
			System.out.println(segvalor+ "," +privalor);
		}
		else if(privalor>segvalor && tervalor>segvalor && privalor>tervalor) {
			System.out.println(privalor+ "," +tervalor);
		}
		else if(tervalor>segvalor && tervalor>privalor && privalor>segvalor) {
			System.out.println(tervalor+ "," +privalor);
		}
		else if(segvalor>privalor && segvalor>tervalor && privalor<tervalor) {
			System.out.println(segvalor+ "," +tervalor);
		}
		else if (tervalor>segvalor && tervalor>privalor && segvalor>privalor) {
			System.out.println(tervalor+ "," +segvalor);
		}
		sc.close();
	}
}
