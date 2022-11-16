package exercicio;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		Scanner sc = new Scanner(System.in);
		
		
		int a;
		int b;
		int c;
		int d;
		int ab;
		int cd;
		int resposta;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		
		ab = a * b;
		cd = c * d;
		resposta = ab - cd;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(ab);
		System.out.println(cd);
		System.out.println(resposta);
		
	}

}
