package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Departament;
import entities.Worker;
import entities.enums.WorkLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = scan.nextLine();
		System.out.print("Emter wprler data: ");
		System.out.print("Name: ");
		String workerName = scan.nextLine();
		System.out.print("Level: ");
		String workerLevel = scan.nextLine();
		System.out.print("Base Salary: ");
		Double baseSalary = scan.nextDouble();
		
		Worker worker = new Worker(workerName, WorkLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));
		
		
		System.out.println("How many contracts to this worker? ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scan.next());
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			System.out.println("Duration (hours): ");
			int hours = scan.nextInt();
			Contract contract = new Contract(contractDate, valuePerHour, hours); 
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scan.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department" + worker.getDepartment().getName());
		System.out.println("Income for" + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		scan.close();
	}

}
