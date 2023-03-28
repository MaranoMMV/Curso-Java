package application;

import devices.ComcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		ComcretePrinter p = new ComcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		

	}

}
