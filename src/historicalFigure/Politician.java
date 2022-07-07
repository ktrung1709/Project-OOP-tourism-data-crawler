package historicalFigure;

public class Politician extends HistoricalFigure {
	private String position;
	private String politicalParty;
	
	
	public Politician(String sourceLink) {
		super(sourceLink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Kind of historical figure: Politcian");
		System.out.println("Political party: " + this.politicalParty);
		System.out.println("Position in political party: " + this.position);
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPoliticalParty() {
		return politicalParty;
	}

	public void setPoliticalParty(String politicalParty) {
		this.politicalParty = politicalParty;
	}

}
