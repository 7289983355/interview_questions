package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    static class Edge {

        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }

        public int getSrc() {
            return src;
        }

        public int getDest() {
            return dest;
        }
    }

    public static void main(String[] args) {
        // Create an array of ArrayLists for 7 nodes
        ArrayList<Edge>[] arrayListOfEdges = new ArrayList[7];

        // Initialize each ArrayList in the array
        for (int i = 0; i < arrayListOfEdges.length; i++) {
            arrayListOfEdges[i] = new ArrayList<>();
        }

        // Add edges to the graph
        arrayListOfEdges[0].add(new Edge(0, 1));
        arrayListOfEdges[0].add(new Edge(0, 2));

        arrayListOfEdges[1].add(new Edge(1, 0));
        arrayListOfEdges[1].add(new Edge(1, 3));

        arrayListOfEdges[2].add(new Edge(2, 0));
        arrayListOfEdges[2].add(new Edge(2, 4));

        arrayListOfEdges[3].add(new Edge(3, 1));
        arrayListOfEdges[3].add(new Edge(3, 4));
        arrayListOfEdges[3].add(new Edge(3, 5));

        arrayListOfEdges[4].add(new Edge(4, 2));
        arrayListOfEdges[4].add(new Edge(4, 3));
        arrayListOfEdges[4].add(new Edge(4, 5));

        arrayListOfEdges[5].add(new Edge(5, 3));
        arrayListOfEdges[5].add(new Edge(5, 4));
        arrayListOfEdges[5].add(new Edge(5, 6));

        arrayListOfEdges[6].add(new Edge(6, 5));

        bfsSearch(arrayListOfEdges, 7);
    }

    private static void bfsSearch(ArrayList<Edge>[] arrayListOfEdges, int V) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];

        // Start BFS from node 0 (you can start from any node)
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            // Traverse all edges of the current node
            for (Edge edge : arrayListOfEdges[current]) {
                int neighbor = edge.getDest();
                
                // Only add unvisited neighbors to the queue
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
