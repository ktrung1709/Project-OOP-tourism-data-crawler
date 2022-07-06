package importData;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.rdf.model.Model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.jena.graph.Triple ;
import org.apache.jena.riot.RDFDataMgr ;
import org.apache.jena.riot.lang.PipedRDFIterator;
import org.apache.jena.riot.lang.PipedRDFStream;
import org.apache.jena.riot.lang.PipedTriplesStream;


import java.io.FileOutputStream;


@SuppressWarnings("deprecation")
public class HelloRDFWorld {
	public static void main(String[] args) {
		String prefix = "PREFIX dbo:  <http://dbpedia.org/ontology/>\r\n"
				+ "PREFIX dbp:  <http://dbpedia.org/property/>\r\n"
				+ "PREFIX dbr:  <http://dbpedia.org/resource/>\r\n"
				+ "PREFIX dbc:  <http://dbpedia.org/resource/Category:>\r\n"
				+ "PREFIX geo:  <http://www.w3.org/2003/01/geo/wgs84_pos#>\r\n"
				+ "PREFIX xsd: 	<http://www.w3.org/2001/XMLSchema#>\r\n"
				+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\r\n"
				+ "\r\n";
		String s1 = "CONSTRUCT { ?place dbo:wikiPageWikiLink dbc:Buddhist_temples_in_Vietnam;\r\n"
				+ "				rdfs:label ?label.\r\n"
				+ "				\r\n"
				+ "	}\r\n"
				+ "where { \r\n"
				+ "			 ?place dbo:wikiPageWikiLink dbc:Buddhist_temples_in_Vietnam;\r\n"
				+ "			 rdfs:label ?label\r\n"
				+ "	FILTER (lang(?label) = 'en')"
				+ "			   \r\n"
				+ "}";
		Query query = QueryFactory.create(prefix + s1);
		QueryExecution qexec = QueryExecutionFactory.sparqlService("http://dbpedia.org/sparql",query);
		Model results = qexec.execConstruct();
		final String filename = "Temple.ttl";
		try {
			results.write(new FileOutputStream(filename), "TURTLE");
			System.out.println("success...");    
		}catch (Exception e) {System.out.println(e);} 
		
		

        // Create a PipedRDFStream to accept input and a PipedRDFIterator to
        // consume it
        // You can optionally supply a buffer size here for the
        // PipedRDFIterator, see the documentation for details about recommended
        // buffer sizes
        PipedRDFIterator<Triple> iter = new PipedRDFIterator<>();
        final PipedRDFStream<Triple> inputStream = new PipedTriplesStream(iter);

        // PipedRDFStream and PipedRDFIterator need to be on different threads
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Create a runnable for our parser thread
        Runnable parser = new Runnable() {

            @Override
            public void run() {
                // Call the parsing process.
                RDFDataMgr.parse(inputStream, filename);
            }
        };

        // Start the parser on another thread
        executor.submit(parser);

        // We will consume the input on the main thread here

        // We can now iterate over data as it is parsed, parsing only runs as
        // far ahead of our consumption as the buffer size allows

        while (iter.hasNext()) {
            Triple next = iter.next();
            // Do something with each triple
            System.out.println("Subject:  "+next.getSubject());
            System.out.println("Object:  "+next.getObject().toString());
            System.out.println("Predicate: "+next.getPredicate());
            System.out.println("\n");
            
        }
    }
}

