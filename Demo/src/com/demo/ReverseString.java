package com.demo;

public class ReverseString {
	public static void main(String[] args) {
        String s ="A@nush*a";
        char[] a = s.toCharArray();
        int i =0;
        int j = a.length-1;
        while(i<j){
          /*  if(!Character.isAlphabetic(a[i])) i++;
            if(!Character.isAlphabetic(a[j])) j--;
            else{*/
                char c = a[i];
                a[i] = a[j];
                a[j] = c;
                i++;
                j--;
         //   }
            
        }
        String s1 = new String(a);
        
        System.out.println(s1);
    }
}
