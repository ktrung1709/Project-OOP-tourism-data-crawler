package main;
import java.util.ArrayList;
import java.util.Map;

import historicalFigure.KingQuery;
import historicalFigure.PoliticianQuery;
import historicalFigure.HistoricalFigure;
import importData.HelloRDFWorld;

public class TourismOntology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prefix = "PREFIX dbo:  <http://dbpedia.org/ontology/>\r\n"
				+ "PREFIX dbp:  <http://dbpedia.org/property/>\r\n"
				+ "PREFIX dbr:  <http://dbpedia.org/resource/>\r\n"
				+ "PREFIX dbc:  <http://dbpedia.org/resource/Category:>\r\n"
				+ "PREFIX geo:  <http://www.w3.org/2003/01/geo/wgs84_pos#>\r\n"
				+ "PREFIX xsd: 	<http://www.w3.org/2001/XMLSchema#>\r\n"
				+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\r\n"
				+ "PREFIX rdf: 	<http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\n"
				+ "PREFIX yago: <http://dbpedia.org/class/yago/>\r\n"
				+ "\r\n";
		String templeQuery = "CONSTRUCT { ?place rdfs:label ?label.\r\n"
				+ "				\r\n"
				+ "	}\r\n"
				+ "where { \r\n"
				+ "			 ?place dbo:wikiPageWikiLink dbc:Buddhist_temples_in_Vietnam;\r\n"
				+ "			 rdfs:label ?label\r\n"
				+ "	FILTER (lang(?label) = 'en')"
				+ "			   \r\n"
				+ "}";

		String caveQuery = "construct {\r\n"
				+ "?cave rdfs:label ?label;\r\n"
				+ "geo:lat ?lat;\r\n"
				+ "geo:long ?long;\r\n"
				+ "dbp:location ?location;\r\n"
				+ "dbp:depth ?depth;\r\n"
				+ "dbp:length ?length;\r\n"
				+ "dbp:discovery ?discovery.\r\n"
				+ "}\r\n"
				+ "where{\r\n"
				+ "?cave dbo:wikiPageWikiLink dbc:Caves_of_Vietnam;\r\n"
				+ "rdfs:label ?label.\r\n"
				+ "OPTIONAL {?cave\r\n"
				+ "geo:lat ?lat;\r\n"
				+ "geo:long ?long;\r\n"
				+ "dbp:location ?location;\r\n"
				+ "dbp:depth ?depth;\r\n"
				+ "dbp:length ?length;\r\n"
				+ "dbp:discovery ?discovery.\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "FILTER (lang(?label) = 'en')\r\n"
				+ "}";
		
		String templeFilename = "Temple.ttl";
		String kingFilename = "King.ttl";
		String caveFilename = "Cave.ttl";
		String politicianFilename = "Politician.ttl";
		
		HelloRDFWorld a = new HelloRDFWorld();
		KingQuery b = new KingQuery();
		PoliticianQuery c = new PoliticianQuery();
		
		ArrayList<Boolean> userChoice = new ArrayList<Boolean>();
		for (int i = 0; i < 6; i++)
			userChoice.add(true);
		userChoice.add(false);
		userChoice.add(false);
		userChoice.add(true);
		
//		a.importData(prefix + templeQuery, templeFilename);
//		a.printTriple(templeFilename);
		
//		a.importData(b.constructQuery(userChoice), kingFilename);
//		a.printTriple(kingFilename);
		
		System.out.println(c.constructQuery(userChoice));
		a.importData(c.constructQuery(userChoice), politicianFilename);
		a.printTriple(politicianFilename);	
		
	}

}
