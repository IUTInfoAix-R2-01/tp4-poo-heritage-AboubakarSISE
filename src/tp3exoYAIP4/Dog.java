package tp3exoYAIP4;

public class Dog extends Mammal{
	public Dog (String name) {
		super(name);
	}
	
	public void greetsDog() {
		System.out.println("Woof");
	}
	
	public void greetsDogLong() {
		System.out.println("Wooooooof");
	}
	
	@Override
	public String toString() {
		return "Dog [" + "Mammal ["+ "Animal [name = " + name + " ]]]";
	}
}
