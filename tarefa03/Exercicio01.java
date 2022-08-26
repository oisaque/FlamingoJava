/* 1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas
em dias. Considerar ano com 365 dias e mês com 30 dias. */

package tarefa03;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalDate dataAtual = LocalDate.now();
		
		DateTimeFormatter formatterDia = DateTimeFormatter.ofPattern("dd"); // Fomarmato do dia
		String formattedDia = formatterDia.format(dataAtual); // Pego o dia da data atual conforme a formatação passada acima
		DateTimeFormatter formatterMes = DateTimeFormatter.ofPattern("MM");
		String formattedMes = formatterMes.format(dataAtual);
		DateTimeFormatter formatterAno = DateTimeFormatter.ofPattern("yyyy");
		String formattedAno = formatterAno.format(dataAtual);
		
		int diaHoje = Integer.parseInt(formattedDia);
		int mesHoje = Integer.parseInt(formattedMes);
		int anoHoje = Integer.parseInt(formattedAno);
		
		System.out.println("Insira o dia em que você nasceu: ");
		int dia = sc.nextInt();
		
		System.out.println("Insira o mês em que você nasceu: ");
		int mes = sc.nextInt();
		
		System.out.println("Insira o ano em que você nasceu: ");
		int ano = sc.nextInt();
		
		int diasVivido = (anoHoje-ano)*365+(mesHoje-mes)*30+(diaHoje-dia);
		
		System.out.println("\n" +"O total de dias vivido é igual a: "+diasVivido);
		
	}
}