/* 6) Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à soma dos quadrados dos três 
valores lidos.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de A: ");
		int a = sc.nextInt();
		
		System.out.println("Insira o valor de B: ");
		int b = sc.nextInt();
		
		System.out.println("Insira o valor de C: ");
		int c = sc.nextInt();
		
		int quadrado = (a*a)+(b*b)+(c*c);
		
		System.out.println("A soma do quadrado dos valores solicitados é: "+quadrado);
sc.close();
	}

}
