//Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números.

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1ºN: ");
	    double n1 = entrada.nextDouble();
		
		System.out.print("Digite o 2ºN: ");
		double n4 = entrada.nextDouble();
		
		System.out.print("Digite o 3ºN: ");
		double n3 = entrada.nextDouble();
		
		System.out.print("Digite o 4ºN: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1+n2+n3+n4)/4;
		
		System.out.println("\nA média aritmética dos números digitados é " + media);
	}
}
