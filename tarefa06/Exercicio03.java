/* 3. Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, 
se o valor da média escolar for maior ou igual a 5. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. 
Apresentar junto das mensagens o valor da média do aluno para qualquer condição.*/

package tarefa06;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira a primeira nota: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Insira a segunda nota: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Insira a terceira nota: ");
		float nota3 = sc.nextFloat();
		
		System.out.println("Insira a quarta nota: ");
		float nota4 = sc.nextFloat();
		
		float media = (nota1+nota2+nota3+nota4)/4;
		
		if (media >0 && media <5) {
			System.out.println("O aluno foi REPROVADO! Média "+media);
		} else {
			System.out.println("O aluno foi APROVADO! Média "+media);
sc.close();
		}
	}
}
