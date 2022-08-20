/*
 * Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do triângulo.
 * Para esse caso, considere que ℎ𝑖𝑝𝑜𝑡𝑒𝑛𝑢𝑠𝑎 = √𝐴2+𝐵2. Dica: nesse programa, você deve usar a função matemática Math.sqrt(). 
 * Por exemplo, a raiz de 121 ficaria Math.sqrt(121).
 */

import java.util.Scanner;

public class Exer07 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do lado A: ");
		double a = entrada.nextDouble();
		
		System.out.print("Digite o valor do lado B: ");
		double b = entrada.nextDouble();
		
		double hipotenusa = Math.sqrt((a*a) + (b*b));
		
		System.out.println("\nA hipotenusa do triâgulo retâgulo é " + hipotenusa);
	}

}
