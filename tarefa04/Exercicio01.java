/* 1) Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na utilização do conceito da propriedade 
distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C,
B com D e por fim C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de multiplicação e apresentar doze 
resultados de saída*/

package tarefa04;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o valor de A: ");
		int a = sc.nextInt();
		
		System.out.println("Insira o valor de B: ");
		int b = sc.nextInt();
		
		System.out.println("Insira o valor de C: ");
		int c = sc.nextInt();
		
		System.out.println("Insira o valor de D: ");
		int d = sc.nextInt();
		
		int aSomaB = a+b, aSomaC = a+c, aSomaD = a+d, bSomaC = b+c, bSomaD = b+d, cSomaD = c+d;
		
		int aVezesB = a*b, aVezesC = a*c, aVezesD = a*d, bVezesC = b*c, bVezesD = b*d, cVezesD = c*d;
		
		System.out.println("A+B = "+aSomaB); System.out.println("A+C = "+aSomaC); System.out.println("A+D = "+aSomaD);
		System.out.println("B+C = "+bSomaC); System.out.println("B+D = "+bSomaD); System.out.println("C+D = "+cSomaD+"\n");
		System.out.println("A*B = "+aVezesB); System.out.println("A*C = "+aVezesC); System.out.println("A*D = "+aVezesD);
		System.out.println("B*C = "+bVezesC); System.out.println("B*D = "+bVezesD); System.out.println("C*D = "+cVezesD);
sc.close();		
	}

}
