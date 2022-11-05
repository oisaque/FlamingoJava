/* 12. Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com saída uma das seguintes mensagens: 
"Ilmo Sr.", se o sexo informado como masculino, ou a mensagem "Ilma Sra.", para o sexo informado como feminino. Apresente também junto da mensagem
de saudação o nome previamente informado.*/

package tarefa06;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome");
		String nome =sc.next();
		System.out.println("Digite o sexo");
		String sexo =sc.next();
		if(sexo.equalsIgnoreCase("Masculino")) {System.out.println("IImo Sr." +nome);}
		else if (sexo.equalsIgnoreCase("Feminino")) {System.out.println("IIma Sra." +nome);
sc.close();
		}
	}
}
