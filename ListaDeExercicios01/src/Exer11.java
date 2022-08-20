//Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a mensagem "Numero negativo".

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = entrada.nextInt();
		
		if(n<0) {
			System.out.println("\né um Número negativo");
		}
	}
}
