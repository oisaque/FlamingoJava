/* 2. Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um valor positivo, ou seja, 
o programa deverá apresentar o módulo de um número fornecido. Lembre-se de verificar se o número fornecido é menor que zero; sendo, 
multiplique-o por -1. */

package tarefa06;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int valor1 = sc.nextInt();
		
		if (valor1 <0) {
			float resultado = valor1*-1;
			System.out.println(resultado);
		} else {
			System.out.println(valor1);
		}
		
sc.close();
	}

}
