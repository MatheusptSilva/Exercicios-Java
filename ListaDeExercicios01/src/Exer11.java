//Fazer um algoritmo que l� um n�mero e verifica se ele � negativo. Se for negativo, imprimir na tela a mensagem "Numero negativo".

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int n = entrada.nextInt();
		
		if(n<0) {
			System.out.println("\n� um N�mero negativo");
		}
	}
}
