//Fazer um algoritmo que leia dois n�meros e imprime a divis�o do maior pelo menor.

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1�N: ");
		double n1 = entrada.nextDouble();
		
		System.out.print("Digite o 2�N: ");
		double n2 = entrada.nextDouble();
		
		if(n1>n2) {
			double divisao = n1/n2;
			System.out.print("\n" + n1 + "/" + n2 + " = " + divisao);
		}else if(n2>n1){
			double divisao2 = n2/n1;
			System.out.println("\n" + n2 + "/" + n1 + " = " + divisao2);
		}
	}
}
 