/*
* Fazer um algoritmo que l� dois n�meros e imprime a soma dos quadrados dos dois n�meros.
* O quadrado de um n�mero A � representado por A2 = A * A.
*/

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int n1,n2;
		
		System.out.print("Digite o 1�N: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite o 2�N: ");
		n2 = entrada.nextInt();
		
		int SomaDosQuadrados = (n1*n1) + (n2*n2);
		
		System.out.println("\nA soma dos quadrados dos dois n�meros � " + SomaDosQuadrados);
	}
}
