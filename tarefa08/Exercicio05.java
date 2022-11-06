/* 5) Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser considerado que qualquer número elevado a 
zero é 1, e elevado a 1 é ele próprio. Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).*/

package tarefa08;

public class Exercicio05 {
	public static void main(String args[]) {

		int num=0, soma=0 , fatorial=0;

		while(num<16) {

		fatorial=num*(num-1);

		soma=fatorial+soma;

		num+=1;

		}
		System.out.println(soma);
	}
}
