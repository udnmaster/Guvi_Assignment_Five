package com.demo.assignmentFive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGifts {
	public static void main(String[] args) {
		// List of student names
		List<String> studentNames = Arrays.asList("Alice", "Bob", "Alex", "Anna", "Charlie", "Andrew", "Amy", "David",
				"Aaron", "Sophia");

		// Filter students whose names start with "A"
		List<String> studentsWithAGift = studentNames.stream().filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());

		// Print students who will receive gifts
		System.out.println("Students with names starting with 'A' who will receive gifts:");
		studentsWithAGift.forEach(System.out::println);
	}
}
