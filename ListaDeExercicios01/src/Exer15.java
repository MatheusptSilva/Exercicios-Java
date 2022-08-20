/*
 * Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara. −𝐵 ±√𝐵2−4∗𝐴∗𝐶2∗𝐴
 * Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de número negativo,
 * mostre a mensagem correspondente “Impossível calcular”.
 */

import java.util.Scanner;

public class Exer15 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a,b,c;
		
		System.out.print("Digite o NºA: ");
		a = entrada.nextDouble();
		
		System.out.print("Digite o NºB: ");
		b = entrada.nextDouble();
		
		System.out.print("Digite o NºC: ");
		c = entrada.nextDouble();
		
		double delta = (b*b)-4*a*c;
		
		if(a == 0 || delta<0) {
			System.out.println("\nImpossível de calcular");
		}else {
			double x1 = (-b + Math.sqrt(delta))/2*a;
		    double x2 = (-b - Math.sqrt(delta))/2*a;
		    
		    System.out.println("\nAs duas raízes da equação são " + x1 + " e " + x2);
		}
		
		
				
	}

}
