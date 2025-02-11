package tp3exoYAIP4;

public class Animal {
	private String name;
	
	public Animal (String name) {
		this.name = name;
	}
	
	public Animal () {
	}

	@Override
	public String toString() {
		return "Animal [name = " + name + " ]";
	}
}
