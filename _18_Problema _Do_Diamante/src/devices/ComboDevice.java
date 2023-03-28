package devices;

public class ComboDevice extends Device implements Scanner, Printer{

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public String scan() {
		// TODO Stub de método gerado automaticamente
		return null;
	}

	@Override
	public void processDoc(String doc) {
		// TODO Stub de método gerado automaticamente
		
	}
	
}
