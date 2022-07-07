package attraction.manmade;

import attraction.Attraction;

public class Imperial extends Attraction {
	private float area;
	private int inscriptionYear;

	public Imperial(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public int getInscriptionYear() {
		return inscriptionYear;
	}

	public void setInscriptionYear(int inscriptionYear) {
		this.inscriptionYear = inscriptionYear;
	}

	@Override
	public void printAttraction() {
		// TODO Auto-generated method stub
		super.printAttraction();
		System.out.println("Area: " + this.area + ", inscription year: " + this.inscriptionYear);
	}

}
