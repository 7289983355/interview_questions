package graph;

import java.util.ArrayList;

public class Classroom {

    static class Edge {
        private int src;
        private int dest;

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

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges for each vertex
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    private static void printEdges(ArrayList<Edge>[] graph, int vertex) {
        ArrayList<Edge> adjList = graph[vertex];

        for (Edge edge : adjList) {
            System.out.println("Edge from " + edge.getSrc() + " to " + edge.getDest());
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        // Print all edges for vertex 2
        printEdges(graph, 2);
    }
}
