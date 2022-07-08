package main;

import java.util.ArrayList;

public class TourismQuery {
	private String sourceLink = "?tourism";

	public String getSourceLink() {
		return sourceLink;
	}

	public void setSourceLink(String sourceLink) {
		this.sourceLink = sourceLink;
	}
	
	public String constructClause(ArrayList userChoice) {
		String construct = "";
		return construct;
	}
	
	public String whereClause(ArrayList userChoice) {
		String where = "";
		return where;
	}
	
	public String optionalClause(ArrayList userChoice) {
		String optional = "";
		return optional;
	}
}