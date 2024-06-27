package com.demo;

public class Palindrome {
	
	
	//int[] ch = a;
	public static void main(String[] args) {
		int a = 464;
		String s = Integer.toString(a);
		char[] ch = s.toCharArray();	
		int i =0;
		int j = ch.length-1;
		while(i<j){
			  char c = ch[i];
              ch[i] = ch[j];
              ch[j] = c;
              i++;
              j--;
		}
		String s1 = new String(ch);
		if(s1.equals(s)) {
			System.out.println("Its a palindrome");
			
		}
		else {
			System.out.println("Its not a palindrome");
		}
		
	}

}
