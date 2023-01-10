package application;

import java.util.Locale;
import java.util.Scanner;

import functions.Function;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		int n;
		System.out.println("How many rooms will be rented? ");
		n = scan.nextInt();
		
		String[] nome = new String[n];
		String[] email = new String[n];
		int[] room = new int[n];
		Function func = new Function(room, nome, email);
		for(int i=1; i<n; i++) {
			System.out.println("Rent #" + i);
			System.out.println("Name: ");
			nome[i] = scan.next();
			System.out.println("Email: ");
			email[i] = scan.next();
			System.out.println("Room: ");
			room[i] = scan.nextInt();
		}
		System.out.println("");
		System.out.println("Busy rooms: ");
		for(int i=1; i<n; i++) {
			System.out.println(func.toString());
		}
	}

}
