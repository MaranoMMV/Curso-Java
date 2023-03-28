package devices;

public class ComcretePrinter extends Device implements Printer{
	
	public ComcretePrinter(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}
	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
}
