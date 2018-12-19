package datastructures;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GraphV2 {

	Node vertex;
	private int vertices;
	private int edges;
	private Map<String, Set<String>> map;

	static class Node {

		String value;
		Set<String> set;

		public Node(String v) {

			value = v;
			set = new HashSet<>();

		}
	}

	public GraphV2() {

		vertex = null;
		vertices = 0;
		map=new LinkedHashMap<>();

	}

	public Node addVertex(String v) {

		vertex = new Node(v);
		
		System.out.println("Vertex created: " + vertex.value);

		vertices++;
		map.put(vertex.value, vertex.set);
		return vertex;
	}

	public void addAdjacents(Node src, Node dest) {

		
		if (map.containsKey(src.value)) {
			if (!map.get(src.value).contains(dest.value)) {
				map.get(src.value).add(dest.value);
				edges++;
				System.out.println("Edge created from "+src.value+" to "+dest.value);
			}
		}
			
	}

	

	public String noOfVertices() {
		return ("No of vertices: " + vertices);

	}
	public String noOfEdges() {
		return ("No of edges: "+ edges);
	}
	
	public void printGraph(){
		
		
		Set<Entry<String, Set<String>>> entrySet = map.entrySet();
		
		for (Entry<String, Set<String>> entry : entrySet) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}

	public void removeAdjacent(Node src, Node dest){
		if(map.containsKey(src.value)) {
			if(map.get(src.value).contains(dest.value)) {
				map.get(src.value).remove(dest.value);
				edges--;
				System.out.println("Edge removed from "+src.value+" to "+dest.value);
			}
		}
	}
	public void removeVertex(Node src){
		
		if(src.set.isEmpty()) {
			
			if(!map.values().contains(src.value)) {
			src=null;
			System.out.println("Vertex removed from Graph");
			}
			else {
				System.out.println("Unable to remove vertex! Please remove all the edges");
		}
			
		}
		else
			System.out.println("Unable to remove vertex!  Please remove edges from "+src.value);
		
	}
public void removeVertex2(Node src){
		
		if(src.set.isEmpty()) {
			
		
			
			
		}
				
			
		
		else
			System.out.println("Unable to remove vertex!  Please remove edges from "+src.value);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphV2 gr = new GraphV2();
		Node A = gr.addVertex("A");
		Node B = gr.addVertex("B");
		Node C = gr.addVertex("C");
		Node D = gr.addVertex("D");
		Node E = gr.addVertex("E");

		System.out.println(gr.noOfVertices());

		gr.addAdjacents(A, A);
		gr.addAdjacents(A, B);
		gr.addAdjacents(B, C);
		gr.addAdjacents(C, D);
		gr.addAdjacents(D, B);
		gr.addAdjacents(D, C);
		gr.addAdjacents(E, A);
		
		System.out.println(gr.noOfEdges());
		gr.printGraph();
		gr.removeAdjacent(A, A);
		System.out.println(gr.noOfEdges());
		gr.printGraph();
		gr.removeAdjacent(A, B);
		//gr.removeAdjacent(E, A);
		
		gr.removeVertex(A);
		gr.printGraph();
		
		
	}
}
