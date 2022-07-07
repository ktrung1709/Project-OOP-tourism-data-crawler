package attraction.natural;

import attraction.Attraction;

public class NationalPark extends Attraction {
	private String cityNearest;
	private double area;
	private int established;

	public NationalPark(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printAttraction() {
		// TODO Auto-generated method stub
		super.printAttraction();
		System.out.println("kind of Natural Attraction: National park");
		System.out.println("Nearest city: " + this.cityNearest);
		System.out.println("Area: " + this.area);
		System.out.println("Established: " + this.established);
	}

	public String getCityNearest() {
		return cityNearest;
	}

	public void setCityNearest(String cityNearest) {
		this.cityNearest = cityNearest;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getEstablished() {
		return established;
	}

	public void setEstablished(int established) {
		this.established = established;
	}

}
