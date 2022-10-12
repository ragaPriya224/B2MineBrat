package collections;

import java.util.TreeSet;

public class SortedSetDemo {
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
		System.out.println(dataSet);
		System.out.println(dataSet.first());
		System.out.println(dataSet.last());
		System.out.println(dataSet.headSet(104)); //lt than that
		System.out.println(dataSet.tailSet(104));//grter than or equal to 
		System.out.println(dataSet.subSet(100, 110));
		System.out.println(dataSet.size());
	}
}
