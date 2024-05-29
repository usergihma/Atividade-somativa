package lpa_av_somativa;

import java.util.Scanner;

public class Questão_1 {

	public static void main(String[] args) { //Permite que o programa seja executado com diferentes configurações.
		Scanner ler = new Scanner(System.in); // Permite a leitura de váriaveis.
		double a, b, soma,sub,div,mult; //Declara variáveis do tipo Real.

		System.out.println("Informe o primeiro valor"); // Mostra o comando na tela.
		a = ler.nextDouble();//Guarda o valor dado pelo usuário na váriavel "a", do tipo Real.

		System.out.println("Informe o primeiro valor");// Mostra o comando na tela.
		b = ler.nextDouble();//Guarda o valor dado pelo usuário na váriavel "b", do tipo Real.

		soma = a+b;//Guarda o resultado de a+b na váriavel soma.
		sub = a-b;//Guarda o resultado de a-b na váriavel sub.
		div = a/b;//Guarda o resultado de a/b na váriavel div.
		mult = a*b;//Guarda o resultado de a*b na váriavel mult.

		System.out.println("O resultado da soma é : " + soma);//Exibe os valores guardados em "soma" na tela.
		System.out.println("O resultado da subtração é : " + sub);//Exibe os valores guardados em "sub" na tela.
		System.out.println("O resultado da divisão é : " + div);//Exibe os valores guardados em "div" na tela.
		System.out.println("O resultado da multiplicação é : " + mult);//Exibe os valores guardados em "mult" na tela.
	}

}




