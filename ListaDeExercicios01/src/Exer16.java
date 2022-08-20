/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode come�ar em um dia 
 * e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
 * Veja abaixo alguns exemplos. N�o fixe esses valores no c�digo. Voc� pode us�-los para TESTAR seu algoritmo:
 * Hora inicial      Hora final     Resultado
 * 16                  2              O JOGO DUROU 10 HORA(S)
 * 0                   0              O JOGO DUROU 24 HORA(S)
 * 2                   16             O JOGO DUROU 14 HORA(S)
 */

import java.util.Scanner;

public class Exer16 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite a hora inicial: ");
		double inicio = entrada.nextDouble();
		
		System.out.print("Digite a hora final: ");
		double fim = entrada.nextDouble();
		
		double duracao = 24 - (24 + inicio - fim) % 24;
		
		if(duracao>24) {
			System.out.print("\nPassou de um 24 horas");
		}else if(inicio<0 || fim<0) {
			System.out.println("\nN�o existe essa hora");
		}else {
		System.out.println("\nO jogo durou " + duracao + " horas");
		}
	}
}
 