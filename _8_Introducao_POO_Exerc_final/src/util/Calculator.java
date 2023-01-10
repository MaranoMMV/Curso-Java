package util;
import application.Program;

public class Calculator {

	
	public double convert_dollar(double dollar, double dollarNeed) {
		double value = dollar * dollarNeed;
		return value;
	}
	
	public String toString() {
		return "Amount to be paid in reais = " + convert_dollar();
	}
	
	
}
