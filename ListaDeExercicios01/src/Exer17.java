/*
 * Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, 
 * e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a vari�vel A for par escrever 
 * a mensagem "Valores aceitos", sen�o escrever "Valores n�o aceitos".
 * Veja abaixo alguns exemplos. N�o fixe esses valores no c�digo. Voc� pode us�-los para TESTAR seu algoritmo:
 * Entradas (A B C D)         Sa�da esperada
 * 5 6 7 8                    Valores n�o aceitos
 * 2 3 2 6                    Valores aceitos
 * 
 */

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a,b,c,d;
		
		System.out.print("Digite o valor de A: ");
		a = entrada.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		b = entrada.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		c = entrada.nextDouble();
		
		System.out.print("Digite o valor de D: ");
		d = entrada.nextDouble();
		
		if(b>c && d>a & c+d>a+b && c>0 && d>0 && a%2==0) {
			System.out.println("\nValores aceitos");
		}else {
			System.out.println("\nValores n�o aceitos");
		}
		
	}
}
