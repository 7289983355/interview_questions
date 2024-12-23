package graph;

import java.util.ArrayList;

import graph.Classroom.Edge;

public class UndirectedWightedGraph {

	static class Edges {

		public int getSrc() {
			return src;
		}

		public void setSrc(int src) {
			this.src = src;
		}

		public int getDest() {
			return dest;
		}

		public void setDest(int dest) {
			this.dest = dest;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public Edges(int src, int dest, int weight) {
			super();
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}

		int src;
		int dest;
		int weight;
	}

	public static void main(String[] args) {

		ArrayList<Edges>[] graph = createGraph();

		// Print all edges for vertex 2
		printEdges(graph, 2);
	}

	private static void printEdges(ArrayList<Edges>[] graph, int vertex) {

		ArrayList<Edges> lst = graph[2];

		for (Edges edge : lst) {
			System.out.println("Edge from " + edge.getSrc() + " to " + edge.getDest() + " weight :" + edge.getWeight());
		}
	}

	private static ArrayList<Edges>[] createGraph() {

		ArrayList<Edges>[] graph = new ArrayList[4];

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}

		// Add edges for each vertex
		graph[0].add(new Edges(0, 2, 4));
		graph[1].add(new Edges(1, 2, 5));
		graph[1].add(new Edges(1, 3, 5));
		graph[2].add(new Edges(2, 0, 6));
		graph[2].add(new Edges(2, 1, 9));
		graph[2].add(new Edges(2, 3, 2));
		graph[3].add(new Edges(3, 1, 3));
		graph[3].add(new Edges(3, 2, 5));

		return graph;

	}

}
