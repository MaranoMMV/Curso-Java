package appplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n = 0;
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		System.out.println("Quantas pessoas serão digitadas? ");
		n = scan.nextInt();
		
		for(int i=1; i<n; i++) {
			System.out.println("Dados da " + i + " pessoa");
			System.out.println("Nome: ");
			nomes[i] = scan.next();
			System.out.println("idade: ");
			idades[i] = scan.nextInt();
			System.out.println("Altura: ");
			alturas[i] = scan.nextDouble();
		}
	}

}
