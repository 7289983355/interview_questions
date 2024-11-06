package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFS {

	static class AllPathsInGraph {

		public 	List<List<String>> findAllPaths(Map<String, List<String>> graph, String source, String destination) {
			
			List<List<String>> allPaths = new ArrayList<>();
	        List<String> currentPath = new ArrayList<>();
	        dfs(graph, source, destination, currentPath, allPaths);
	        return allPaths;
			
		}

		private void dfs(Map<String, List<String>> graph, String source, String destination, List<String> currentPath,
				List<List<String>> allPaths) {
			
			
		}

	}

	public static void main(String[] args) {

		// create a graph using an adjacency List
		Map<String, List<String>> graph = new HashMap<>();

		graph.put("A", List.of("B", "C"));
		graph.put("B", List.of("D"));
		graph.put("C", List.of("D"));
		graph.put("D", List.of("E"));
		graph.put("E", new ArrayList<>()); // E: Has no outgoing connections (indicated by the empty list)

		AllPathsInGraph finder = new AllPathsInGraph();

		finder.findAllPaths(graph, "A", "E");

	}

//	     A
//	   /   \
//	  B     C
//	  |     |
//	  D ----|
//	   |
//	   E

}
