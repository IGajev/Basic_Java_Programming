package com.makotojava.intro;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class Employee extends Person {
	private static final Logger logger = Logger.getLogger(Employee.class.getName());
	  
	private String taxpayerIdentificationNumber;
	private String employeeNumber;
	private BigDecimal salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, int age, int height, int weight, String eyeColor,
			String gender, String taxpayerIdentificationNumber, String employeeNumber, BigDecimal salary) {
		super(firstName, lastName, age, height, weight, eyeColor, gender);
		// TODO Auto-generated constructor stub
		this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
		this.employeeNumber = employeeNumber;
		this.salary = salary;
	}

	public static Logger getLogger() {
		return logger;
	}
	/**
	 * @return the taxpayerIdentificationNumber
	 */
	public String getTaxpayerIdentificationNumber() {
		return taxpayerIdentificationNumber;
	}

	/**
	 * @param taxpayerIdentificationNumber the taxpayerIdentificationNumber to set
	 */
	public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) {
		this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
	}

	/**
	 * @return the employeeNumber
	 */
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * @return the salary
	 */
	public BigDecimal getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	/* (non-Javadoc)
	 * @see com.makotojava.intro.Person#printAudit(java.lang.StringBuilder)
	 */
	@Override
	public void printAudit(StringBuilder buffer) {
		// Now format this instance's values
		buffer.append(toString());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((employeeNumber == null) ? 0 : employeeNumber.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result
				+ ((taxpayerIdentificationNumber == null) ? 0 : taxpayerIdentificationNumber.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeNumber == null) {
			if (other.employeeNumber != null)
				return false;
		} else if (!employeeNumber.equals(other.employeeNumber))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (taxpayerIdentificationNumber == null) {
			if (other.taxpayerIdentificationNumber != null)
				return false;
		} else if (!taxpayerIdentificationNumber.equals(other.taxpayerIdentificationNumber))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "Employee [taxpayerIdentificationNumber=" + taxpayerIdentificationNumber + ", employeeNumber="
				+ employeeNumber + ", salary=" + salary + "]";
	}

}
