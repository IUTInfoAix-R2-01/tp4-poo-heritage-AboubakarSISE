package tp3exoYAIP4;

public class Cat extends Mammal{
	public Cat (String name) {
		super(name);
	}
	
	public void greetsCat() {
		System.out.println("Meow");
	}
	
	@Override
	public String toString() {
		return "Cat [" + "Mammal ["+ "Animal [name = " + name + " ]]]";
	}
}
