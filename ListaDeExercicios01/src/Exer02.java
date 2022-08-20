/*
 * Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao expoente).
 * Dica: use a função matemática Math.pow().
 * Exemplo: 5 elevado ao cubo ficaria Math.pow(5, 3). Você pode trocar esses números por variáveis.
 */

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1ºN: ");
		int n1 = entrada.nextInt();
		
		System.out.print("Digite o 2ºN: ");
		int n2 = entrada.nextInt();
		
		double potencia = Math.pow(n1, n2);
		
		System.out.println("\n" + n1 + " elevado a " + n2 + " = " + potencia);
	}
}
