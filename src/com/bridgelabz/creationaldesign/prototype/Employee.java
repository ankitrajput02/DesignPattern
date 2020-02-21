package com.bridgelabz.creationaldesign.prototype;

/**Getter and Setter methods for Employee
 * 
 *
 */
public class Employee {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	private String name;
}
