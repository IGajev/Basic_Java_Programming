package com.makotojava.intro;

import java.util.Locale;
import java.util.logging.Logger;

import org.junit.Test;
import static org.junit.Assert.*;


public class PersonTest {

	@Test
	public void testPerson() {
		  Person p = new Person("Joe Q", "Author", 42, 173, 82, "Brown", "MALE");
		  Logger l = Logger.getLogger(Person.class.getName());
		  l.info("Name: " + p.getFullName());
		  l.info("Age:" + p.getAge());
		  l.info("Height (cm or in):" + p.getHeight());
		  l.info("Weight (kg):" + p.getWeight());
		  l.info("Eye Color:" + p.getEyeColor());
		  l.info("Gender:" + p.getGender());
		  assertEquals("Joe Q Author", p.getFullName());
		  assertEquals(42, p.getAge());
		  int heightCalc = 173; 
		  if (Locale.getDefault().equals(Locale.US))
			  heightCalc /= 2.54;
		  assertEquals(heightCalc, p.getHeight());
		  assertEquals(82, p.getWeight());
		  assertEquals("Brown", p.getEyeColor());
		  assertEquals("MALE", p.getGender());
	}

}
