/* 8) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. 
Para obter o cálculo, o usuário deve fornecer o tempo gasto (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, 
será possível obter a distância percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da distância, basta calcular a 
quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTANCIA/12. Ao final, o programa deve apresentar os valores 
da velocidade média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) 
utilizada na viagem.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o tempo gasto de viagem: ");
		int tempo = sc.nextInt();
		
		System.out.println("Informe a velocidade média: ");
		int velocidade = sc.nextInt();
		
		int distancia = tempo*velocidade;
		int litrosUsados = distancia/12;
		
		System.out.println("A velocidade média da viagem foi de "+velocidade+" km por hora.");
		System.out.println("O tempo gasto foi de "+tempo+" horas.");
		System.out.println("A distância percorrida foi de "+distancia+" km.");
		System.out.println("A quantidade de combustível gasto foi "+litrosUsados+" litros.");
sc.close();
	}

}
