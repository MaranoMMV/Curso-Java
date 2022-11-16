package exercicio;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		Scanner sc = new Scanner(System.in);
		int number;
		float salario;
		float multiplicacao;
		float result_salario;
		
		number = sc.nextInt();
		salario = sc.nextFloat();
		multiplicacao = sc.nextFloat();
		
		result_salario = salario * multiplicacao;
		
		System.out.println(number);
		System.out.println(result_salario);
		
	}

}
