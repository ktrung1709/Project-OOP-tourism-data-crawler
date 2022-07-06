package historicalFigure;

import java.util.ArrayList;

public class HistoricalFigure {
	private String name;
	private String birthName;
	private ArrayList<HistoricalFigure> parents;
	private ArrayList<HistoricalFigure> children;
	private HistoricalFigure spouse;
	private String birthDate;
	private String deathDate;
	
	public HistoricalFigure(String label) {
		this.name = label;
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Birth name: " + this.birthName);
		System.out.print("Parents: ");
		if(this.parents != null) {
			for(HistoricalFigure parent: this.parents) {
				System.out.print(parent.getName() + ", ");
			}
		}
		System.out.print("\nChildren: ");
		if(this.children != null) {
			for(HistoricalFigure child: this.children) {
				System.out.print(child.getName() + ", ");
			}
		}
		System.out.println("\nSpouse: " + this.spouse.getName());
		System.out.println("Birth date: " + this.birthDate);
		System.out.println("Death date: " + this.deathDate);
	};
	public static HistoricalFigure search(ArrayList<HistoricalFigure> historicalFigures, String label) {
		for(HistoricalFigure historicalFigure: historicalFigures) {
			if(historicalFigure.getName().equals(label)) {
				return historicalFigure;
			}
		}
		return null;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<HistoricalFigure> getParents() {
		return parents;
	}

	public void setParents(ArrayList<HistoricalFigure> parents) {
		this.parents = parents;
	}

	public ArrayList<HistoricalFigure> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<HistoricalFigure> children) {
		this.children = children;
	}

	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getDeathDate() {
		return deathDate;
	}
	public void setDeathDate(String deathDate) {
		this.deathDate = deathDate;
	}
	public String getBirthName() {
		return birthName;
	}
	public void setBirthName(String birthName) {
		this.birthName = birthName;
	}
	public HistoricalFigure getSpouse() {
		return spouse;
	}
	public void setSpouse(HistoricalFigure spouse) {
		this.spouse = spouse;
	}
}
