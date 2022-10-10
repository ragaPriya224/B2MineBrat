package basic;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		while (condition) {
//			// code block to be executed
//		}
		
		int number = 10;
		while (number<5) {
			System.out.println("hello" +number);
			number++;
		}
		
		
//		do {
//			// code block to be executed
//		}
//		while (condition);
		
		int count = 10;
		do {
			System.out.println("welcome team ");
			count++;
		}
		while (count<5);
	}

}
