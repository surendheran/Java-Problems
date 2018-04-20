package com.basics.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

	public StreamsExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1, 3, 5);
		
		
		stream.filter(p-> p>1).forEach(p-> System.out.println(p));
		
		Stream<List<String>> namesOriginalList = Stream.of(
				Arrays.asList("Pankaj"), 
				Arrays.asList("David", "Lisa"),
				Arrays.asList("Amit"));
		//flat the stream from List<String> to String stream
		Stream<String> flatStream = namesOriginalList
			.flatMap(strList -> strList.stream());

		flatStream.forEach(System.out::println);
		
		stream = Stream.of(1, 3, 5);
		ArrayList<Integer> llis = (ArrayList<Integer>) stream.collect(Collectors.toList());
		
		Collections.sort(llis, (a, b)-> a.compareTo(b));
		llis.forEach(n-> System.out.println(n));
		
		ArrayList<Integer> llis2 = (ArrayList<Integer>) llis.clone();
		llis.add(7);
		System.out.println(llis+"\t"+llis2);

	}

}
