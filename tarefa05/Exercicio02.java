// 2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

package tarefa05;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if (valor <0) {
			System.out.println("O valor é negativo!");
			
		} else if (valor >=0) {
			System.out.println("O valor é positivo!");
sc.close();
		}
	}
}
