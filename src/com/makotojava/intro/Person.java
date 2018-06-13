package com.makotojava.intro;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class Person {
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, int age, int height, int weight, String eyeColor, String gender) {
		  this.firstName = firstName;
		  this.lastName = lastName;
		  this.age = age;
		  this.height = height;
		  this.weight = weight;
		  this.eyeColor = eyeColor;
		  this.gender = gender;
		}
	  public static final String GENDER_MALE = "MALE";
	  public static final String GENDER_FEMALE = "FEMALE";

	  private String firstName;
	  private String lastName;
	  private int age;
	  private int height;
	  private int weight;
	  private String eyeColor;
	  private String gender;
	  
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
	    int ret = height;
	    // If locale of the computer this code is running on is U.S.,
	    if (Locale.getDefault().equals(Locale.US))
	        ret /= 2.54;// convert from cm to inches
	    return ret;
	}	
	public void setHeight(int height) {
	this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
	    return getFirstName().concat(" ").concat(getLastName());
	}

	public void printAudit(StringBuilder buffer) {
	   buffer.append("Name=");
	   buffer.append(getFullName());
	   buffer.append(",");
	   buffer.append("Age=");
	   buffer.append(getAge());
	   buffer.append(",");
	   buffer.append("Height=");
	   buffer.append(getHeight());
	   buffer.append(",");
	   buffer.append("Weight=");
	   buffer.append(getWeight());
	   buffer.append(",");
	   buffer.append("EyeColor=");
	   buffer.append(getEyeColor());
	   buffer.append(",");
	   buffer.append("Gender=");
	   buffer.append(getGender());
	}
		 
	public void printAudit(Logger l) {
	   StringBuilder sb = new StringBuilder();
	   printAudit(sb);
	   l.info(sb.toString());
	}
	
	
	public static Map<String, Integer> createMapOfIntegers() {
		  Map<String, Integer> mapOfIntegers = new HashMap<>();
		  mapOfIntegers.put("1", Integer.valueOf(1));
		  mapOfIntegers.put("2", Integer.valueOf(2));
		  mapOfIntegers.put("3", Integer.valueOf(3));
		  //...
		  mapOfIntegers.put("168", Integer.valueOf(168));
		return mapOfIntegers;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((eyeColor == null) ? 0 : eyeColor.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + height;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + weight;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (eyeColor == null) {
			if (other.eyeColor != null)
				return false;
		} else if (!eyeColor.equals(other.eyeColor))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (height != other.height)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", height=" + height
				+ ", weight=" + weight + ", eyeColor=" + eyeColor + ", gender=" + gender + "]";
	}

	public static void main(String[] args) {

		//Sets
		Set<Integer> setOfIntegers = new HashSet();
		setOfIntegers.add(Integer.valueOf(10));
		setOfIntegers.add(Integer.valueOf(20));
		setOfIntegers.add(Integer.valueOf(30));
		setOfIntegers.add(Integer.valueOf(40));
		setOfIntegers.add(Integer.valueOf(50));
		Logger l = Logger.getLogger("Test");
		for (Integer i : setOfIntegers) {
		  l.info("Integer value is : " + i);
		}
		
		System.out.println("End of sets \n");

		//Maps
		Map<String, Integer> mapOfIntegers = createMapOfIntegers();
		Integer oneHundred68 = mapOfIntegers.get("168");
		l.info("Mapping to string : " + "\"168\"" + " is : " + oneHundred68);
		System.out.println("End of Maps \n");

		
		//Using Set with Map
		Set<String> keys = mapOfIntegers.keySet();
		for (String key : keys) {
		  Integer  value = mapOfIntegers.get(key);
		  l.info("Value keyed by '" + key + "' is '" + value + "'");
		}
		System.out.println("End of Using Set with Map \n");
		
		//Overloading methods
		Person p = new Person("Joe Q", "Author", 42, 173, 82, "Brown", GENDER_MALE);
		p.printAudit(l);
		System.out.println("End of Overloading methods \n");

		//Overriding methods
		Employee e = new Employee("Joe Q", "Author", 42, 173, 82, "Brown", GENDER_MALE, "1234", "0", BigDecimal.valueOf(1000));
		e.printAudit(l);
		System.out.println("End of Overriding methods \n");
		
		//Class methods
		Logger employeeLogger = Employee.getLogger();
		employeeLogger.info(employeeLogger.toString());
		System.out.println("End of Class methods \n");

	}

}

