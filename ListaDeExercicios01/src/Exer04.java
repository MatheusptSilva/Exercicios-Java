/*
 * Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números.
 * (Por exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2. –8 é consecutivo de –9)
 */

import java.util.Scanner;

public class Exer04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1ºN: ");
		int n1 = entrada.nextInt();
		
		System.out.print("Digite o 1ºN: ");
		int n2 = entrada.nextInt();
		
		int consn1 = n1+1;
		int consn2 = n2+1;
		
		System.out.println("\nOs números consecutivos são " + consn1 + " e " + consn2);
	}

}
