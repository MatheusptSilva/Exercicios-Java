/*
 * Escreva um programa que leia o n�mero de cadastro de um funcion�rio, seu n�mero de horas trabalhadas,
 * o valor que recebe por hora e calcula o sal�rio desse funcion�rio. 
 * A seguir, mostre na tela o n�mero e o sal�rio do funcion�rio.
 */

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double cadastro, horas, valor;
		
		System.out.print("Digite o n�mero de cadastro do funcion�rio: ");
		cadastro = entrada.nextDouble();
		
		System.out.print("Digite o n�mero de horas trabalhadas: ");
		horas = entrada.nextDouble();
		
		System.out.print("Digite o valor que recebe por hora: ");
		valor = entrada.nextDouble();
		
		double SalarioDia = horas*valor;
		double SalarioMes = SalarioDia*30;
		
		System.out.println("\nO funcion�rio " + cadastro + " tem o s�lario de R$" + SalarioMes);
		
		
	}
}
