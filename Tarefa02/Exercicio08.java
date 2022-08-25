/* 8) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), 
calcular e escrever a área do triângulo. Dica a=b.h/2 */

package exercicio;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dimesões de um Triângulo" + "\n");
		System.out.println("Digite o valor da base: ");
		float base = sc.nextFloat();
		
		System.out.println("Digite o valor da altura: ");
		float altura = sc.nextFloat();
		
		float triangulo = base*altura/2;
		
		System.out.println("A área do triângulo é: " +triangulo);
sc.close();
	}

}
