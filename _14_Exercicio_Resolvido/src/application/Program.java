package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		System.out.println("Digite quantos funcionarios");
		int n = scan.nextInt();
		
		for(int i=1; i<n+1; i++) {
			System.out.println("Employee "+ i + " data:");
			System.out.print("Outsourced(Y/N)");
			char ch = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("Hours: ");
			double hours = scan.nextDouble();
			System.out.println("Value Per Hour: ");
			double valuePerHour = scan.nextDouble();
			if(ch =='y'|| ch == 'Y') {
				System.out.print("Additional charge: ");
				double additionalCharge = scan.nextDouble(); 
				Employee emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}else {
				Employee emp = new Employee(name,hours,valuePerHour);
				list.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp: list) {
			System.out.println(emp.getName() + " - $ " + +emp);
		}
		
		scan.close();
	}
	
}
