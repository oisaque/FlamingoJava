/* 4) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga 
se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada. */

package tarefa05;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a nota da primeira avaliação: ");
		float avaliacao1 = sc.nextFloat();
		
		System.out.println("Informe a nota da segunda avaliaçãoo: ");
		float avaliacao2 = sc.nextFloat();
		
		float media = (avaliacao1+avaliacao2)/2;
		
		if (media >=6) {
			System.out.println("A média do aluno foi de "+media+" e o aluno foi APROVADO!");
			
		} else if (media <6) {
			System.out.println("A média do aluno foi de "+media+" e o aluno foi REPROVADO!");
sc.close();
		}
	}

}
