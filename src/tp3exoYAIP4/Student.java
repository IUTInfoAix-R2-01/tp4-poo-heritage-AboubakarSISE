package tp3exoYAIP4;

public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name,address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public Student() {
		super();
	}
	
	public String getProgram() {
		return program;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getFee() {
		return fee;
	}
	
	public void setAddress(String program) {
		this.program = program;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}

	public String toString() {
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + ", name = " + getName() + ", address = " + getAddress() + "]";
	}
	
	public static void main(String[] args) {
        Student a3 = new Student("Kim", "Block.D Section.4", "Générale", 2024, 50);
        Student a4 = new Student("Monroe", "Block.E Section.7", "STI2D", 2024, 150);
        
        System.out.println(a3);
        System.out.println(a4);
    }

}
