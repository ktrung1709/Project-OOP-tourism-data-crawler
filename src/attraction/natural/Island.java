package attraction.natural;

import attraction.Attraction;

public class Island extends Attraction {
	private double totalArea;
	private double totalPopulation;
	private double densityPopulation;

	public Island(String sourceLink) {
		super(sourceLink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printAttraction() {
		// TODO Auto-generated method stub
		super.printAttraction();
		System.out.println("kind of Natural Attraction: Island");
		System.out.println("Total area: " + this.totalArea);
		System.out.println("Total Population: " + this.totalPopulation);
		System.out.println("Density population: " + this.densityPopulation);
	}

	public double getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(double totalArea) {
		this.totalArea = totalArea;
	}

	public double getTotalPopulation() {
		return totalPopulation;
	}

	public void setTotalPopulation(double totalPopulation) {
		this.totalPopulation = totalPopulation;
	}

	public double getDensityPopulation() {
		return densityPopulation;
	}

	public void setDensityPopulation(double densityPopulation) {
		this.densityPopulation = densityPopulation;
	}

}
