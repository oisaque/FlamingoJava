/* 4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao 
 custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de 
 fábrica de um carro, calcular e escrever o custo final ao consumidor.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o custo de fábrica do veiculo: ");
		float custo = sc.nextFloat();
		
		float percDistribuidor = 28;
		float percImpostos = 45;
		
		float carroComImposto = percDistribuidor*custo/100+percImpostos*custo/100+custo;
		
		System.out.println("O valor do custo do carro com a soma dos impostos e a porcentagem do distrubuidor é: "+carroComImposto);
sc.close();
	}

}
