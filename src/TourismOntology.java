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
		String templeQuery = "CONSTRUCT { ?place dbo:wikiPageWikiLink dbc:Buddhist_temples_in_Vietnam;\r\n"
				+ "				rdfs:label ?label.\r\n"
				+ "				\r\n"
				+ "	}\r\n"
				+ "where { \r\n"
				+ "			 ?place dbo:wikiPageWikiLink dbc:Buddhist_temples_in_Vietnam;\r\n"
				+ "			 rdfs:label ?label\r\n"
				+ "	FILTER (lang(?label) = 'en')"
				+ "			   \r\n"
				+ "}";
		String royaltyQuery = "";
		
		String filename = "Temple.ttl";
		
		HelloRDFWorld a = new HelloRDFWorld();
		
		a.importData(prefix + templeQuery, filename);
		a.printTriple(filename);
	}

}
