// 1) Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.

package tarefa06;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o primeiro valor: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Insira o segundo valor: ");
		int valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			int resultado = valor1-valor2;
			System.out.println("O resultado da divisão é: "+resultado);
		} else {
			int resultado = (valor2-valor1);
			System.out.println("O resultado da divisão é: "+resultado);
sc.close();
		}
		
	}

}
