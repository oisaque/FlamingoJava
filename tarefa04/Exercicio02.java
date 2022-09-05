//2) Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.

package tarefa04;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o comprimento da caixa: ");
		float comprimento = sc.nextFloat();
		
		System.out.println("Informe a largura da caixa: ");
		float largura = sc.nextFloat();
		
		System.out.println("Informe a altura da caixa: ");
		float altura = sc.nextFloat();
		float volume = comprimento*largura*altura;
		
		System.out.println("O volume da caixa é: "+volume);
sc.close();
	}

}
