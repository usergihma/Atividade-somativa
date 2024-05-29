package lpa_av_somativa;

import java.util.Scanner;

public class Questão_3 {

	public static void main(String[] args) {//Permite que o programa seja executado com diferentes configurações.
		Scanner ler = new Scanner(System.in);// Permite a leitura de váriaveis.
		int dia;//Declara variável do tipo Inteiro.

		System.out.println("Informe o dia da semana ");// Mostra o comando na tela.
		dia = ler.nextInt();//Guarda o valor dado pelo usuário na váriavel "dia", do tipo Inteiro.


		switch (dia) { // Executa as instruções seguintes, por meio do valor guardado em "dia"
		case (1)://Executa a instrução, caso o usuário digite "1"
			System.out.println("O número do dia selecionado é Domingo ");//Exibe o dia equivalente ao valor 1.
		break;//Encerra a instrução equivalente ao valor 1.
		case (2)://Executa a instrução, caso o usuário digite "2"
			System.out.println("O número do dia selecionado é Segunda");//Exibe o dia equivalente ao valor 2.
		break;//Encerra a instrução equivalente ao valor 2.
		case (3)://Executa a instrução, caso o usuário digite "3"
			System.out.println("O número do dia selecionado é Terça");//Exibe o dia equivalente ao valor 3.
		break;//Encerra a instrução equivalente ao valor 3.
		case (4)://Executa a instrução, caso o usuário digite "4"
			System.out.println("O número do dia selecionado é Quarta");//Exibe o dia equivalente ao valor 4.
		break;//Encerra a instrução equivalente ao valor 4.
		case (5)://Executa a instrução, caso o usuário digite "5"
			System.out.println("O número do dia selecionado é Quinta");//Exibe o dia equivalente ao valor 5.
		break;//Encerra a instrução equivalente ao valor 5.
		case (6)://Executa a instrução, caso o usuário digite "6"
			System.out.println("O número do dia selecionado é Sexta");//Exibe o dia equivalente ao valor 6.
		break;//Encerra a instrução equivalente ao valor 6.
		case (7)://Executa a instrução, caso o usuário digite "7"
			System.out.println("O número do dia selecionado é Sábado");//Exibe o dia equivalente ao valor 7.
		break;//Encerra a instrução equivalente ao valor 7.
		default:// Encerra as instruções dentro do switch.
			System.out.println("O dia informado é inválido");//Exibe o resultado na tela, caso o dia digitado seja >7.
		}

	}
}
