/*
 * Fazer um algoritmo que l� dois n�meros inteiros e imprime os n�meros consecutivos desses n�meros.
 * (Por exemplo: se o usu�rio digitar 2 e -9, a sa�da dever� ser 3 e -8, porque 3 � consecutivo de 2. �8 � consecutivo de �9)
 */

import java.util.Scanner;

public class Exer04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1�N: ");
		int n1 = entrada.nextInt();
		
		System.out.print("Digite o 1�N: ");
		int n2 = entrada.nextInt();
		
		int consn1 = n1+1;
		int consn2 = n2+1;
		
		System.out.println("\nOs n�meros consecutivos s�o " + consn1 + " e " + consn2);
	}

}
