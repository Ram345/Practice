package practice;

public class PassByValue {

	public static void main(String[] args) {
		Dog aDog = new Dog("Max");
	    foo(aDog);
	    System.out.println("3:"+aDog.getName().equals("Max")); // true
	    System.out.println("4:"+aDog.getName().equals("Fifi")); // false 
	}

	public static void foo(Dog d) {
		System.out.println("1:"+d.getName().equals("Max")); // true
	    // change d inside of foo() to point to a new Dog instance "Fifi"
	    d = new Dog("Fifi");
	    System.out.println("2:"+d.getName().equals("Fifi")); // true
	}

}
