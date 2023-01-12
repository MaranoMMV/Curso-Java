package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade: ");
		int n = scan.nextInt();
		int[][] mat = new  int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = scan.nextInt();
			}
		}

	}

}
