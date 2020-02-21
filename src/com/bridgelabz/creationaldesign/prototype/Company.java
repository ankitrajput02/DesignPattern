package com.bridgelabz.creationaldesign.prototype;

import java.util.ArrayList;
import java.util.List;

/**Getter and Setter methods for Company
 *
 */
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

	/**
	 * The better approach would be to clone the existing object into a new object
	 * and then do the data manipulation
	 *
	 */
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
