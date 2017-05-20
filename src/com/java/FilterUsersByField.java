package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterUsersByField {

	private static List<User> users = Arrays.asList(
		      new User(1, "Steve", "Vai", 40),
		      new User(4, "Joe", "Smith", 32),
		      new User(3, "Steve", "Johnson", 57),
		      new User(9, "Mike", "Stevens", 18),
		      new User(10, "George", "Armstrong", 24),
		      new User(2, "Jim", "Smith", 40),
		      new User(8, "Chuck", "Schneider", 34),
		      new User(5, "Jorje", "Gonzales", 22),
		      new User(6, "Jane", "Michaels", 47),
		      new User(7, "Kim", "Berlie", 60)
		    );
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> usersListByAge = users.stream().filter(u -> u.age > 30).collect(Collectors.toList());  
		usersListByAge.forEach(u  -> System.out.println("\t" +u));
	}

}
