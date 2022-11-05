package tarefa07;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código de usuário");
		int cod = sc.nextInt();
		
		if (cod == 1234) {
			System.out.println("Informe a senha:");
		} else {
			System.out.println("Usuário Inválido!");
		}
		int senha = sc.nextInt();
		if (senha == 9999) {
			System.out.println("Acesso Permitido!");
		} else {
			System.out.println("Senha Incorreta!");
		}
		sc.close();
	}
}
