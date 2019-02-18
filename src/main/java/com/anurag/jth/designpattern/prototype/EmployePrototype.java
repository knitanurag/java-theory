package com.anurag.jth.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployePrototype implements Cloneable{

	private List<String> empList;
	
	public EmployePrototype() {
		this.empList = new ArrayList<>();
	}
	
	public EmployePrototype(List<String> empList) {
		this.empList = empList;
	}



	public void loadData() {
		this.empList.add("Anurag");
		this.empList.add("Akhil");
		this.empList.add("Annu");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> newEmpList = new ArrayList<String>();
		for(String empName : this.empList) {
			newEmpList.add(empName);
		}
		return new EmployePrototype(newEmpList);
	}
	

	public List<String> getEmpList() {
		return empList;
	}
}
