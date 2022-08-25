/* 9) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a 
área do quadrado. Dica a=l² */

package exercicio;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dimesões de um Quadrado" + "\n");
		System.out.println("Digite o valor da base: ");
		float lado = sc.nextFloat();
		
		
		float quadrado = lado*lado;
		
		System.out.println("A área do quadrado é: " +quadrado);
sc.close();
	}

}
