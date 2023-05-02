package com.test.string;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=153;
		int ori=num;
		int armnum=0;
		while(num>0) {
			int rem=num%10;
			armnum=(rem*rem*rem)+armnum;
		    num=num/10;
		    }
	    if (ori==armnum) {
				System.out.println("Armstrong numner");
				System.out.println(armnum);
			}
			else{
				System.out.println("non Armstrong");
			}
			
			
		}
		
	

}
