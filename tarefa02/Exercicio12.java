/* 12) Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular e escrever a área do circulo. a=pi*r² */

package exercicio;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Raio de um Círculo" + "\n");
		
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double circulo = Math.PI* Math.pow(raio, 2);//(raio*raio);
		
		System.out.println("O raio do círculo é igual a: " +circulo);
sc.close();
	}
}