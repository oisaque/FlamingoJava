// 2) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).

package tarefa08;

public class Exercicio02 {
	public static void main(String args[]) {

		int soma=0;

		for(int contador=0;contador<101;contador++) {soma+=contador;

		System.out.println(soma);

		}
	}
}
