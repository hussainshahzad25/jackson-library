package com.person;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class PersonDescComparator implements Comparator<Person> {

	@Override
	public int compare(Person e1, Person e2) {
		return new CompareToBuilder().append(e2.getFirstName(), e1.getFirstName())
				.append(e2.getLastName(), e1.getLastName()).append(e2.getSalary(), e1.getSalary())
				.append(e2.getAge(), e1.getAge()).toComparison();
	}

}