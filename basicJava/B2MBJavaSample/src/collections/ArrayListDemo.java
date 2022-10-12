package collections;


import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList foodList = new ArrayList();
		foodList.add("dosa");
		foodList.add("vada");
		foodList.add("idli");
		foodList.add("poori");
		foodList.add("bonda");
		foodList.add("idli"); //duplicate is allowed
		System.out.println(foodList);
		
//		
		foodList.add(43);
		foodList.add(43.0890989);
		foodList.add(true);
		foodList.add(null);
		foodList.add("idli");
		System.out.println(foodList);
//		foodList.remove("bonda");
		System.out.println(foodList.size());
//		
		System.out.println(foodList.contains("vada"));
////		foodList.clear();
		System.out.println(foodList.isEmpty());
		foodList.add(2,"coffee" );
//		
//		System.out.println(foodList);
		System.out.println(foodList.get(3));
		System.out.println(foodList.indexOf("idli"));
		System.out.println(foodList.lastIndexOf("idli"));
		System.out.println(foodList.subList(2, 6));
		foodList.set(0, "masala dosa"); //replacing 
//		
		
//		foodList.
//		System.out.println(foodList);
		ArrayList snackList = new ArrayList();
		snackList.add("pizza");
		snackList.add("pasta");
		snackList.add("burger");
		snackList.add(22);
		
		foodList.addAll(2, snackList);
//		
		System.out.println(foodList);
	}

}