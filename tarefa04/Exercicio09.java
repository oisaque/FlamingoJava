/* 9) Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do percentual de reajuste (variável PR)
a ser atribuído. Apresentar o valor do novo salário (variável NS).*/

package tarefa04;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o valor do salário mensal: ");
		float SM = sc.nextFloat();
		
		System.out.println("Insira o percentual de reajuste: ");
		float PR = sc.nextFloat();
		
		String NS = String.format("%.2f", PR*SM/100+SM);
		
		System.out.println("O valor do salário reajustado é: "+NS);
sc.close();
	}

}
