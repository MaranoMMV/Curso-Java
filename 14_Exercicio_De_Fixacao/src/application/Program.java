package application;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		Product product = new Product();
		
		
		System.out.print("Digite a quantidade de produtos: ");
		int n = scan.nextInt();
		
		for(int i=1; i<n+1; i++) {
			System.out.println("Product #" + i + ": ");
			System.out.print("Common, used or imported? (c/u/i)");
			char type = scan.next().charAt(0);
			System.out.println("Name: ");
			String name = scan.next();
			System.out.println("Price: ");
			Double price = scan.nextDouble();
			if(type == 'c' || type == 'C') {
				System.out.println("C: ");
				list.add(product);
			}else if(type == 'u' || type == 'U') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				UsedProduct used = new UsedProduct();
				used.setManufactureDate.DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy").parse(scan.next());
			}else {
				
			}
		}
		
	}

}
