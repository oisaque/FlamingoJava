/*6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula deconversão é C=(F-32)*(5/9), 
 sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe a temperatura em Graus Fahrenheit para conversão em Celsius: ");
	float fahrenheit = sc.nextFloat();
	
	float celsius = (fahrenheit-32)*5/9;
	
	System.out.println("A temperatura em Fahrenheit convertidada em graus Celsius é: "+celsius);
sc.close();
	}
	
}
