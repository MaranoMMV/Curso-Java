package exercicio;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		float pi = 3.14159f;
		float entrada = 0;
		float raio;
		
		entrada = sc.nextFloat();
		raio = (float) (Math.pow(entrada, 2)) * pi;
		System.out.println(entrada);
		System.out.println(raio);
		
	}

}
