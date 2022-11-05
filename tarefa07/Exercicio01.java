// 1) Ler um valor e escrever se é positivo, negativo ou zero.

package tarefa07;

import java.util.Scanner;

public interface Exercicio01 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero=sc.nextInt();
		
		if(numero<0) {
			System.out.println("O número digitado é um número negativo");
		}
		else if(numero>0) {
			System.out.println("O número digitado é um número positivo");
		}
		else {
			System.out.println("O número é 0!");
sc.close();
		}
	}
}
