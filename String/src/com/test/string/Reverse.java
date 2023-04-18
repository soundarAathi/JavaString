package com.test.string;

public class Reverse {
	public static void main(String[] args) {
		String s= "Java Selenium";
				StringBuilder sb= new StringBuilder(s);
				System.out.println(sb.reverse());
				
				//Word Reverse
				
				String a[] = s.split(" ");
				for(int i=a.length-1;i>=0;i--) {
					System.out.print(a[i]+" ");
				}
	}

}
