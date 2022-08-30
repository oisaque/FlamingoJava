/* 10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de forma que a variável A passe 
a possuir o valor da variável B e a variável B passe a possuir o valor da variável A.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o valor de A: ");
		String a = sc.nextLine();
		
		System.out.println("Insira o valor de B: ");
		String b = sc.nextLine();
		
		String auxiliar = a;
		a = b;
		b=auxiliar;
		
		System.out.println("O valor de A é "+a+"\n"+"O valor de B é "+b);
sc.close();
	}

}
