package lpa_av_somativa;

import java.util.Scanner;

public class Questão_4 {

	public static void main(String[] args) {//Permite que o programa seja executado com diferentes configurações.
		Scanner ler = new Scanner(System.in);// Permite a leitura de váriaveis.
		int n,soma=0;//Declara variável do tipo Inteiro.

		for(int i=1; i<=15 ; i++) {//Inicia uma estrutura de repetição que realiza os comandos abaixo 15 vezes;
			System.out.println("Informe um número inteiro ");// Mostra o comando na tela 15 vezes;
			n = ler.nextInt();//Guarda o valor dado pelo usuário na váriavel "n", do tipo Inteiro.
			soma = soma+n;	//Guarda o resultado de soma+n na váriavel soma.
		}

		System.out.println("O resultado da soma é: " + soma );//Exibe os valores guardados em "soma" na tela.
		ler.close();//Encerra o código.

	}


}


