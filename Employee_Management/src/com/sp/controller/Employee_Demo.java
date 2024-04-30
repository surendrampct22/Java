
package com.sp.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sp.model.Employee;

public class Employee_Demo {
	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, .5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		List<Employee> l = employeeList.stream().filter(a -> a.getName().startsWith("A"))
				.sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());

		// l.forEach(a->System.out.println(a));

		// System.out.println(s);

		// How many male and female employee in our org.

		Map<String, Long> getMaleAndFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		// System.out.println(getMaleAndFemale);

		// how many dept in our org

		List<String> dept = employeeList.stream().map(a -> a.getDepartment()).distinct().collect(Collectors.toList());

		// System.out.println(dept);

		// Second highest salary using a java 8
		Optional<Employee> lest1 = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

		// lest1.ifPresent(e->{System.out.println(e.getSalary());});
		// System.out.println(lest1);

		List<String> list3 = employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.collect(Collectors.toList());
		// System.out.println(list3);

		// Count the number of employee in each dept

		Map<String, Long> demo = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Set<Entry<String, Long>> entrySet = demo.entrySet();
		/*
		 * for(Entry<String,Long> entry:entrySet) {
		 * System.out.println(entry.getKey()+" "+entry.getValue()); }
		 */

		// get avarage salary of each dept

		Map<String, Double> demo1 = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		Set<Entry<String, Double>> entrySet1 = demo1.entrySet();
		/*
		 * for(Entry<String, Double> entry:entrySet1) {
		 * System.out.println(entry.getKey()+" "+entry.getValue()); }
		 */
		// Get the details of youngest male employee in the product development
		// department?

		Optional<Employee> l1 = employeeList.stream()
				.filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
				.sorted(Comparator.comparingDouble(Employee::getAge)).findFirst();
		// System.out.println(l1);

		// Who has the most working experience in the organization?
		Optional<Employee> opt = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining))
				.findFirst();
//System.out.println(opt);

		
		//Who is the oldest employee in the organization? What is his age and which department he belongs to?
		Optional<Employee> opt1=employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).findFirst();
		
		System.out.println(opt1);
	}

}
