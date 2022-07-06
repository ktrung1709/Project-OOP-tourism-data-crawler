package historicalFigure;

public class Royalty extends HistoricalFigure {
	private String dynasty;
	private String regnalName;
	private String royalStatus;

	public Royalty(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("kind of historrical figure: Royalty");
		System.out.println("Dynasty: " + this.dynasty);
		System.out.println("Regnal name: " + this.regnalName);
		System.out.println("RRoyal status: " + this.royalStatus);
	}
	
	public String getRoyalStatus() {
		return royalStatus;
	}

	public void setRoyalStatus(String royalStatus) {
		this.royalStatus = royalStatus;
	}

	public String getDynasty() {
		return dynasty;
	}

	public void setDynasty(String dynasty) {
		this.dynasty = dynasty;
	}

	public String getRegnalName() {
		return regnalName;
	}

	public void setRegnalName(String regnalName) {
		this.regnalName = regnalName;
	}

}
