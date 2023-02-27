package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		System.out.println("Start of program");
		method1();
		
		System.out.println("End of program");
		
	}
	
	public static void method1() {
		System.out.println("==== Method 1 Start =========");
		method2();
		System.out.println("==== Method 1 End ===========");
	}
	
	public static void method2() {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("==== Method 2 Start =========");
			String[] vect = scan.nextLine().split(" ");
			int position = scan.nextInt();
			System.out.println(vect[position]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Invalid position!");
			e.printStackTrace();
			scan.next();
		} 
		catch (InputMismatchException e) {
			
			System.out.println("Input error");
		}
		scan.close();
		System.out.println("==== Method 2 End =========");
	}
}