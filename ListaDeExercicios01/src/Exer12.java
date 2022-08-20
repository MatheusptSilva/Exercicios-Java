/*
 * Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um quadrado de lado L 
 * e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Círculo".
 */

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número de L: ");
		double l = entrada.nextDouble();
		
		System.out.print("Digite o número de R: ");
		double r = entrada.nextDouble();
		
		double AreaQuadrado = l*l;
		double AreaCirculo = 3.14*(r*r);
		
		System.out.println("\nQuadrado " + AreaQuadrado);
		System.out.println("Círculo " + AreaCirculo);
		
		if(AreaQuadrado>AreaCirculo) {
			System.out.println("\nO Quadrado é maior");
		}else {
			System.out.println("\nO Círculo é maior");
		}
		
	}
}
