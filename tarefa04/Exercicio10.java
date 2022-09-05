/*10) Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). Durante a apuração dos votos foram computados 
votos nulos e votos em branco, além dos votos válidos para cada candidato. Deve ser criado um programa de computador que efetue a leitura da 
quantidade de votos válidos para cada candidato, além de efetuar também a leitura da quantidade de votos nulos e votos em branco. Ao final o 
programa deve apresentar o número total de eleitores, considerando votos válidos, nulos e em branco; o percentual correspondente de votos válidos 
em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores;
o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores; o percentual correspondente de votos válidos 
do candidato C em relação à quantidade de eleitores; o percentual correspondente de votos nulos em relação à quantidade de eleitores; 
e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de votos em branco do Candidato 1: ");
		float votosBrancoCandidato1 = sc.nextFloat();
		
		System.out.println("Insira a quantidade de votos nulo do Candidato 1: ");
		float votosNuloCandidato1 = sc.nextFloat();
		
		System.out.println("Insira a quantidade de votos válidos do Candidato 1: ");
		float votosValidoCandidato1 = sc.nextFloat();
		
		System.out.println("\n"+"Insira a quantidade de votos em branco do Candidato 2: ");
		float votosBrancoCandidato2 = sc.nextFloat();
		
		System.out.println("Insira a quantidade de votos nulo do Candidato 2: ");
		float votosNuloCandidato2 = sc.nextFloat();
		
		System.out.println("Insira a quantidade de votos válidos do Candidato 2: ");
		float votosValidoCandidato2 = sc.nextFloat();
		
		System.out.println("\n"+"Insira a quantidade de votos em branco do Candidato 3: ");
		float votosBrancoCandidato3 = sc.nextFloat();
		
		System.out.println("Insira a quantidade de votos nulo do Candidato 3: ");
		float votosNuloCandidato3 = sc.nextFloat();
		
		System.out.println("Insira a quantidade de votos válidos do Candidato 3: ");
		float votosValidoCandidato3 = sc.nextFloat();
		
		float 
		totalEleitores = votosBrancoCandidato1+votosNuloCandidato1+votosValidoCandidato1+
		votosBrancoCandidato2+votosNuloCandidato2+votosValidoCandidato2+
		votosBrancoCandidato3+votosNuloCandidato3+votosValidoCandidato3,
		eleitoresValidos = votosValidoCandidato1+votosValidoCandidato2+votosValidoCandidato3,
		eleitoresBranco = votosBrancoCandidato1+votosBrancoCandidato2+votosBrancoCandidato3,
		eleitoresNulo = votosNuloCandidato1+votosNuloCandidato2+votosNuloCandidato3,
		percentualVotosValido = eleitoresValidos/totalEleitores*100,
		percentualValidoCandidato1 = votosValidoCandidato1/eleitoresValidos*100,
		percentualValidoCandidato2 = votosValidoCandidato2/eleitoresValidos*100,
		percentualValidoCandidato3 = votosValidoCandidato3/eleitoresValidos*100,
		percentualVotosBranco = eleitoresBranco/totalEleitores*100,
		percentualVotosNulo = eleitoresNulo/totalEleitores*100;
		
		String
		totalEleitoresInt = String.format("%.0f", totalEleitores),
		eleitoresValidosInt = String.format("%.0f", eleitoresValidos),
		eleitoresBrancoInt = String.format("%.0f", eleitoresBranco),
		eleitoresNuloInt = String.format("%.0f", eleitoresNulo),
		percentualVotosValidoFloat = String.format("%.2f", percentualVotosValido),
		percentualValidoCandidato1Float = String.format("%.2f", percentualValidoCandidato1),
		percentualValidoCandidato2Float = String.format("%.2f", percentualValidoCandidato2),
		percentualValidoCandidato3Float = String.format("%.2f", percentualValidoCandidato3),
		percentualVotosBrancoFloat = String.format("%.2f", percentualVotosBranco),
		percentualVotosNuloFloat = String.format("%.2f", percentualVotosNulo),
		votosValidoCandidato1Int = String.format("%.0f", votosValidoCandidato1),
		votosValidoCandidato2Int = String.format("%.0f", votosValidoCandidato2),
		votosValidoCandidato3Int = String.format("%.0f", votosValidoCandidato3);
		
		
		System.out.println("\n"+ 
		"Tivemos um total de "+ totalEleitoresInt + " votos de eleitores."+"\n"+
		"O Canditato 1 teve um total de "+votosValidoCandidato1Int+" votos válidos que corresponde a "+percentualValidoCandidato1Float+ "% dos votos." +"\n"+
		"O Canditato 2 teve um total de "+votosValidoCandidato2Int+" votos válidos que corresponde a "+percentualValidoCandidato2Float+ "% dos votos." +"\n"+
		"O Canditato 3 teve um total de "+votosValidoCandidato3Int+" votos válidos que corresponde a "+percentualValidoCandidato3Float+ "% dos votos." +"\n"+
		"Em Nulo teve um total de "+eleitoresNuloInt+" votos que corresponde a "+percentualVotosNuloFloat+ "% dos votos" +"\n"+
		"Em Branco teve um total de "+eleitoresBrancoInt+" votos que corresponde a "+percentualVotosBrancoFloat+ "% dos votos" +"\n"+
		"E por fim os eleitores com votos válidos representam "+percentualVotosValidoFloat+"% do total com "+eleitoresValidosInt+" votos.");
sc.close();
	}

}
