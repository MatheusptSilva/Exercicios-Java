//Fazer um algoritmo que leia dois n�meros e imprima na tela o produto (multiplica��o) dos dois n�meros.

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int n1,n2;
		
		System.out.print("Digite o 1�N: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite o 2�N: ");
		n2 = entrada.nextInt();
		
		int produto = n1*n2;
		
		System.out.println("\nO produto dos n�meros digitados � " + produto);
	}
}
