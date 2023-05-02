package com.test.string;

public class Pyramid {
	public static void main(String[] args) {
		int rows=5;
		for (int i=1; i<=rows;i++) {
		for(int s=1; s<=i;s++) {
				System.out.print("*");
			}
			System.out.println("");
	}
		for(int i=1;i<=rows;i++) {
			for (int j=rows;j>=i;j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
}
/*
I st iter
 i=o;i<=rows
 s=0;0<=0;          
 *w
2 nd iter
i=1;1<=5;
s=1;1<=1;
**w;






*/