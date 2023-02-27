package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {

	private String name;
	private WorkLevel level;
	private Double baseSalary;
	
	private Departament department;
	private List<Contract> contracts = new ArrayList<>();
	
	public Worker() {
	}

	public Worker(String name, WorkLevel level, Double baseSalary, Departament department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkLevel getLevel() {
		return level;
	}

	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartment() {
		return department;
	}

	public void setDepartment(Departament department) {
		this.department = department;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	public void addContract(Contract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(Contract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(Contract c: contracts) {
			cal.setTime(c.getDate());
			
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			
			if( year == c_year && month == c_month) {
				
				sum += c.totalValue();
				
			}
		}
	return sum;
	}
}
