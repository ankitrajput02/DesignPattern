package com.bridgelabz.creationaldesign.prototype;

import java.util.ArrayList;
import java.util.List;

public class Company implements Cloneable {
	private String cName;
	List<Employee> Emp = new ArrayList<>();

	public String getcName() {
		return cName;
	}

	public List<Employee> getEmp() {
		return Emp;
	}

	@Override
	public String toString() {
		return "Company [cName=" + cName + ", Emp=" + Emp + "]";
	}

	public void setEmp(List<Employee> emp) {
		Emp = emp;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public void loadData() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			Employee e = new Employee();
			e.setName("Employee " + i);
			getEmp().add(e);
		}

	}

	@Override
	protected Company clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Company c = new Company();
		for (Employee e : this.getEmp()) {
			c.getEmp().add(e);
		}
		return c;
	}

}
