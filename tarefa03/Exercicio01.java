/* 1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas
em dias. Considerar ano com 365 dias e mês com 30 dias. */

package tarefa03;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalDate now = LocalDate.now();
		
		//DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.println(now);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatter);
		
		System.out.println("Insira o ano em que você nasceu: ");
		int ano = sc.nextInt();
		
		System.out.println("Insira o mês em que você nasceu: ");
		int mes = sc.nextInt();
		
		System.out.println("Insira o dia em que você nasceu: ");
		int dia = sc.nextInt();
		
	}
}
