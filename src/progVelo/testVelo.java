package progVelo;

public class testVelo {
	public static void main(String[] args) {
		Velo vl1 = new Velo(10.0, 15.0);
		Velo vl2 = new Velo(15.0);
		Velo vl3 = new Velo();
		Velo vl4 = new Velo(13.0, 8.0);
		
		System.out.println("Puissance du 1er Velo" + vl1.getPuissance(90));
		System.out.println("Puissance du 2e Velo" + vl2.getPuissance(90));
		System.out.println("Puissance du 3e Velo" + vl3.getPuissance(90));
		System.out.println("Puissance du 4e Velo" + vl4.getPuissance(90));
		
		VeloElec vle1 = new VeloElec(13, 7, 20);
		System.out.println("Puissance du Velo Electrique" + vle1.getPuissance(90));
		
		System.out.println(vl1);
		System.out.println(vle1);
		
		
		
		
	}
}
