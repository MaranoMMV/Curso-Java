package index;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Atributos
		int eixo_x;
		int eixo_y;
		System.out.println("Digite o eixo X");
		eixo_x = scan.nextInt();
		System.out.println("Digite o eixo Y");
		eixo_y = scan.nextInt();
		
		//Métodos
		while(eixo_x != 0 || eixo_y != 0) {
			
			if(eixo_x >=0 && eixo_y >= 0) {
				System.out.println("Primeiro Quadrante");
			}else if(eixo_x >= 0 && eixo_y <= 0) {
				System.out.println("Quarto Quadrante");
			}else if(eixo_x <= 0 && eixo_y <= 0) {
				System.out.println("Terceiro Quadrante");
			}else if(eixo_x <= 0 && eixo_y >= 0) {
				System.out.println("Segundo Quadrante");
			}else {
				System.out.println("Deu ruim");
			}
			System.out.println("\nDigite o eixo X");
			eixo_x = scan.nextInt();
			System.out.println("Digite o eixo Y");
			eixo_y = scan.nextInt();
		}
		
		
		
		
	}

}
