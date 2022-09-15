/* 5) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano 
(não é necessário considerar o mês em que a pessoa nasceu). */

package tarefa05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		LocalDate anoAtual = LocalDate.now();
		DateTimeFormatter ano = DateTimeFormatter.ofPattern("yyyy");
		String formatAno = ano.format(anoAtual);
		int anoNum = Integer.parseInt(formatAno);
		
		System.out.println("Informe o ano de nascimento: ");
		int anoNascimento = sc.nextInt(),
		idade = anoNum-anoNascimento;
		
		if (idade <16) {
			System.out.println("Você tem "+idade+" anos. Ainda não pode votar!");
			
		} else {
			System.out.println("Você tem "+idade+ " anos. Vote consciênte!");
sc.close();
		}
		
	}

}
