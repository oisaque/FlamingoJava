// 3) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.

package tarefa04;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o valor de A: ");
		int a = sc.nextInt();
		
		System.out.println("Insira o valor de B: ");
		int b = sc.nextInt();
		
		int quadrado = a*a-b*b;
		
		System.out.println("O resultado da diferença do primeiro valor pelo segundo é: "+quadrado);
sc.close();		
	}

}
