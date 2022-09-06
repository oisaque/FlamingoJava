package exemplo;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if(valor >=20)
			System.out.println("O valor digitado é maior ou igual a que 20");
		else
			System.out.println("O valor é menor que 20");
sc.close();
	}
}
