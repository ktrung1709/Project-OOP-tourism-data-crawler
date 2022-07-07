package main;
import java.util.ArrayList;

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
		String royaltyQuery = "construct {\r\n"
				+ "?royalty rdfs:label ?label;\r\n"
				+ "dbp:spouse ?spouse.\r\n"
				+ "}\r\n"
				+ "where {\r\n"
				+ "{\r\n"
				+ "?royalty dbo:wikiPageWikiLink dbc:17th-century_Vietnamese_monarchs;\r\n"
				+ "rdfs:label ?label.\r\n"
				+ "OPTIONAL {?royalty dbp:spouse ?spouse}\r\n"
				+ "FILTER (lang(?label) = 'en')\r\n"
				+ "FILTER (lang(?spouse) = 'en')\r\n"
				+ "}\r\n"
				+ "union{\r\n"
				+ "?royalty dbo:wikiPageWikiLink dbc:18th-century_Vietnamese_monarchs;\r\n"
				+ "rdfs:label ?label.\r\n"
				+ "OPTIONAL {?royalty dbp:spouse ?spouse}\r\n"
				+ "FILTER (lang(?label) = 'en')\r\n"
				+ "FILTER (lang(?spouse) = 'en')\r\n"
				+ "}\r\n"
				+ "union{\r\n"
				+ "?royalty dbo:wikiPageWikiLink dbc:16th-century_Vietnamese_monarchs;\r\n"
				+ "rdfs:label ?label.\r\n"
				+ "OPTIONAL {?royalty dbp:spouse ?spouse}\r\n"
				+ "FILTER (lang(?label) = 'en')\r\n"
				+ "FILTER (lang(?spouse) = 'en')\r\n"
				+ "}\r\n"
				+ "union{\r\n"
				+ "?royalty dbo:wikiPageWikiLink dbc:15th-century_Vietnamese_monarchs;\r\n"
				+ "rdfs:label ?label.\r\n"
				+ "OPTIONAL {?royalty dbp:spouse ?spouse}\r\n"
				+ "FILTER (lang(?label) = 'en')\r\n"
				+ "FILTER (lang(?spouse) = 'en')\r\n"
				+ "}\r\n"
				+ "union{\r\n"
				+ "?royalty dbo:wikiPageWikiLink dbc:14th-century_Vietnamese_monarchs;\r\n"
				+ "rdfs:label ?label.\r\n"
				+ "OPTIONAL {?royalty dbp:spouse ?spouse}\r\n"
				+ "FILTER (lang(?label) = 'en')\r\n"
				+ "FILTER (lang(?spouse) = 'en')\r\n"
				+ "}\r\n"
				+ "}";
		
		String templeFilename = "Temple.ttl";
		String royaltyFilename = "Royalty.ttl";
		
		HelloRDFWorld a = new HelloRDFWorld();
		
		a.importData(prefix + templeQuery, templeFilename);
		a.printTriple(templeFilename);
		
//		a.importData(prefix + royaltyQuery, royaltyFilename);
//		a.printTriple(royaltyFilename);
		
		
	}

}
