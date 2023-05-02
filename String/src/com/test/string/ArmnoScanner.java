package com.test.string;

import java.util.Scanner;

public class ArmnoScanner {
public static void main(String[] args) {
	int rem=0;
	int rev=0;
	
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter Number");
 int value= sc.nextInt();
 int n= value;
 while (n>0){
	 rem =n%10;
	 rev=(rem*rem*rem)+rev;
	 n=n/10;
 }
	 if(value==rev) {
		 System.out.println("ArmStrong Number");
	 }
	 else {
		 System.out.println("Non Armstrong Number");
	 }
	 
 }
}

