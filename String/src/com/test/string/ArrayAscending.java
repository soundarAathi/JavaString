package com.test.string;

public class ArrayAscending {
public static void main(String[] args) {
	int a[]= {100,500,20,250,465};
	for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
	if(a[i]>a[j]) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	}
}for(int i=0;i<a.length;i++) {

System.out.println(a[i]);}
}

}
