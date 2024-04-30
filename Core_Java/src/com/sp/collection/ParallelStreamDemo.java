package com.sp.collection;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {

	public static void main(String[] args) throws IOException {
		
		File file =new File("C:\\This PC\\text.txt.txt");
		
		List <String>list=Files.readAllLines(file.toPath());
		Stream<String> s=Files.lines(file.toPath());
		
		list.parallelStream().forEach(System.out::println);
		//s.parallel().forEach(System.out::println);
		

	}

}
