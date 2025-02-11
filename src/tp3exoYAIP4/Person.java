package tp3exoYAIP4;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public Person() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Person [name = " + name + ", address = " + address + "]";
	}
	
	public static void main(String[] args) {
        Person a1 = new Person("Hayes", "Block.G Section.13");
        Person a2 = new Person("Sato", "Block.B Section.6");
        
        System.out.println(a1);
        System.out.println(a2);
    }
}
