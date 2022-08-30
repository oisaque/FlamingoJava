//7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura

package tarefa03;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio da lata de óleo: ");
		Double raio = sc.nextDouble();
		
		System.out.println("Informe o valor da altura da lata: ");
		Double altura = sc.nextDouble();
		
		Double volume = Math.PI*Math.pow(raio, 2)*altura;
		
		System.out.println("O volume da lata é "+volume);
sc.close();
	}

}
