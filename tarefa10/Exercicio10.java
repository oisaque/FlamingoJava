/* 10) Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 
graus Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas temperaturas. A fórmula de conversão é F = 
(9*C+160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

package tarefa10;

public class Exercicio10 {
	public static void main(String args[]) {

		for (int contador = 10; contador < 101; contador += 10) {
			System.out.println("Graus Celsius: " + contador);

			double conversor = (9 * contador + 160) / 5;

			System.out.println("Graus Fahrenheit: " + conversor);
		}
	}
}
