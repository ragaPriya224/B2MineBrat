package basic.overloading;
//overloading demo
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		demo.add(10);
	}

	public void add(int num) {
		System.out.println(num+num);
		System.out.println("hello");
	}
	public void add(String  num) {
		System.out.println(num);
		System.out.println("welcome");
	}
	
	public void add(int num, int number2) {
		System.out.println(num+number2);
		System.out.println("bye");
	}
}
