package com.test.string;

public class PrimeNumber {
public static void main(String[] args) {
	int n=2;
	int i=1;
	int count=0;
	while(i<=n) {
		if(n%i==0) {
			count++;
}
		i++;
		

}
	if(count==2) {
	System.out.println("Prime No");
	}else {
		System.out.println("Not A Prime NO");
	}

}}
