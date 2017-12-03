package com.person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestCompareToBuilder{
   
   public static void main(String args[]){
       Person emp1 = new Person("Anoop","Singh",23,1000000);
       Person emp2 = new Person("Vikash","Khardia",22,1100000);
       Person emp3 = new Person("Rakesh","Vishnoi",21,1400000);
       
       List<Person> persons = new ArrayList<Person>();
       persons.add(emp1);
       persons.add(emp2);
       persons.add(emp3);
       
       Collections.sort(persons, new PersonAscComparator());
       //Collections.sort(Persons, new PersonDescComparator());
       //Collections.sort(Persons, new PersonMixComparator());
       
       for (Person p1 : persons) {
			System.out.println(p1);
		}
   }
}