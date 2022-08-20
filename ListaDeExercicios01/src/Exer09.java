/*
 * Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas trabalhadas,
 * o valor que recebe por hora e calcula o salário desse funcionário. 
 * A seguir, mostre na tela o número e o salário do funcionário.
 */

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double cadastro, horas, valor;
		
		System.out.print("Digite o número de cadastro do funcionário: ");
		cadastro = entrada.nextDouble();
		
		System.out.print("Digite o número de horas trabalhadas: ");
		horas = entrada.nextDouble();
		
		System.out.print("Digite o valor que recebe por hora: ");
		valor = entrada.nextDouble();
		
		double SalarioDia = horas*valor;
		double SalarioMes = SalarioDia*30;
		
		System.out.println("\nO funcionário " + cadastro + " tem o sálario de R$" + SalarioMes);
		
		
	}
}
