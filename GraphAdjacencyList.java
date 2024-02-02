//Implementation of Graph Adjacency List using Depth First Search & Breadth First Search Algorithms
public class GraphNode{
	int val;
	List<GraphNode> neighbors;
	
	public GraphNode(int val){
		this.val = val;
		neighbors = new ArrayList<GraphNode>();
	}
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

public class GraphAdjacencyList{
	
	//First Build the adjacency List from the given data
	public HashMap<String, ArrayList<String>> buildAdjacency(){
		HashMap<String, ArrayList<String>> adjList = new HashMap<>();
		
		String[][] edges = {{"A","B"},{"B","C"},{"B","E"},{"C","E"},{"E","D"}};
		
		adjList.put("A", new ArrayList<String>();
		adjList.put("B", new ArrayList<String>();
		
		for (String[] edge : edges){
			String src = edge[0];
			String des = edge[1];
			if (!adjList.containsKey(src)){
				adjList.put(src, new ArrayList<String>();
			}
			if (!adjList.containsKey(des)){
				adjList.put(des, new ArrayList<String>();
			}
			adjList.get(src).add(des);
		}
		return adjList;		
	}
	
	//Depth First Search using back tracking RecursiveTask
	public int dfs(String node, String target, HashMap<String, ArrayList<String> adjList, HashSet<String> visit){
		if (visit.contains(node)){
			return 0;
		}
		if (node == target){
			return 1;
		}
		
		int count = 0;
		visit = new HashSet<String>();
		visit.add(node);
		
		for (String neighbors : adjList.get(node)){
			count+= dfs(neighbors, target, adjList, visit);
		}
		visit.remove(node);
		return count;
		
	}
	
	//Breadth First Search using Iterative
	public int bfs(String node, String target, HashMap<String, ArrayList<String> adjList){
		int length = 0;
		HashSet<String> visit = new HashSet<String>();
		Queue<String> queue = new LinkedList<String>();
		
		visit.add(node);
		queue.add(node);
		
		while (!queue.isEmpty()){
			int queueSize = queue.size();
			for (int i = 0; i < queueSize; i++){
				String curr = queue.peek();
				queue.poll();
				if (curr ==  target){
					return length;
				}
				for (String neighbors : adjList.get(curr)){
					if (!visit.contains(neighbors)){
						visit.add(neighbors);
						queue.add(neighbors);
					}
				}
			}
			length++;
		}
		return length;
	}


}