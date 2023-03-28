package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.ContractService;

public class Program {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int number = scan.nextInt();
		scan.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		String time = (scan.nextLine());
		System.out.print("Valor do contrato: ");
		double value = scan.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int n = scan.nextInt();
		ContractService con = new ContractService(time, n);
		System.out.println("Parcelas: ");
		
		for(int i=1; i<n+1; i++) {
			System.out.println( time.plusMonths(i) + i + " = " + con.parcela());
			
		
		}
	}

}
