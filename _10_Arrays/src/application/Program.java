package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = scan.nextInt();
		double[] vect = new double [n];
		
		for (int i=0; i<n; i++) {
			vect[i] = scan.nextDouble();
		}
		
		
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum +=vect[i];
		}
		double avg = sum/n;
		System.out.println("AVERAGE HEIGHT: " + avg);
		scan.close();
	}

}
 