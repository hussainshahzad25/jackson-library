package com.person;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class PersonAscComparator implements Comparator<Person> {
	@Override
	public int compare(Person e1, Person e2) {
		return new CompareToBuilder().append(e1.getFirstName(), e2.getFirstName())
				.append(e1.getLastName(), e2.getLastName()).append(e1.getSalary(), e2.getSalary())
				.append(e1.getAge(), e2.getAge()).toComparison();
	}

}