package entities;

public class Employee {
	private String name;
	private Integer hours;
	private Integer valuePerHour;
	
	public Employee() {
	}

	public Employee(String name, double hours2, double valuePerHour2) {
		this.name = name;
		this.hours = hours2;
		this.valuePerHour = valuePerHour2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Integer getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Integer valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {
		return hours * valuePerHour;
	}
}
