package com.anurag.jth.designpattern.prototype;

public class PrototypePatternExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		EmployePrototype employee = new EmployePrototype();
		employee.loadData();
		
		
		EmployePrototype emp1 = (EmployePrototype) employee.clone();
		emp1.getEmpList().add("ABC");
		EmployePrototype emp2 = (EmployePrototype) employee.clone();
		emp2.getEmpList().remove("Akhil");
		
		System.out.println(employee.getEmpList());
		System.out.println(emp1.getEmpList());
		System.out.println(emp2.getEmpList());
		
		
				
				
		
		
	}
}
