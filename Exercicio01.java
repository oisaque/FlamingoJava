//Comentario InLine - Em Linha

/* Coment�rio MultiLinha
1) Solicite um valor do teclado e exiba seu sucessor. */

/**
 * @author aluno
 */

package exercicio;

import java.util.Scanner; // A Classe Scanner l� o que for digitado pelo teclado

public class Exercicio01 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int numero=sc.nextInt();
		int sucessor = (numero+1);
		
		System.out.println("O sucessor do n�mero " +numero+ " � n�mero: " +sucessor);
sc.close();
	}

}
