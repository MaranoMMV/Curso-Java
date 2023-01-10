package entities;

public class Employee {

	private String name;
	private int id;
	private double salary;
	private double porcentage;
	
	public Employee() {
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double porcentage_1() {
		salary += salary * porcentage / 100.0;
		return salary;
	}

	public String toString() {
		return getId()
				+ ", "
				+ getName()
				+ ", "
				+ porcentage_1();
	}
}
