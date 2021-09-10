package jokenpoComWhile;

import java.util.Random;
import java.util.Scanner;

public class JokenpoComWhile {

	public static void main(String[] args) {
		
		/* Reconstrua o jogo Jokenpo no estilo "melhor de três". 
		 
		   O jogo deverá solicitar o número de partidas no desafio, este número deverá ser ímpar e maior ou igual a três.
		   
		 * O ganhador será aquele que vencer a maior quantidade de partidas de modo que não seja mais possível o rival superá-lo.
		 * Caso haja empate o jogo deverá prosseguir até que ocorra o desempate,a partida de ouro.
		 * Trate a entrada do usuário, não permitindo que sejam inseridos valores inválidos.

Sugestão de fluxo do jogo.

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
Qual a sua opção:  1

Você escolheu Pedra
Computador escolheu Tesoura

Você ganhou esta.

Partida 2
Qual a sua opção:  2

Você escolheu Papel
Computador escolheu Tesoura

Computador ganhou esta.

Partida 3
Qual a sua opção:  1

Você escolheu Pedra
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
				
				System.out.print("Faça sua jogada: ");
				jogador= teclado.nextInt();
				System.out.print(" ");
				
				Random sorteio= new Random(); // chamei random de sorteio
				computador = sorteio.nextInt(3)+1; // +1 soma ao número sorteado pelo random
				System.out.println("O computador escolheu: "+computador);
				
									
				if (jogador==1) {
					if(computador==1) {
						System.out.println("Empate!");
						empate++;
					}else if(computador==2) {
					System.out.println("O Computador venceu está!");
					vitoriaComputador++;
					}else {
						System.out.println("Você venceu está !!");
						vitoriaJogador++;
					}
					
				} else if(jogador==2) {
					if(computador==2) {
						System.out.println("Empate!");
						empate++;
					}else if(computador==1) {
						System.out.println("Você venceu está!!");
						vitoriaJogador++;
					}else {
						System.out.println("Computador venceu está!");
						vitoriaComputador++;
					}
				}else {
					if(computador==3) {
						System.out.println("Empate!");
						empate++;
					}else if(computador==1) {
						System.out.println("O Computador venceu está!");
						vitoriaComputador++;
					}else {
						System.out.println("Você venceu está!!");
						vitoriaJogador++;
					}
				}
				
				
				
				  	//resposta.equals("sim")
					
				
				
				contador++;
				
				System.out.println("computador "+vitoriaComputador+" x "+vitoriaJogador+" jogador");
							
												
			}
			 
			
				System.out.println(" " );
				System.out.println("Placar é:computador "+vitoriaComputador+" x "+vitoriaJogador+" jogador");
				
				// falta a partir daqui
				
			/* System.out.print(" ");
				
				System.out.println("Gostaria de jogar novamente? Digite sim ou nao");
				resposta=teclado.next();
				if(resposta.equals("sim")) {
					
				}*/
				
				
				teclado.close();
								
		}else {
			System.out.println("Jogada inválida!!");
		}
		
		
		
		
		
		
	}

}
