package com.test.string;

import java.util.HashMap;

public class StringCount {
public static void main(String[] args) {
	String s="Welcome JavA";
	HashMap<Character,Integer>m=new HashMap<>();
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(m.containsKey(c)) {
			Integer x = m.get(c);
			m.put(c,x+1);
			
			
		}else {
			m.put(c,1);
		}
	}System.out.println(m);}
	

}
