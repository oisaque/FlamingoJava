package tarefa07;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno");
		double prinota = sc.nextDouble();
		
		System.out.println("Digite a segumda nota do aluno");
		double segnota = sc.nextDouble();
		
		System.out.println("Digite a terceira nota do aluno");
		double ternota = sc.nextDouble();
		
		System.out.println("Insira qual a média dos exercícios que fazem parte da avaliação");
		double media = sc.nextDouble();
		
		double mediaaproveitamento = (prinota + segnota * 2 + ternota * 3 + media) / 7;
		System.out.println(mediaaproveitamento);
		
		if (mediaaproveitamento >= 9) {
			System.out.println("Conceito A");
		} else if (mediaaproveitamento >= 7.5 && mediaaproveitamento < 9.0) {
			System.out.println("Conceito B");
		}
		if (mediaaproveitamento >= 6 && mediaaproveitamento < 7.5) {
			System.out.println("Conceito C");
		} else if (mediaaproveitamento < 6) {
			System.out.println("Conceito D");
		}
sc.close();
	}
}
