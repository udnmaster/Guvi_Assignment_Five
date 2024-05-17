package com.demo.assignmentFive;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UppercaseConverter {
	public static void main(String[] args) {
        // Given list of strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Convert list of strings to uppercase
        List<String> uppercaseNames = names.map(String::toUpperCase)
                                           .collect(Collectors.toList());

        // Print the converted list
        System.out.println("Uppercase names: " + uppercaseNames);
    }

}
