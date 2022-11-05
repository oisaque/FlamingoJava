// 7. Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3

package tarefa06;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o valor de A: ");
		int a = sc.nextInt();
		
		System.out.println("Informe o valor de B: ");
		int b = sc.nextInt();
		
		System.out.println("Informe o valor de C: ");
		int c = sc.nextInt();
		
		if (a > b && c < b ) {
			System.out.println(a+" "+b+" "+c);			
		} else if (a > b && b < c ) {
			System.out.println(a+" "+c+" "+b);
		} else if (b > c && c < a) {
			System.out.println(b+" "+a+" "+c);
		} else if (b > c && a < c) {
			System.out.println(b+" "+c+" "+a);
		} else if (c > a && b < a) {
			System.out.println(c+" "+a+" "+b);
		} else if (c > a && a < b) {
			System.out.println(c+" "+b+" "+a);
		}
sc.close();
	}
}
