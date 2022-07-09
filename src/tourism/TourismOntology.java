package tourism;
import java.util.ArrayList;

import attraction.*;
import event.*;
import historicalFigure.*;

import importData.HelloRDFWorld;

public class TourismOntology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kingFilename = "King.ttl";
		String politicianFilename = "Politician.ttl";
		String warHeroFilename = "WarHero.ttl";
		String festivalFilename = "Festival.ttl";
		String battleFilename = "Battle.ttl";
		String caveFilename = "Cave.ttl";
		String islandFilename = "Island.ttl";
		String nationalParkFilename = "NationalPark.ttl";
		String templeFilename = "Temple.ttl";
		
		HelloRDFWorld a = new HelloRDFWorld();
		KingQuery b = new KingQuery();
		PoliticianQuery c = new PoliticianQuery();
		WarHeroQuery d = new WarHeroQuery();
		FestivalQuery e = new FestivalQuery();
		BattleQuery f = new BattleQuery();
		CaveQuery g = new CaveQuery();
		IslandQuery h = new IslandQuery();
		NationalParkQuery j = new NationalParkQuery();
		TempleQuery k = new TempleQuery();
		
		ArrayList<Boolean> userChoice = new ArrayList<Boolean>();
		for (int i = 0; i < 4; i++)
			userChoice.add(true);
		userChoice.add(true);
		userChoice.add(true);
		userChoice.add(true);
		userChoice.add(false);
		userChoice.add(false);
		
		System.out.println(b.constructQuery(userChoice)); 
		a.importData(b.constructQuery(userChoice), kingFilename); 
		a.printTriple(kingFilename); 
		
		System.out.println(c.constructQuery(userChoice)); ////
		a.importData(c.constructQuery(userChoice), politicianFilename); 
		a.printTriple(politicianFilename); 
		
		System.out.println(d.constructQuery(userChoice)); 
		a.importData(d.constructQuery(userChoice), warHeroFilename); 
		a.printTriple(warHeroFilename); 
		
		System.out.println(e.constructQuery(userChoice)); 
		a.importData(e.constructQuery(userChoice), festivalFilename);
		a.printTriple(festivalFilename); 
		
		System.out.println(f.constructQuery(userChoice)); 
		a.importData(f.constructQuery(userChoice), battleFilename); 
		a.printTriple(battleFilename);
	
		System.out.println(g.constructQuery(userChoice));
		a.importData(g.constructQuery(userChoice), caveFilename);
		a.printTriple(caveFilename);
		
		System.out.println(h.constructQuery(userChoice));
		a.importData(h.constructQuery(userChoice), islandFilename);
		a.printTriple(islandFilename);
		
		System.out.println(j.constructQuery(userChoice));
		a.importData(j.constructQuery(userChoice), nationalParkFilename);
		a.printTriple(nationalParkFilename);
		
		System.out.println(k.constructQuery(userChoice));
		a.importData(k.constructQuery(userChoice), templeFilename);
		a.printTriple(templeFilename);
		
	}

}
