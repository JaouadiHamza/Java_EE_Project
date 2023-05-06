package tn.ensit.beans;

public class Suits {
	float chest , stomach ,waist , hip ,shoulder , sleek_length , length ; 
	
	int budget , closure ,vent   ;
	
	String lapel , chest_pocket ;
	
	final int init_Price = 550 ;

	public Suits(float chest, float stomach, float waist, float hip, float shoulder, float sleek_length, float length,
			int budget, int closure, int vent, String lapel, String chest_pocket) {
		super();
		this.chest = chest;
		this.stomach = stomach;
		this.waist = waist;
		this.hip = hip;
		this.shoulder = shoulder;
		this.sleek_length = sleek_length;
		this.length = length;
		this.budget = budget;
		this.closure = closure;
		this.vent = vent;
		this.lapel = lapel;
		this.chest_pocket = chest_pocket;
	}
	
	

	
	public Suits(float shoulder, float length, int budget) {
		super();
		this.shoulder = shoulder;
		this.length = length;
		this.budget = budget;
	}




	public float  price  (int budget) {
		float price  ;
		if (shoulder > 60 && length > 70 ) {
			price =  init_Price + 900 ;
		}
		else {
			price = init_Price+500 ; 
		}
		return price*(1-(budget/6000)) ;
		
	}
	public float getChest() {
		return chest;
	}

	public void setChest(float chest) {
		this.chest = chest;
	}

	public float getStomach() {
		return stomach;
	}

	public void setStomach(float stomach) {
		this.stomach = stomach;
	}

	public float getWaist() {
		return waist;
	}

	public void setWaist(float waist) {
		this.waist = waist;
	}

	public float getHip() {
		return hip;
	}

	public void setHip(float hip) {
		this.hip = hip;
	}

	public float getShoulder() {
		return shoulder;
	}

	public void setShoulder(float shoulder) {
		this.shoulder = shoulder;
	}

	public float getSleek_length() {
		return sleek_length;
	}

	public void setSleek_length(float sleek_length) {
		this.sleek_length = sleek_length;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getClosure() {
		return closure;
	}

	public void setClosure(int closure) {
		this.closure = closure;
	}

	public int getVent() {
		return vent;
	}

	public void setVent(int vent) {
		this.vent = vent;
	}

	public String getLapel() {
		return lapel;
	}

	public void setLapel(String lapel) {
		this.lapel = lapel;
	}

	public String getChest_pocket() {
		return chest_pocket;
	}

	public void setChest_pocket(String chest_pocket) {
		this.chest_pocket = chest_pocket;
	}

	@Override
	public String toString() {
		return "Suits [chest=" + chest + ", stomach=" + stomach + ", waist=" + waist + ", hip=" + hip + ", shoulder="
				+ shoulder + ", sleek_length=" + sleek_length + ", length=" + length + ", budget=" + budget
				+ ", closure=" + closure + ", vent=" + vent + ", lapel=" + lapel + ", chest_pocket=" + chest_pocket
				+ "]";
	}
	
	
}
