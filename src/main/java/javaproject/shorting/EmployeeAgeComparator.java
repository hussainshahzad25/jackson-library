package javaproject.shorting;

import java.util.Comparator;
/**
 * 
 * @author shahzad
 *
 */
public class EmployeeAgeComparator implements Comparator<Employee> {
 
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getAge() - emp2.getAge();
    }
}