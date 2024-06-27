package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamStrings {
	public static void main(String[] args) {
		// collecting based on length of the string
	List<String> fruits = Arrays.asList("apple", "banana", "orange", "kiwi", "grape", "grape", "grape");	
	List<String> sortedLength = fruits.stream().sorted(Comparator.comparing(String:: length).reversed()).collect(Collectors.toList());
	System.out.println(sortedLength);
	
	// uppercase of this string list
	List<String> upper = fruits.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
	
	//join every string
	String s3 = fruits.stream().collect(Collectors.joining(""));
	System.out.println(s3);
	
	//o/p orange 1, banana 1 , grape 3
	Map<String, Long> mape = fruits.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()) );
	System.out.println(mape);
	
	//above output with int array
	int[] sarray = new int[] {1,3,6,7,4,6,4};
	Map<Integer, Long> inta = IntStream.of(sarray)
			.mapToObj(c-> (int)c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()) );
	System.out.println(inta);
	
	//Reverse a string using java 8
	List<String> fruits1 = Arrays.asList("apple", "banana", "orange", "kiwi", "grape", "grape", "grape");
	List<String> reverseString = fruits1.stream().map(StreamStrings::reverseString).collect(Collectors.toList()); 
	System.out.println(reverseString);
	
}
	private static String reverseString(String s5){
		
		char ch[] = s5.toCharArray();
		int i =0;
		int j=ch.length-1;
		while(i<j) {
			char c = ch[i];
			ch[i] = ch[j];
			ch[j] = c;
			i++;
			j--;
		}
		String output = new String(ch);
		return output;
	}
}

