package io.javabrains.javacollections;

import java.util.Date;
import java.util.Objects;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

public class EqualsAndHashCode {

    public static void main(String[] args) {
    	Person p1 = new Person("Sachin","Tendulkar",50,new Date());
    	Person p2 = new Person("Dhoni","MS",41,new Date());
    	Person p3 = new Person("Sachin","Tendulkar",50,new Date());
    	System.out.println(p1.equals(p3));//true
    	System.out.println(p1.equals(p2));//false
    	
    }
}

class Person{
	private String firstName;
	private String lastName;
	private Integer age;
	private Date lastModifiedDate;
	
	public Person(String firstName, String lastName, Integer age, Date lastModifiedDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, lastName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(age, other.age) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
		}
	}
	
	
