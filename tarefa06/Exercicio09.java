//9. Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.

package tarefa06;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int numero=sc.nextInt();
		
		if(numero % 2 == 0) {System.out.println("O número é par!");}
		else {System.out.println("O número é ímpar");
sc.close();				
		}
	} 
}
