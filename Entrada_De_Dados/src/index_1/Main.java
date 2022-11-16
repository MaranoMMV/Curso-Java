package index_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Atributo
		String x;
		//Métodos / Construtor
		
		System.out.print("Digite o seu nome: ");
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		sc.close();
		
		
		
		
		Scanner sc = new Scanner(System.in);
		//Atributo
		int x;
		//Métodos / Construtor
		
		System.out.print("Digite a sua idade ");
		x = sc.nextInt();
		System.out.println("Você digitou: " + x);
		
		sc.close();
		
		
		
		//Ler um número com ponto flutuante:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Atributo
		double x;
		//Métodos / Construtor
		
		System.out.print("Digite a sua idade ");
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.20f\n", x);
		
		sc.close();
		
		//Ler um Caractere
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Atributo
		String x;
		int y;
		double z;
		
		//Métodos / Construtor
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
