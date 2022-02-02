package com.nttdata.patterdesin.patterns.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.nttdata.patterdesin.patterns.domain.Person;

public class PersonFacade {
	
	private List<Person> people = new ArrayList<Person>();
	
	public PersonFacade() {
		Person person1 = Person.Builder().name("Person 1").age(10).build();
		people.add(person1);
		Person person2 = Person.Builder().name("Person 2").age(20).build();
		people.add(person2);
		Person person3 = Person.Builder().name("Person 3").age(30).build();
		people.add(person3);
		Person person4 = Person.Builder().name("Person 4").age(40).build();
		people.add(person4);
	}
	
	public List<Person> getPersonsBetween20And30 () {
		
		return people.stream().filter(p -> p.getAge()>=20 && p.getAge()<=30).collect(Collectors.toList());
		
	}
	 

}
