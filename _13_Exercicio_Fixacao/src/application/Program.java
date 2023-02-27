package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat birthDate = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner (System.in);
		Client client = new Client();
		Product prod = new Product();
		OrderItem ordItem = new OrderItem();
		Order order = new Order();
		System.out.println("Enter cliente data:");
		System.out.println("Name: ");
		client.setName(scan.next());
		System.out.println("Email:");
		client.setEmail(scan.next());
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birth = birthDate.parse(scan.next());
		client.setBirthDate(birth);
		System.out.println();
		System.out.println("Enter order data: ");
		/* ENUM */
		System.out.println("How many itens to this order? ");
		int n = scan.nextInt();
		for(int i=1; i<n+1; i++) {
			System.out.println("Enter " + i + " item data:");
			System.out.println("Product name: ");
			prod.setNameProduct(scan.next());
			System.out.println("product Price: ");
			prod.setPrice(scan.nextDouble());
			System.out.println("Quantity");
			ordItem.setQuantity(scan.nextInt());
		}
		System.out.println("Order Summary: ");
		System.out.println("Order moment: " + order.getData());
		System.out.println("Order Status: ");
		System.out.println("Client: " + client.getName() + " " + client.getBirthDate() + " - " + client.getEmail());
		System.out.println("Order items: ");
		
		
	}

}
