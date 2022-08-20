//Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números.

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int n1,n2;
		
		System.out.print("Digite o 1ºN: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite o 2ºN: ");
		n2 = entrada.nextInt();
		
		int produto = n1*n2;
		
		System.out.println("\nO produto dos números digitados é " + produto);
	}
}
