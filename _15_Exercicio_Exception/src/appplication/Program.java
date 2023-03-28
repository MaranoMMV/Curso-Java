package appplication;

import java.util.Locale;
import java.util.Scanner;

import Exceptions.AccountException;
import entities.Account;

public class Program {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = scan.nextInt();
			System.out.print("Name: ");
			char name = scan.next().charAt(1);
			scan.nextLine();
			System.out.print("Initial Balance: ");
			double balance = scan.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = scan.nextDouble();
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdraw = scan.nextDouble();
			Account account = new Account(number, name, balance, withdrawLimit, withdraw);
			System.out.println(account.withdraw());
		}
		catch(AccountException e){
			System.out.println("Withdraw error: " + e.getMessage());
		}
		scan.close();
	}

}
