package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(8);
		list.add(10);
		list.add(10);
		
		List<Integer> li1 = list.stream().distinct().collect(Collectors.toList());
		//List<Integer> li1 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(li1);
		Integer i = list.stream().distinct().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();
		System.out.println(i);
		  Optional<Integer> maxNumber = list.stream()
                  .min(Integer::compareTo);

if (maxNumber.isPresent()) {
System.out.println("Maximum number: " + maxNumber.get());
} else {
System.out.println("The list is empty.");
} 
		double s = list.stream().collect(Collectors.averagingInt(Integer::intValue));
				//list.stream().filter(a -> (a%2 == 0)).collect(Collectors.toList());
		System.out.println(s);
		String s1 = "adhvik anish";
		  Optional<Character> firstNonRepeatedChar = s1.chars()
	                .mapToObj(c -> (char) c)
	                .filter(c -> s1.indexOf(c) == s1.lastIndexOf(c))
	                .findFirst();

	        if (firstNonRepeatedChar.isPresent()) {
	            System.out.println("First non-repeated character: " + firstNonRepeatedChar.get());
	        } else {
	            System.out.println("No non-repeated characters found.");
	        }
	}

}
