// 9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).

package tarefa03;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcule o valor da sua parcela com reajuste."+"\n");
		
		System.out.println("Informe o valor da parcela em atraso: ");
		float valor = sc.nextFloat();
		
		System.out.println("Informe o valor da taxa: ");
		float taxa = sc.nextFloat();
		
		System.out.println("Informe a quantiade de dias em atraso: ");
		float tempo = sc.nextFloat(); 
		
		float prestacao = valor+(valor*taxa/100)*tempo;
		
		System.out.println("O valor da parcela com reajuste fica R$"+prestacao);
sc.close();
	}

}
