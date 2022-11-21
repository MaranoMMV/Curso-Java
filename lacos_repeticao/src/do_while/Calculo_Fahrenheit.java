package do_while;

import java.util.Scanner;

public class Calculo_Fahrenheit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float fahrenheit;
		String resposta = "";
		

		
		while (resposta != "n") {
			System.out.println("Digite a temperatura em Celsius");
			float celsius = scan.nextFloat();
			fahrenheit = (float) (((9.0 * celsius)/5) + 32.0);
			System.out.println(fahrenheit);
			System.out.println("Quer repetir a operação?");
			resposta = scan.next();
		}
		System.out.println("É Tetraa");
	}

}
