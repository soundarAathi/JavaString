package com.test.string;

public class OddEvenNo {
public static void main(String[] args) {
	int i=12;
	
	if(i%10==1) {
		
		System.out.println("Odd Number");
	}
	else {
		System.out.println("Even Number");
	}
	System.out.println(++i);
	System.out.println(++i);
	System.out.println(i++);
	System.out.println(i++);
	System.out.println(++i);
	System.out.println(i++);
}
}
