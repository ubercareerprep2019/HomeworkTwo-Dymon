import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
public class GraphWithAdjacencyList {

	static HashMap<Integer, GraphNode> adjNode = new HashMap();
	static ArrayList nodeList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		addNode(0);
		addNode(1);
		addNode(2);
		addNode(3);
		
		addEdge(0,2);
		addEdge(2,3);
		addEdge(2,1);
		addEdge(2,0);
		addEdge(0,1);
		addEdge(3,3);
		
		
	
		BFS(2);
		DFS(2);
		
		//minNumberOfEdges(1,5);
	}

	
	public static void addNode(int key)
	{
		if(adjNode.containsKey(key))
		{
			
		}else {
		
		GraphNode newNode = new GraphNode(key);
		adjNode.put(key, newNode);	
		}
		
		System.out.println(adjNode.entrySet());
		
	}
	
	
	public static void addEdge(int node1, int node2)
	{
		if(adjNode.isEmpty())
		{
			System.out.println("The map has zero nodes.");
		}else {
			
			GraphNode nodeOne = adjNode.get(node1);
			GraphNode nodeTwo = adjNode.get(node2);

			nodeOne.list.add(nodeTwo);
			nodeTwo.list.add(nodeOne);
			for(int i=0; i<nodeOne.list.size(); i++)
			{
				//System.out.println(nodeOne.list.get(i).data);
			}
		}
		
	}
	
	
	public static void removeNode(int node)
	{
		if(adjNode.isEmpty())
		{
			
		}else {
			if( adjNode.containsKey(node)) {
				System.out.println(" found");
				adjNode.remove(node);
			}else {
				System.out.println("Not found");
			}
			
		}
	}
	
	public static void removeEdge(int node1, int node2)
	{
		GraphNode nodeOne = adjNode.get(node1);
		GraphNode nodeTwo = adjNode.get(node2);
		
			if(nodeOne.list.contains(nodeTwo) && nodeTwo.list.contains(nodeOne))
			{
				System.out.println("removed edge");
				nodeOne.list.remove(nodeTwo);
				nodeTwo.list.remove(nodeOne);
			}else {
				
				System.out.println("No edge");	
			}
	 }
	
	
	public static ArrayList<GraphNode> getAdjNodes(int node)
	{
		
			GraphNode nodeOne = adjNode.get(node);
			return nodeOne.list;
	}
		
	
	public static void BFS(int key)
	{
		Queue<GraphNode> q = new LinkedList<GraphNode>();
		HashSet<Integer> visited = new HashSet<>();
		
		GraphNode start = adjNode.get(key);
		
		if(visited.contains(start.data))
		{
			
		}else {
			
			q.add(start);
			visited.add(start.data);
			
			while(!q.isEmpty())
			{
				int size = q.size();
				for(int i = 0; i < size; i++)
				{
					GraphNode firstNode = q.remove();
					System.out.println(firstNode.data);
					
		
					for(int j = 0; j < firstNode.list.size(); j++)
					{
						
						if(!visited.contains(firstNode.list.get(j).data))
						{
							visited.add(firstNode.list.get(j).data);
							q.add(firstNode.list.get(j));
						}
					}
				}
			}
			
		}
	
	}
	
	
	public static void DFS(int key)
	{
		GraphNode start = adjNode.get(key);
		HashSet<Integer> visited = new HashSet<>();
		DFSHelper(start, visited);
	}
		
	public static void DFSHelper(GraphNode current, HashSet<Integer> visited)
	{
		visited.add(current.data);
		System.out.println(current.data);
		for(int i = 0; i < current.list.size(); i++)
		{
			
			if(!visited.contains(current.list.get(i).data))
			{
				DFSHelper(current.list.get(i),visited);
			}
			
		}
	}

}
