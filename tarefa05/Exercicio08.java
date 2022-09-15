/* 8) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a 
duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e 
terminar no dia seguinte. */

package tarefa05;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a hora do Início do Jogo: ");
		int horaInicio = sc.nextInt();
		
		System.out.println("Informe a hora do Fim do Jogo: ");
		int horaFim = sc.nextInt();
		
		int duracao = horaFim-horaInicio;
		
		if (horaInicio == horaFim) {
			System.out.println("O tempo máximo de duração é de 24 horas! ");
			
		} else if (horaFim >= horaInicio) {
			System.out.println("O jogo durou "+duracao+" horas.");
			
		} else if (horaFim <= horaInicio) {
			duracao = (24-horaInicio)+horaFim;
			System.out.println("O jogo durou "+duracao+" horas.");
		}
	
sc.close();
	}
}
