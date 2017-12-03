package com.person;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class PersonMixComparator implements Comparator<Person> {

	@Override
	public int compare(Person e1, Person e2) {
		return new CompareToBuilder().append(e1.getFirstName(), e2.getFirstName())
				.append(e1.getLastName(), e2.getLastName()).append(e2.getSalary(), e1.getSalary())
				.append(e2.getAge(), e1.getAge()).toComparison();
	}
}