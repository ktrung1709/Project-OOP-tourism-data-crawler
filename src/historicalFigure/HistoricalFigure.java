package historicalFigure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.jena.graph.Triple;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.lang.PipedRDFIterator;
import org.apache.jena.riot.lang.PipedRDFStream;
import org.apache.jena.riot.lang.PipedTriplesStream;

import importData.HelloRDFWorld;
import loadable.Loadable;
import main.Tourism;

@SuppressWarnings("deprecation")
public class HistoricalFigure extends Tourism implements Loadable{
	private String name;
	private ArrayList<String> parents = new ArrayList<String>();
	private ArrayList<String> children = new ArrayList<String>();
	private ArrayList<String> spouses = new ArrayList<String>();
	private String birthDate;
	private String deathDate;
	
	public HistoricalFigure(String sourceLink) {
		super(sourceLink);
		// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Parents: " + parents.toString());
		System.out.println("Children: " + children.toString());
		System.out.println("Spouses: " + spouses.toString());
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
	public ArrayList<String> getParents() {
		return parents;
	}
	public void setParents(ArrayList<String> parents) {
		this.parents = parents;
	}
	public ArrayList<String> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<String> children) {
		this.children = children;
	}
	public ArrayList<String> getSpouses() {
		return spouses;
	}
	public void setSpouses(ArrayList<String> spouses) {
		this.spouses = spouses;
	}
	
	@Override
	public void load(String filename) {
		PipedRDFIterator<Triple> iter = HelloRDFWorld.generateTriple(filename);
        
        while (iter.hasNext()) {
        	Triple next = iter.next();
        	if(!next.getSubject().toString().equals(this.getSourceLink())) {
        		continue;
        	}
        	
        	String predicate = next.getPredicate().toString();
 
        	if(predicate.equals("http://www.w3.org/2000/01/rdf-schema#label")) {
    			String name = next.getObject().toString().split("\"")[1];
    			this.setName(name);
    		}
    		if(predicate.equals("http://dbpedia.org/ontology/child")) {
    			String child;
    			if(next.getObject().toString().toCharArray()[0] == '\"') {
    				child = next.getObject().toString().split("\"")[1];
    			}
    			else {
        			String[] tmp = next.getObject().toString().split("/");
        			child = tmp[tmp.length - 1];
    			}
    			this.getChildren().add(child);
    		}
    		if(predicate.equals("http://dbpedia.org/property/birthDate")) {
    			String birthDate = next.getObject().toString().split("\"")[1];
    			this.setBirthDate(birthDate);
    		}
    		if(predicate.equals("http://dbpedia.org/property/deathDate")) {
    			String deathDate = next.getObject().toString().split("\"")[1];
    			this.setDeathDate(deathDate);
    		}
    		if(predicate.equals("http://dbpedia.org/property/father") 
    				|| predicate.equals("http://dbpedia.org/property/mother")) {
    			String parent;
				if(next.getObject().toString().toCharArray()[0] == '\"') {
					parent = next.getObject().toString().split("\"")[1];
				}
				else {
					String[] tmp = next.getObject().toString().split("/");
					parent = tmp[tmp.length - 1];
				}
				this.getParents().add(parent);
    		}
    		if(predicate.equals("http://dbpedia.org/property/spouse")) {
    			String spouse;
				if(next.getObject().toString().toCharArray()[0] == '\"') {
					spouse = next.getObject().toString().split("\"")[1];
				}
				else {
					String[] tmp = next.getObject().toString().split("/");
					spouse = tmp[tmp.length - 1];
				}
				this.getSpouses().add(spouse);
    		}		
        }
	}
}
