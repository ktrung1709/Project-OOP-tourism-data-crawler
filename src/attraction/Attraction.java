package attraction;

import java.util.ArrayList;

import main.Tourism;

public class Attraction extends Tourism{
	private String name;
	private float lat;
	private float longt;
	private ArrayList <String> location;

	public Attraction(String sourceLink) {
		super(sourceLink);
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public float getLongt() {
		return longt;
	}

	public void setLongt(float longt) {
		this.longt = longt;
	}
	
	public ArrayList<String> getLocation() {
		return location;
	}

	public void setLocation(ArrayList<String> location) {
		this.location = location;
	}

	public void printAttraction() {
		System.out.print(
				"Name: " + this.name + ", latitude: " + this.lat + ", longtitude: " + this.longt + ", location:");
		this.location.forEach(l -> System.out.print(" " + l));
		System.out.println();
	}


	
}