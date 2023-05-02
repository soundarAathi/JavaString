package com.test.string;

public class RightSideStar {
	public static void main(String[] args) {
		int row=5;
		for(int i=1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=row;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
