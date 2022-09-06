package exemplo;

import java.util.Scanner;

public class imc {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Informe sua altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso/(altura*altura);
		
		if (imc < 18.5) {
			System.out.println("\n"+"Magreza");
		} else if (imc >=18.5 && imc <=24.9) {
			System.out.println("\n"+"Normal");
		} else if (imc >=25 && imc <=29.9) {
			System.out.println("\n"+"Sobrepeso");	
		} else if (imc >=30 && imc <=34.9) {
			System.out.println("\n"+"Obesidade Grau 1");
		} else if (imc >=35 && imc <=39.9) {
			System.out.println("\n"+"Obesidade Grau 2");
		} else if (imc >40) {
			System.out.println("\n"+"Obesidade Grau 3");
		}
		System.out.printf("Seu IMC é: %.2f",imc);
sc.close();
	}

}
