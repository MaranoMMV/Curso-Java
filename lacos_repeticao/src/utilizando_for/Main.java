package utilizando_for;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Insira numeros: ");
		int n = scan.nextInt();
		int soma = 0;
		for (int i=0; i<n; i++) {
			int x = scan.nextInt();
			soma += x;
		
		}
		
		System.out.println(soma);
		scan.close();
		
	}

}
