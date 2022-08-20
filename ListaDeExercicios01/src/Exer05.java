//Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de L: ");
		int l = entrada.nextInt();
		
		int area = l*l;
		
		System.out.println("\nA area de um quadrado de lado L é " + area);
	}
}
