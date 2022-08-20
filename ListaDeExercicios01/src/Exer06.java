/*
 * Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (π = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura. 
 * d) a área do quadrado que tem lado B. 
 * e) a área do retângulo que tem lados A e B. 
 * f) o perímetro do retângulo que tem lados A e B.
 */

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double A,B,C;
		
		System.out.print("Digite o valor de A: ");
		A = entrada.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		B = entrada.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		C = entrada.nextDouble();
		
		double a = (A*C)/2;
		double b = 3.14*(C*C);
		double c = ((A+b)*C)/2;
		double d = B*B;
		double e = A*B;
		double f = (2*A) + (2*B);
		
		System.out.println("\n" + a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}
}
