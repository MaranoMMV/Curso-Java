package application;
import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		double dollar;
		double dollarNeed;
		
		System.out.println("What is the dollar price? ");
		dollar = scan.nextDouble();
		System.out.println("How many dollars will be bought? ");
		dollarNeed = scan.nextDouble();
		
		System.out.printf(calc.convert_dollar());
	}

}