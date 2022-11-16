package exercicio;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Atributos
		int id_product_1;
		int quanty_1;
		float preco_1;
		int id_product_2;
		int quanty_2;
		float preco_2;
		float soma;
		float multiplicacao_1;
		float multiplicacao_2;
		
		System.out.println("Id1: ");
		id_product_1 = sc.nextInt();
		System.out.println("quantidade1: ");
		quanty_1 = sc.nextInt();
		System.out.println("preço 1: ");
		preco_1 = sc.nextFloat();
		System.out.println("id_2: ");
		id_product_2 = sc.nextInt();
		System.out.println("quantidade 2: ");
		quanty_2 = sc.nextInt();
		System.out.println("preço 2: ");
		preco_2 = sc.nextFloat();
		
		multiplicacao_1 = quanty_1 * preco_1;
		multiplicacao_2 = quanty_2 * preco_2;
		soma = multiplicacao_1 + multiplicacao_2;
		
		System.out.println("Id 1 Inserido: " + id_product_1);
		System.out.println("Quantidade 1 inserida: " + quanty_1);
		System.out.println("Preço 1 inserido: " + preco_1);
		System.out.println("Id 2 inserido: " + id_product_2);
		System.out.println("quantidade 2 inserida: " + quanty_2);
		System.out.println("Preço 2 inserido: " + preco_2);
		System.out.println(multiplicacao_1);
		System.out.println(multiplicacao_2);
		System.out.println(soma);
		
		
		
		multiplicacao_1 = quanty_1 * preco_1;
		multiplicacao_2 = quanty_2 * preco_2;
		
		soma = multiplicacao_1 + multiplicacao_2;
		
		
		
		
		
		
		
	}

}
