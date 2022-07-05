package attraction;

public abstract class Attraction {
	private String name;
	private float lat;
	private float longt;
	private String location;

	public Attraction(String name, float lat, float longt, String location) {
		super();
		this.name = name;
		this.lat = lat;
		this.longt = longt;
		this.location = location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public abstract void printAttraction();
}