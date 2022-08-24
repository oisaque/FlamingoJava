/* 11) Escreva um algoritmo para ler as dimensões de um trapézio (base amior, base menor e altura), calcular e escrever a 
 área do trapézio. a=(B+b).h/2 */

package exercicio;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dimesões de um Trapézio" + "\n");
		System.out.println("Digite o valor da base maior: ");
		float baseMaior = sc.nextFloat();
		
		System.out.println("Digite o valor da base menor: ");
		float baseMenor = sc.nextFloat();
		
		System.out.println("Digite o valor da altura: ");
		float altura = sc.nextFloat();
		
		float trapezio = (baseMaior+baseMenor)*altura/2;
		
		System.out.println("A área do trapézio é: " +trapezio);
sc.close();
	}
}
