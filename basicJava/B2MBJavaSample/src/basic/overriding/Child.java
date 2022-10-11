package basic.overriding;

public class Child extends Parent{

	
	public static void main(String[] args) {
		Child c = new Child();
		c.wealth();
		c.marry();
	}
	public void marry() {
		System.out.println("marry y");
	} //overriding 
}