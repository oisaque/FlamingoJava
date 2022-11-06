// 3) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.

package tarefa08;

public class Exercicio03 {
	public static void main(String args[]) {

		int soma=0;

		for(int contador=0;contador<501;contador+=2) {soma+=contador;

		System.out.println(soma);
		}
	}
}
