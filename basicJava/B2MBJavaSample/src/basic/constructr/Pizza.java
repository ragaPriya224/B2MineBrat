package basic.constructr;

public class Pizza {

	String topping;
	String size;
	
	Pizza(String topping){
		this.topping = topping;
	}
	Pizza(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza cheesePizza = new Pizza("olives"); //good practice 
//		cheesePizza.topping= "olives";
		System.out.println(cheesePizza.topping);
		
		Pizza dominos = new Pizza();
		dominos.topping= "onion";
		System.out.println(dominos.topping);
	}

}

//constructor -> no arg, parameterized
