package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortListByName sln = new SortListByName();
			
		List<Employee> empInner = Arrays.asList(
				sln.new Employee("Ram"),
				sln.new Employee("Hello"),
				sln.new Employee("Hi"),
				sln.new Employee("Test"),
				sln.new Employee("Abc"),
				sln.new Employee("Xyz"));
		
		sln.sortListByName(empInner);
	}

	public void sortListByName(List<Employee> empList){
		List<Employee> result = empList.stream().sorted((e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName()))
						.collect(Collectors.toList());
						//.forEach((i) -> { System.out.println(i) } );
		result.forEach((i) -> {
		        System.out.println(i.getEmpName());
		    });
	}
	
	class Employee{
		
		public Employee(){}
		
		public Employee(String empName) {
			super();
			this.empName = empName;
		}

		String empName;

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}
	}
}
