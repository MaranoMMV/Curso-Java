package funcoes;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Digite os três números");
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		scan.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("O Maior é = " + value);
	}
	
	
}
