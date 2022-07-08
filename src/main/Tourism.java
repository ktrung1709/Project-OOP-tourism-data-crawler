package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.jena.graph.Triple;
import org.apache.jena.riot.lang.PipedRDFIterator;

import historicalFigure.HistoricalFigure;
import importData.HelloRDFWorld;

@SuppressWarnings("deprecation")
public class Tourism {
	private String sourceLink;

	public Tourism(String sourceLink) {
		super();
		this.sourceLink = sourceLink;
	}

	public String getSourceLink() {
		return sourceLink;
	}

	public void setSourceLink(String sourceLink) {
		this.sourceLink = sourceLink;
	}
	
	public static Map<String, Tourism> generateDatabse(String filename){
		PipedRDFIterator<Triple> iter = HelloRDFWorld.generateTriple(filename);
		
		Map<String, Tourism> databaseMap = new HashMap<String, Tourism>();
		
		while (iter.hasNext()) {
        	Triple next = iter.next();
        	
        	if(!databaseMap.containsKey(next.getSubject().toString())) {
        		databaseMap.put(next.getSubject().toString(), new HistoricalFigure(next.getSubject().toString()));
        	}
		}
		
		return databaseMap;
	}
}
