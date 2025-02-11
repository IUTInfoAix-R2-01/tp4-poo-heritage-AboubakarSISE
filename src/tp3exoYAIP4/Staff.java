package tp3exoYAIP4;

public class Staff extends Person{
	private String school;
	private double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name,address);
		this.school = school;
		this.pay = pay;
	}
	
	public Staff() {
		super();
	}
	
	public String getSchool() {
		return school;
	}
	
	public double getPay() {
		return pay;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public void setPay(double pay) {
		this.pay = pay;
	}

	public String toString() {
		return "Staff [school=" + school + ", pay=" + pay + ", name = " + getName() + ", address = " + getAddress() + "]";
	}
	
	public static void main(String[] args) {
	    Staff a5 = new Staff("Nivarna", "Block.F Section.9", "Central High Shool", 4500);
	    
	    System.out.println(a5);
	    }
	
}
