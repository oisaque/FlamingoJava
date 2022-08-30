/*5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F = (9*C + 160)/5, 
 sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em Graus Celsius para conversão em Fahrenheit: ");
		int celsius = sc.nextInt();
		
		int fahrenheit = (9*celsius+160)/5;
		
		System.out.println("A temperatura em Fahrenheit é: "+fahrenheit);
sc.close();
	}
	
}

