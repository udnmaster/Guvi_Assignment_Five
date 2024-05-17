package com.demo.assignmentFive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStringChecker {
	public static void main(String[] args) {
		// Given list of strings
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		// Filter non-empty strings
		List<String> nonEmptyStrings = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

		// Print the list of non-empty strings
		System.out.println("Non-empty strings: " + nonEmptyStrings);
	}
}
