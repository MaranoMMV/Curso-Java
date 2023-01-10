package application;

import java.util.Locale;
import java.util.Scanner;

import calc.Calc;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Calc calc = new Calc();
		
		int number;
		System.out.println("Quantos numeros você vai digitar? ");
		number = scan.nextInt();
		
		int[] vetor = new int[number];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = scan.nextInt();
		}
		System.out.print("Valores = ");
		for(int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		int soma = 0;
	    for (int i=0; i<vetor.length; i++) {
	        soma = soma + vetor[i];
	    }
	    
	    System.out.println("SOMA = " + soma);

	    double media = soma / vetor.length;
	    System.out.println("MEDIA = " + media);
	    
	}
}
