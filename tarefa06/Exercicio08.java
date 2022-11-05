// 8. Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.

package tarefa06;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva valor de A");
		int A=sc.nextInt();
		System.out.println("Escreva valor de B");
		int B=sc.nextInt();
		System.out.println("Escreva o valor de C");
		int C=sc.nextInt();
		System.out.println("Escreva o valor de D");
		int D=sc.nextInt();
		System.out.println("Escreva o valor de E");
		int E=sc.nextInt();
		
		if (A>B && A>C && A>D && A>E) {
			System.out.println(A);
		}
		else if (A<B && A<C && A<D && A<E) {
			System.out.println(A);
		}
		else if (B>A && B>C && B>D && B>E) {
			System.out.println(B);
		}
		else if (B<A && B<C && B<D && B<E) {
			System.out.println(B);
		}
		else if (C>A && C>B && C>D && C>E) {
			System.out.println(C);
		}
		else if (C<A && C<B && C<D && C<E) {
			System.out.println(C);
		}
		else if (D>A && D>B && D>C && D>E) {
			System.out.println(D);
		}
		else if (D<A && D<B && D<C && D<E) {
			System.out.println(D);
		}
		else if (E>A && E>B && E>C && E>D) {
			System.out.println(E);
		}
		else if (E<A && E<B && E<C && E<D) {
			System.out.println(E);
		}
sc.close();
	}
}