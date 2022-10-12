package collections;

import java.util.HashSet;

public class HashDemo {
	public static void main(String[] args) {
		HashSet foodSet = new HashSet();
		foodSet.add("dosa");
		foodSet.add("vada");
		foodSet.add("idli");
		foodSet.add("vada"); //dup not allowed
		foodSet.add(1);
		System.out.println(foodSet); //ins order not maintained
	}
}
