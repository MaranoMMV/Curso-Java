package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		Integer n = scan.nextInt();
		
		for(int i=1; i<n+1; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + i + ":");
			System.out.print("id: ");
			Integer id = scan.nextInt();
			System.out.println("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("Salary: ");
			Double salary = scan.nextDouble();
			
			Employee emp = new Employee(id,name,salary);
			
			list.add(emp);
		}
		System.out.println("Enter the employee id that will have salary increase: ");
		Integer id = scan.nextInt();
		System.out.println("Enter the percentage: ");
		Double porcentage = scan.nextDouble();
		System.out.println("List of employees: ");
		for(Employee emp: list) {
		
		System.out.print(emp);
		}
	}
	public Integer hasId(List<Employee> list, int id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}else {
				System.out.println("ID Invalido");
			}
			
		}
		return null;
	}
}
