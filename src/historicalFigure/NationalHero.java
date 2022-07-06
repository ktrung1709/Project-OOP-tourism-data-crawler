package historicalFigure;

public class NationalHero extends HistoricalFigure {
	private String hometown;
	private String dynasty;

	public NationalHero(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Kind of historical figure: National Hero");
		System.out.println("Hometown: " + this.hometown);
		System.out.println("Dynasty: " + this.dynasty);
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getDynasty() {
		return dynasty;
	}

	public void setDynasty(String dynasty) {
		this.dynasty = dynasty;
	}
	
}
