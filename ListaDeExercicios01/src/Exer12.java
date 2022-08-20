/*
 * Fazer um algoritmo que leia dois n�meros L e R. O programa deve verificar a maior �rea entre um quadrado de lado L 
 * e um c�rculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "C�rculo".
 */

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o n�mero de L: ");
		double l = entrada.nextDouble();
		
		System.out.print("Digite o n�mero de R: ");
		double r = entrada.nextDouble();
		
		double AreaQuadrado = l*l;
		double AreaCirculo = 3.14*(r*r);
		
		System.out.println("\nQuadrado " + AreaQuadrado);
		System.out.println("C�rculo " + AreaCirculo);
		
		if(AreaQuadrado>AreaCirculo) {
			System.out.println("\nO Quadrado � maior");
		}else {
			System.out.println("\nO C�rculo � maior");
		}
		
	}
}
