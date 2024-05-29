package lpa_av_somativa;

import java.util.Scanner;

public class Questão_2 {

	public static void main(String[] args) {//Permite que o programa seja executado com diferentes configurações.
		Scanner ler = new Scanner(System.in);// Permite a leitura de váriaveis.
			double a,b,h;//Declara variáveis do tipo Real.


			System.out.println("Informe o valor da base do triângulo");// Mostra o comando na tela.
			b = ler.nextDouble();//Guarda o valor dado pelo usuário na váriavel "b", do tipo Real.

			System.out.println("Informe a altura da figura");// Mostra o comando na tela.
			h = ler.nextDouble();//Guarda o valor dado pelo usuário na váriavel "h", do tipo Real.

			a= (b*h)/2;//Guarda o resultado de (b*h)/2 na váriavel "a".

			System.out.println("A área do objeto é : " + a);//Exibe os valores guardados em "a" na tela.


		}

	}






