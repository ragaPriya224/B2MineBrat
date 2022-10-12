package collections;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet dataSet =new TreeSet();
		dataSet.add(100);
		dataSet.add(101);
		dataSet.add(104);
		dataSet.add(107);
		dataSet.add(110);
		dataSet.add(115);
		dataSet.add(100);
		dataSet.add(103);
		dataSet.add(100); //dup not allowed
		dataSet.add("hello team");
		System.out.println(dataSet);
		
	}
}
