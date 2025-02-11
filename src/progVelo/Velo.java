package progVelo;

import java.util.Random;

public class Velo {
	private double 	DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
	public Velo() {
		
	}
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	
	public Velo(double braquet) {
		this.braquet = braquet;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public double getBraquet() {
		return braquet;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	public void setDEFAUT_BRAQUET(double DEFAUT_BRAQUET) {
		this.DEFAUT_BRAQUET = DEFAUT_BRAQUET; 
	}

	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	
}
