package index;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int number = 0;

		// Construtor
		System.out.println("Number");
		number = scan.nextInt();

		while (number != 4) {

			switch (number) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			case 4:
				break;
			default:
				System.out.println("");
			}
			
			number = scan.nextInt();

		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);	
	}

}
