//Fazer um algoritmo que leia tr�s n�meros e imprime o maior deles.

import java.util.Scanner;

public class Exer13 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("Digite o 1�N: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite o 2�N: ");
		n2 = entrada.nextInt();
		
		System.out.print("Digite o 3�N: ");
		n3 = entrada.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("\nO 1�N � o maior");
		}else if(n2>n1 && n2>n3) {
			System.out.println("\nO 2�N � o maior");
		}else {
			System.out.println("\nO 3�N � o maior");
		}
	}

}
