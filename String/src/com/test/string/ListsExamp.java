package com.test.string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListsExamp {
public static void main(String[] args) {
ArrayList<Integer> li = new ArrayList<Integer>();
li.add(1);
li.add(2);
li.add(3);
li.add(4);
li.add(5);
li.add(6);
li.add(7);
int size = li.size();
System.out.println(size);
System.out.println(li.get(1));


ListIterator<Integer> lit = li.listIterator();
lit.hasNext();
while(lit.hasNext()) {
System.out.println(lit.next());
}

}
}
