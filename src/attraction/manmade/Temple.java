package attraction.manmade;

import attraction.Attraction;

public class Temple extends Attraction {
	private String affiliation;
	private int completedYear;

	public Temple(String sourceLink) {
		super(sourceLink);
		// TODO Auto-generated constructor stub
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public int getCompletedYear() {
		return completedYear;
	}

	public void setCompletedYear(int completedYear) {
		this.completedYear = completedYear;
	}

	@Override
	public void printAttraction() {
		// TODO Auto-generated method stub
		super.printAttraction();
		System.out.println("Affiliation: " + this.affiliation + ", completed year: " + this.completedYear);

	}
}
