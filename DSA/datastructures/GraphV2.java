package datastructures;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GraphV2 {

	Node vertex;
	private int vertices;
	private int edges;
	private Map<Object, Set<Object>> map;

	static class Node {

		Object value;
		Set<Object> set;

		public Node(Object v) {

			value = v;
			set = new HashSet<>();

		}
	}

	public GraphV2() {

		vertex = null;
		vertices = 0;
		map=new LinkedHashMap<>();

	}

	public Node addVertex(Object v) {

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
		
		
		Set<Entry<Object, Set<Object>>> entrySet = map.entrySet();
		
		for (Entry<Object, Set<Object>> entry : entrySet) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphV2 gr = new GraphV2();
		Node A = gr.addVertex('A');
		Node B = gr.addVertex('B');
		Node C = gr.addVertex('C');
		Node D = gr.addVertex('D');
		Node E = gr.addVertex('E');

		System.out.println(gr.noOfVertices());

		gr.addAdjacents(A, A);
		gr.addAdjacents(A, B);
		gr.addAdjacents(B, C);
		gr.addAdjacents(C, D);
		gr.addAdjacents(D, B);
		gr.addAdjacents(D, C);
		gr.addAdjacents(E, D);
		
		System.out.println(gr.noOfEdges());
		gr.printGraph();
		
		
	}
}
