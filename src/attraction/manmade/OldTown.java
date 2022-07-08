package attraction.manmade;

import attraction.Attraction;

public class OldTown extends Attraction {
	private float area;
	private int inscriptionYear;
	private String climate;
	private long population, density;

	public OldTown(String sourceLink) {
		super(sourceLink);
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

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public long getDensity() {
		return density;
	}

	public void setDensity(long density) {
		this.density = density;
	}

	@Override
	public void printAttraction() {
		// TODO Auto-generated method stub
		super.printAttraction();
		System.out.println("Area: " + this.area + ", inscription year: " + this.inscriptionYear + ", climate: "
				+ this.climate + ", population: " + this.population + ", density: " + this.density);
	}
}
