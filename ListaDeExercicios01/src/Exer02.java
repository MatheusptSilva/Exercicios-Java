/*
 * Fazer um algoritmo que l� dois n�meros, a base e o expoente, e imprime a pot�ncia (base elevada ao expoente).
 * Dica: use a fun��o matem�tica Math.pow().
 * Exemplo: 5 elevado ao cubo ficaria Math.pow(5, 3). Voc� pode trocar esses n�meros por vari�veis.
 */

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1�N: ");
		int n1 = entrada.nextInt();
		
		System.out.print("Digite o 2�N: ");
		int n2 = entrada.nextInt();
		
		double potencia = Math.pow(n1, n2);
		
		System.out.println("\n" + n1 + " elevado a " + n2 + " = " + potencia);
	}
}
