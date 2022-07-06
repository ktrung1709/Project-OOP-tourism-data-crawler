package test;

import java.util.ArrayList;

import historicalFigure.HistoricalFigure;
import historicalFigure.NationalHero;

public class TestHistoricalFigure {
	public static void main(String[] args) {
		NationalHero nationalHero = new NationalHero("Ho Chi Minh");
		nationalHero.setBirthName("Nguyen Sinh Cung");
		ArrayList<HistoricalFigure> parents = new ArrayList<HistoricalFigure>();
		parents.add(new HistoricalFigure("Nguyen Sinh Sac"));
		parents.add(new HistoricalFigure("Hoang Thi Loan"));
		nationalHero.setParents(parents);
		nationalHero.setChildren(null);
		nationalHero.setSpouse(new HistoricalFigure("Tang Tuyet Minh"));
		nationalHero.setBirthDate("19/05/1890");
		nationalHero.setDeathDate("02/09/1969");
		nationalHero.setHometown("Nghe An");
		nationalHero.setDynasty("Viet Nam Dan Chu Cong Hoa");
		
		ArrayList<HistoricalFigure> historicalFigures = new ArrayList<HistoricalFigure>();
		historicalFigures.add(nationalHero);
		historicalFigures.add(new HistoricalFigure("Someone"));
		
		NationalHero found = (NationalHero) HistoricalFigure.search(historicalFigures, "Ho Chi Minh");
		if(found != null) found.print();
		
		historicalFigures.remove(0);
		found = (NationalHero) HistoricalFigure.search(historicalFigures, "Ho Chi Minh");
		if(found == null) System.out.println("\nCan not find this historical figure.");
	}
}
