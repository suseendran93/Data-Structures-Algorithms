package datastructures;

import java.util.HashSet;
import java.util.Set;

public class GraphV2 {
	Node vertex;
	private int vertices;

	static class Node {
		Node edge;
		Set<Character> adjacents;
		char value;

		public Node(char v) {

			value = v;
			edge = null;
			adjacents = new HashSet<>();
		}
	}

	public GraphV2() {

		vertex = null;
		vertices = 0;
	}

	public void addVertex(char v) {
		vertex = new Node(v);
		vertices++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
