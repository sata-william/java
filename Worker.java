package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities_enum.WorkerLevel;

public class Worker {
	
	private String      name;
	private WorkerLevel level;
	private Double      baseSalary;
	
	private Departament Depatament;
	private List<HourContract> contracts = new ArrayList<>();	
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament depatament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		Depatament = depatament;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepatament() {
		return Depatament;
	}

	public void setDepatament(Departament depatament) {
		Depatament = depatament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year  = cal.get(Calendar.YEAR);
		    int c_month = 1 + cal.get(Calendar.MONTH); 
			
		    if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
}
