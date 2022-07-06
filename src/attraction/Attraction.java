package attraction;

import java.util.ArrayList;

public class Attraction {
	private String name;
	private float lat;
	private float longt;
	private ArrayList <String> location;

	public Attraction(String name) {
		super();
		this.name = name;
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
	}


	
}
