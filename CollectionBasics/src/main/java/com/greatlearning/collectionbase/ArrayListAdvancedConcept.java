package com.greatlearning.collectionbase;

import java.util.LinkedList;
import java.util.List;

class Employee {
	private int empId;

	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	};

}

public class ArrayListAdvancedConcept {
	public static void main(String[] args) {

		List<Employee> empList = new LinkedList<Employee>();

		empList.add(new Employee(121, "ADITI"));
		empList.add(new Employee(122, "ARVIND"));
		empList.add(new Employee(129, "TARANG"));

		for (Employee employee : empList) {
			if(employee.getEmpName().equals("ARVIND")) {
				System.out.println(employee);
			}
		}

	}
}
