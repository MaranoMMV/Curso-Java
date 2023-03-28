package entities;

import java.util.Date;

public class ContractService {

	private Date date;
	private double value;
	private int n;
	
	public ContractService() {
	}

	public ContractService( double value, int n) {
		this.value = value;
		this.n = n;
	}

	public ContractService(String time, int n2) {
		// TODO Stub de construtor gerado automaticamente
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double valorDivido() {
		return value / n;
	}
	
	public double parcela() {
		for(int i=1; i<n+1; i++) {
			double first = valorDivido() + ((1*100) / value);
			return first;
		}
		return parcela();
	}
	
	
	
}
