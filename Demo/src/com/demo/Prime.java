package com.demo;

import java.util.stream.IntStream;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =20;
		//boolean isPrime = false;
		boolean isPrime = IntStream.range(2, (num/2)+1).noneMatch(i->(num%i == 0));
		if(isPrime)
			System.out.println("Prime number0");
		else
			System.out.println("Not a prime number");

	}

}
