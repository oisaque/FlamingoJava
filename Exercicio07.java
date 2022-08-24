/* 7) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), 
calcular e escrever a área do retângulo. Dica a=b.h */

package exercicio;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dimesões de um Retângulo" + "\n");
		System.out.println("Digite o valor da base: ");
		float base = sc.nextFloat();
		
		System.out.println("Digite o valor da altura: ");
		float altura = sc.nextFloat();
		
		float retangulo = base*altura;
		
		System.out.println("A área do retângulo é: " +retangulo);
sc.close();
	}

}