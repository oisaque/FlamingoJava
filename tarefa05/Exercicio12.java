/* 12) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um 
produto. Calcular e escrever a quantidade média ((quantidademédia = quantidade máxima + quantidade mínima)/2). Se a quantidade em 
estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.*/

package tarefa05;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade atual desse produto em estoque: ");
		float quantidadeAtual = sc.nextFloat();
		
		System.out.println("Informe a quantidade mínima desse produto em estoque: ");
		float quantidadeMinima = sc.nextFloat();
		
		System.out.println("Informe a quantidade máxima desse produto em estoque: ");
		float quantidadeMaxima = sc.nextFloat();
		
		float quantidadeMedia = (quantidadeMaxima+quantidadeMinima)/2;
		
		if (quantidadeAtual >= quantidadeMedia) {
			System.out.println("Não efetuar a compra!");
		} else {
			System.out.println("Efetuar a compra!");
sc.close();
		}
		
	}
}
