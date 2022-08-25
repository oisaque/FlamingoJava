// 2) Solicite um valor do teclado e exiba seu antecessor.

package exercicio;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int numero=sc.nextInt();
		int antecessor= numero-1;
		
		System.out.println("O antecessor do número " +numero+ " é : " +antecessor);
		
sc.close();
	}

}
