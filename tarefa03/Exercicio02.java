/*2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. 
Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.*/

package tarefa03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe a quantidade de votos em branco: ");
			float branco = sc.nextFloat();
			
			System.out.println("Informe a quantidade de votos nulos: ");
			float nulo = sc.nextFloat();
			
			System.out.println("Informe a quantidade de votos validos: ");
			float valido = sc.nextFloat();
			
			float eleitores = branco+nulo+valido;
			
			String 
			percBranco = String.format("%.2f", branco*100/eleitores), 
			percNulo = String.format("%.2f", nulo*100/eleitores), 
			percValido = String.format("%.2f", valido*100/eleitores),
			decBranco = String.format("%.0f", branco),
			decNulo = String.format("%.0f", nulo),
			decValido = String.format("%.0f", valido),
			decEleitores = String.format("%.0f", eleitores);
			
			System.out.println("\n"+ 
			"Tivemos um total de "+ decEleitores + " votos de eleitores."+"\n"+
			"Os eleitores que votaram em branco representam %"+percBranco+" do total com "+decBranco+" votos."+"\n"+
			"Os eleitores que votaram nulo representam %" +percNulo+" do total com "+decNulo+ " votos."+"\n"+ 
			"E por fim os eleitores com votos válidos representam %"+percValido+" do total com "+decValido+" votos.");
sc.close();
		}
}
