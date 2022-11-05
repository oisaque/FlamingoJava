/* 10. Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. Após a leitura do valor fornecido pelo usuário, 
o programa deverá indicar uma de duas mensagens: "O valor está na faixa permitida", caso o usuário forneça o valor nesta faixa, ou a mensagem 
 * "O valor está fora da faixa permitida", caso o usuário forneça valores menores que 1 ou maiores que 9.*/

package tarefa06;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor entre 1 e 9");
		int valor = sc.nextInt();
		if(valor>=1 && valor<=9) {System.out.println("Valor dentro da faixa permitida");}
		else {System.out.println("Valor fora da faixa permitida");
sc.close();
		}
	}
}

