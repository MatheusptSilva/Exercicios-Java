//Fazer um algoritmo que leia quatro n�meros e imprime a m�dia aritm�tica dos quatro n�meros.

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1�N: ");
	    double n1 = entrada.nextDouble();
		
		System.out.print("Digite o 2�N: ");
		double n4 = entrada.nextDouble();
		
		System.out.print("Digite o 3�N: ");
		double n3 = entrada.nextDouble();
		
		System.out.print("Digite o 4�N: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1+n2+n3+n4)/4;
		
		System.out.println("\nA m�dia aritm�tica dos n�meros digitados � " + media);
	}
}
