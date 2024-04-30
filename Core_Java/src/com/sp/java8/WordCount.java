package com.sp.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {

    public static void main(String[] args) {
        String sentence = "Java 8 Stream API example Java 8 is powerful";
        Map<String, Long> wordCount = countWords(sentence);

        // Print the word count
        wordCount.forEach((word, count) ->
                System.out.println(word + "=" + count));
    }

    private static Map<String, Long> countWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
    }
}
