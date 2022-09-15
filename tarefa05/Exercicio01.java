//1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!

package tarefa05;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if(valor >10)
			System.out.println("O valor digitado É MAIOR QUE 10!");
		else
			System.out.println("O valor digitado NÃO É MAIOR QUE 10!");
sc.close();
	}
}