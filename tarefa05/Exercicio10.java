/*10) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de
3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.*/

package tarefa05;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o salário fixo: ");
		float salarioFixo = sc.nextFloat();
		
		System.out.println("Informe o valor da venda 1: ");
		float venda1 = sc.nextFloat();
		
		System.out.println("Informe o valor da venda 2: ");
		float venda2 = sc.nextFloat();
		
		System.out.println("Informe o valor da venda 3: ");
		float venda3 = sc.nextFloat();
		
		System.out.println("Informe o valor da venda 4: ");
		float venda4 = sc.nextFloat();
		
		System.out.println("Informe o valor da venda 5: ");
		float venda5 = sc.nextFloat();
		
		float comissao1 = 1, comissao2 = 2, comissao3 = 3, comissao4 = 4, comissao5 = 5;
		
		if (venda1 >0 && venda1 <=1500) {
				comissao1 = (3*venda1/100);
		} else if (venda1 >1500) {
			comissao1 = (3*1500/100) + (5*(venda1-1500)/100);
		}
		if (venda2 >0 && venda2 <=1500) {
			comissao2 = (3*venda2/100);
		} else if (venda2 >1500) {
		comissao2 = (3*1500/100) + (5*(venda2-1500)/100);
		}
		if (venda3 >0 && venda3 <=1500) {
			comissao3 = (3*venda3/100);
		} else if (venda3 >1500) {
		comissao3 = (3*1500/100) + (5*(venda3-1500)/100);
		}
		if (venda4 >0 && venda4 <=1500) {
			comissao4 = (3*venda4/100);
		} else if (venda4 >1500) {
		comissao4 = (3*1500/100) + (5*(venda4-1500)/100);
		}
		if (venda5 >0 && venda5 <=1500) {
			comissao5 = 3*venda5/100;
		} else if (venda5 >1500) {
		comissao5 = (3*1500/100) + (5*(venda5-1500)/100);
		}
		float salarioComissao = salarioFixo+comissao1+comissao2+comissao3+comissao4+comissao5;
		System.out.println("O salário com as comissão das vendas é: R$"+salarioComissao);
sc.close();
	}

}
