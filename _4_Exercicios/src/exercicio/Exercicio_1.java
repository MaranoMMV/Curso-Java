package exercicio;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int soma = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		c = soma;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(soma);
		
		sc.close();
	}

}
