package basic;

public class Car {

	int wheels;
	String colour;
	String name;

	Car(){ //no arg constructor 
		wheels = 4;
		colour ="black";
	}

	Car(String colour, int wheel){ // arg constructor 
		this.wheels = wheel;
		this.colour =colour;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car audi = new Car();
		//		audi.colour ="black";
		//		audi.wheels = 4;
		System.out.println(audi.colour);
		System.out.println(audi.wheels);

		Car bmw = new Car("blue",5);
//		bmw.colour ="blue";
//		bmw.wheels = 5;
		System.out.println(bmw.colour);
		System.out.println(bmw.wheels);
		

		Car tata = new Car("blue",5);
//		bmw.colour ="blue";
//		bmw.wheels = 5;
		System.out.println(tata.colour);
		System.out.println(tata.wheels);
	}

}
