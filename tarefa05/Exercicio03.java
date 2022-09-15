/* 3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se foremcompradas pelo menos 12. 
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.*/

package tarefa05;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o valor de maçãs que deseja comprar: ");
		float macas = sc.nextFloat();
		
		if (macas >0 && macas <12) {
			System.out.println("O custo total da compra é: "+macas*1.3);
			
		} else {
			System.out.println("O custo total da compra é: "+macas);
sc.close();
		}
		
	}

}
