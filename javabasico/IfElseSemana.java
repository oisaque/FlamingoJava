package exemplo;

import java.util.Scanner;

public class IfElseSemana {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número entre 1 a 7 para saber o dia da semana: ");
		int dia = sc.nextInt();
		
		if (dia==1) 
		{
			System.out.println("Domingo");
		} else if (dia==2) {
			System.out.println("Segunda-Feira");
		} else if (dia==3) {
			System.out.println("Terça-Feira");		
		} else if (dia==4){
			System.out.println("Quarta-Feira");
		} else if (dia==5){
			System.out.println("Quinta-Feira");
		} else if (dia==6){
			System.out.println("Sexta-Feira");
		} else if (dia==7){
			System.out.println("Sábado");
		} else{
			System.out.println("Esse dia não existe!");
		}
sc.close();
	}
}
