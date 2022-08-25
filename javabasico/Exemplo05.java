package javabasico;

import java.util.Scanner;
public class Exemplo05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero=sc.nextInt();
		int numero1=sc.nextInt();
		int soma=numero+numero1;
		System.out.println("O valor da soma é: " +soma);
	}

}