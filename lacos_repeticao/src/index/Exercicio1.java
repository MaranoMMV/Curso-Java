package index;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha = 2002;
		int senha_colocada = 0;
		System.out.println("Coloque a senha");
		senha_colocada = sc.nextInt();

		while (senha != senha_colocada) {
				
			System.out.println("Senha Incorreta");
			senha_colocada = sc.nextInt();

		}
			System.out.println("Conectado");
	}

}
