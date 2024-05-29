package lpa_av_somativa;

import java.util.Scanner;

public class Questão_5 {

	public static void main(String[] args) {//Permite que o programa seja executado com diferentes configurações.
		Scanner ler = new Scanner(System.in);
		String garagem[] = new String[7];

		System.out.println("GARAGEM");

		for (int i =1; i<7; i++) {
			System.out.println("Qual carro gostaria de estacionar? ");
			garagem[i]= ler.next();

		}

		for (int i=1; i<7; i++) {
			System.out.println("O carro estacionado na posição " + i + " é :" + garagem[i]);
		}
		ler.close();

	}

}
