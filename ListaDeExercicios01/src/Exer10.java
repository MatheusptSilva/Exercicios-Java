/*
 * Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s
 * (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, 
 * calcular e imprimir o total a receber no final do m�s.
 */

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.next();
		
		System.out.print("Digite o seu sal�rio: ");
		double salario = entrada.nextDouble();
		
		System.out.print("O valor de vendas que voc� vendeu no m�s: ");
		double venda = entrada.nextDouble();
		
		double ValorPorcentagem = (venda*15)/100;
		double TotalaReceber = salario+ValorPorcentagem;
		
		System.out.println("\nOl� " + nome + " sua comiss�o esse m�s � de R$" + ValorPorcentagem + " e o total que voc� vai receber esse m�s � de "
				+ " R$" + TotalaReceber);
			
	}
}
