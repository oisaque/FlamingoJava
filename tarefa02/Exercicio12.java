/* 12) Escreva um algoritmo para ler as dimens�es de um circulo (raio), calcular e escrever a �rea do circulo. a=pi*r� */

package exercicio;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Raio de um C�rculo" + "\n");
		
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double circulo = Math.PI* Math.pow(raio, 2);//(raio*raio);
		
		System.out.println("O raio do c�rculo � igual a: " +circulo);
sc.close();
	}
}