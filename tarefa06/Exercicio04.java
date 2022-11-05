/* 4. Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, 
se o valor da média escolar for maior ou igual a 5. Se o valor da média for menor que 7, solicitar a nota de exame, somar com o valor
da média e obter nova média. Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar com as mensagens o valor da média do aluno, para qualquer condição.
*/

package tarefa06;

import java.util.Scanner;

public class Exercicio04 {
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
				
		if (media >7) {
			System.out.println("A média foi "+media+" Aluno Aprovado!");
		} else {
			System.out.println("A média foi "+media+".\nInforme a nota do Exame: ");
			float exame = sc.nextFloat();
			media = (exame+media)/2;
			
		if (media >5) {
			System.out.println("A média foi "+media+". Aluno Aprovado!");
		} else {
			System.out.println("A média foi "+media+". Aluno Reprovado!");
		}
sc.close();
		}
	}
}