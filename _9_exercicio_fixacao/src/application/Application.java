package application;

import java.util.Locale;
import java.util.Scanner;

import bank.Bank;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Bank bank = null;
		System.out.println("Enter account number: ");
		int number = scan.nextInt();
		System.out.println("Enter account  holder: ");
		String holder = scan.next();
		System.out.println("Is there na initial deposit (y/n)? ");
		char resposta = scan.next().charAt(0);
		if(resposta == 'y') {
			System.out.println("Enter initial deposit value: ");
			double balance = scan.nextDouble();
			bank = new Bank(number, holder, balance);
		}else {
			bank = new Bank(number, holder);
		}
		System.out.println();
		System.out.println("Account data");
		System.out.println(bank);
		
		System.out.println("Enter a deposit value: ");
		double soma = scan.nextDouble();
		System.out.println("Account: " + bank.getNumber() +" Holder: " + bank.getHolder() + " Balance: " + bank.depositSoma(soma));
		
		System.out.println("Enter a withdraw value: ");
		double menos = scan.nextDouble();
		System.out.println("Account: " + bank.getNumber() +" Holder: " + bank.getHolder() + " Balance: " + bank.depositMenos(menos));
		
		scan.close();
	}

}
