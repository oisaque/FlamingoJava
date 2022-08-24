/* 10) Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a 
 área do losango. Dica a=D.d/2 */

package exercicio;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dimesões de um Losango" + "\n");
		System.out.println("Digite o valor da diagonal maior: ");
		float diagMaior = sc.nextFloat();
		
		System.out.println("Digite o valor da diagonal menor: ");
		float diagMenor = sc.nextFloat();
		
		float losango = diagMaior*diagMenor/2;
		
		System.out.println("A área do losango é: " +losango);
sc.close();
	}

}
