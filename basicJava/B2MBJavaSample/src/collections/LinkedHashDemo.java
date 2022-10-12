package collections;

import java.util.LinkedHashSet;

public class LinkedHashDemo {
	public static void main(String[] args) {
		LinkedHashSet foodSet = new LinkedHashSet();
		foodSet.add("dosa");
		foodSet.add("vada");
		foodSet.add("idli");
		foodSet.add("vada"); //dup not allowed
		foodSet.add(1);//hetero data allowed
		System.out.println(foodSet); //ins order  maintained
	}
}
