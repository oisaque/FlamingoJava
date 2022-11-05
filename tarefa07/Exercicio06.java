/* 6) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. 
Caso não haja vencedor deverá ser impressa a palavra EMPATE.*/

package tarefa07;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro time");
		String pritime = sc.next();
		
		System.out.println("Digite quantos gols, marcou o primeiro time");
		int golspri = sc.nextInt();
		
		System.out.println("Digite o nome do segundo time");
		String segtime = sc.next();
		
		System.out.println("Digite quantos gols, marcou o segundo time");
		
		int golsseg = sc.nextInt();
		if (golspri > golsseg) {
			System.out.println("O vencedor foi o: " + pritime);
		} else if (golsseg > golspri) {
			System.out.println("O vencedor foi o: " + segtime);
		}
		if (golspri == golsseg) {
			System.out.println("A partida terminou Empatada!");
		}
		sc.close();
	}

}
