package jokenpoComWhile;

import java.util.Random;
import java.util.Scanner;

public class JokenpoComWhile {

	public static void main(String[] args) {
		
		/* Reconstrua o jogo Jokenpo no estilo "melhor de tr�s". 
		 
		   O jogo dever� solicitar o n�mero de partidas no desafio, este n�mero dever� ser �mpar e maior ou igual a tr�s.
		   
		 * O ganhador ser� aquele que vencer a maior quantidade de partidas de modo que n�o seja mais poss�vel o rival super�-lo.
		 * Caso haja empate o jogo dever� prosseguir at� que ocorra o desempate,a partida de ouro.
		 * Trate a entrada do usu�rio, n�o permitindo que sejam inseridos valores inv�lidos.

Sugest�o de fluxo do jogo.

----------------------------
      J O K E N P O
----------------------------
Quantas partidas: 3

----------------------------
1 - Pedra
2 - Papel
3 - Tesoura
----------------------------

Partida 1
Qual a sua op��o:  1

Voc� escolheu Pedra
Computador escolheu Tesoura

Voc� ganhou esta.

Partida 2
Qual a sua op��o:  2

Voc� escolheu Papel
Computador escolheu Tesoura

Computador ganhou esta.

Partida 3
Qual a sua op��o:  1

Voc� escolheu Pedra
Computador escolheu Papel

Computador ganhou esta.

COMPUTADOR VENCEU O DESAFIO POR 2 X 1

Jogar novamente(S/N): S*/
		
		
		
		System.out.println("---------------");
		System.out.println(" J o k e n p o ");
		System.out.println("---------------");
		System.out.println(" ");
		System.out.println("Regras:");
		System.out.println("1-Pedra");
		System.out.println("2-Papel");
		System.out.println("3-Tesoura");
		System.out.println(" ");
		
		int NumPartidas, jogador, computador, contador=0, vitoriaJogador=0, vitoriaComputador=0, empate=0;
		String resposta="sim";
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Quantas partidas quer jogar? ");
		NumPartidas=teclado.nextInt();
		System.out.println(" ");
						
		if(NumPartidas>=3) {
												
			while(NumPartidas>contador) {
				
				System.out.print("Fa�a sua jogada: ");
				jogador= teclado.nextInt();
				System.out.print(" ");
				
				Random sorteio= new Random(); // chamei random de sorteio
				computador = sorteio.nextInt(3)+1; // +1 soma ao n�mero sorteado pelo random
				System.out.println("O computador escolheu: "+computador);
				
									
				if (jogador==1) {
					if(computador==1) {
						System.out.println("Empate!");
						empate++;
					}else if(computador==2) {
					System.out.println("O Computador venceu est�!");
					vitoriaComputador++;
					}else {
						System.out.println("Voc� venceu est� !!");
						vitoriaJogador++;
					}
					
				} else if(jogador==2) {
					if(computador==2) {
						System.out.println("Empate!");
						empate++;
					}else if(computador==1) {
						System.out.println("Voc� venceu est�!!");
						vitoriaJogador++;
					}else {
						System.out.println("Computador venceu est�!");
						vitoriaComputador++;
					}
				}else {
					if(computador==3) {
						System.out.println("Empate!");
						empate++;
					}else if(computador==1) {
						System.out.println("O Computador venceu est�!");
						vitoriaComputador++;
					}else {
						System.out.println("Voc� venceu est�!!");
						vitoriaJogador++;
					}
				}
				
				
				
				  	//resposta.equals("sim")
					
				
				
				contador++;
				
				System.out.println("computador "+vitoriaComputador+" x "+vitoriaJogador+" jogador");
							
												
			}
			 
			
				System.out.println(" " );
				System.out.println("Placar �:computador "+vitoriaComputador+" x "+vitoriaJogador+" jogador");
				
				// falta a partir daqui
				
			/* System.out.print(" ");
				
				System.out.println("Gostaria de jogar novamente? Digite sim ou nao");
				resposta=teclado.next();
				if(resposta.equals("sim")) {
					
				}*/
				
				
				teclado.close();
								
		}else {
			System.out.println("Jogada inv�lida!!");
		}
		
		
		
		
		
		
	}

}
