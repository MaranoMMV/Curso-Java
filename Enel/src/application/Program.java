package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BaixaRenda;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Insira a sua categoria para realizar os calculos: ");
		System.out.println("--------------------------------------------------");
		System.out.println("Digite 1 para A1 - Residencial, 2 para Residencial baixa renda");
		int classificacao = scan.nextInt();
		
		//Métodos
		if(classificacao == 1) {
			System.out.println("A1 B1 Residencial");
		}else if(classificacao == 2) {
			BaixaRenda baixa = new BaixaRenda();
			System.out.println("Bem vindo ao A2 - Residencial baixa renda");
			System.out.println("Digite a sua energia:");
			baixa.setEnergia(scan.nextInt());
			System.out.println("Digite 1 para energia TE ou 2 para energia TUSD");
			int verificandoTipoEnergia = scan.nextInt();
			
			if(verificandoTipoEnergia == 1) {
				System.out.println("Voce escolheu TE");
				System.out.println("Seu desconto: " + baixa.verificandoDesconto_TE());
				System.out.println("Resultado: " + baixa.calculoBaixaRendaTE());
			}else {
				System.out.println("Voce escolheu TUSD");
				System.out.println("Seu desconto: " + baixa.verificandoDesconto_TUSD());
				System.out.println("Resultado: " + baixa.calculoBaixaRendaTUSD());
			}
		}
		
		

	}

}
