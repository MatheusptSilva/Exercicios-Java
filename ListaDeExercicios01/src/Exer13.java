//Fazer um algoritmo que leia três números e imprime o maior deles.

import java.util.Scanner;

public class Exer13 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("Digite o 1ºN: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite o 2ºN: ");
		n2 = entrada.nextInt();
		
		System.out.print("Digite o 3ºN: ");
		n3 = entrada.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("\nO 1ºN é o maior");
		}else if(n2>n1 && n2>n3) {
			System.out.println("\nO 2ºN é o maior");
		}else {
			System.out.println("\nO 3ºN é o maior");
		}
	}

}
