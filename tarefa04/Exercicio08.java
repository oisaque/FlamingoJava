/* 8) Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e D). Ao final o programa deve
apresentar o resultado do produto (variável P) do primeiro com o terceiro valor, e o resultado do produto (variável P) do primeiro com o 
terceiro valor, e o resultado da soma (variável S) do segundo com o quarto valor.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o valor de A: ");
		int a = sc.nextInt();
		
		System.out.println("Insira o valor de B: ");
		int b = sc.nextInt();
		
		System.out.println("Insira o valor de C: ");
		int c = sc.nextInt();
		
		System.out.println("Insira o valor de D: ");
		int d = sc.nextInt();
		
		int p = a*c;
		int s = b+d;
		
		System.out.println("O resultado do primeiro com o terceiro é: "+p);
		System.out.println("O resultado do segundo com o quarto é: "+s);
		
sc.close();
	}

}
