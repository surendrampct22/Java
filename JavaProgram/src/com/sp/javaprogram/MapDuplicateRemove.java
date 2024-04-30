package com.sp.javaprogram;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MapDuplicateRemove {
    public static void main(String[] args) {
        int i[] = {1, 2, 3, 4, 1, 9, 5};
        

        // Use Java 8 streams to remove duplicates and sort in ascending order
        String result = Arrays.stream(i)
                .distinct() // Remove duplicates
                .sorted()   // Sort in ascending order
                .mapToObj(Integer::toString) // Convert integers to strings
                .collect(Collectors.joining(",")); // Join the elements with a comma

        // Print the result
        System.out.println(result);
    }
}
