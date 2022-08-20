/*
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês
 * (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
 * calcular e imprimir o total a receber no final do mês.
 */

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.next();
		
		System.out.print("Digite o seu salário: ");
		double salario = entrada.nextDouble();
		
		System.out.print("O valor de vendas que você vendeu no mês: ");
		double venda = entrada.nextDouble();
		
		double ValorPorcentagem = (venda*15)/100;
		double TotalaReceber = salario+ValorPorcentagem;
		
		System.out.println("\nOlá " + nome + " sua comissão esse mês é de R$" + ValorPorcentagem + " e o total que você vai receber esse mês é de "
				+ " R$" + TotalaReceber);
			
	}
}
