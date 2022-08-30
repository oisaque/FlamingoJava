/*3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do 
novo salário.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe seu salário mensal atual: ");
		float salario = sc.nextFloat();
		
		System.out.println("Informe o percentual de reajuste: ");
		float reajuste = sc.nextFloat();
		
		System.out.println("O valor do salário reajustado é: "+reajuste*salario/100);
sc.close();
	}

}
