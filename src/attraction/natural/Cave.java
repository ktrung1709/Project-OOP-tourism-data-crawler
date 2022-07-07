package attraction.natural;

import attraction.Attraction;

public class Cave extends Attraction {
	private double depth;
	private double length;
	private String discovery;
	
	public Cave(String sourceLink) {
		super(sourceLink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printAttraction() {
		// TODO Auto-generated method stub
		super.printAttraction();
		System.out.println("kind of Natural Attraction: Cave");
		System.out.println("Depth: " + this.depth);
		System.out.println("Length: " + this.length);
		System.out.println("Discovery: " + this.discovery);
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getDiscovery() {
		return discovery;
	}

	public void setDiscovery(String discovery) {
		this.discovery = discovery;
	}

}
