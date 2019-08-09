import java.util.ArrayList;
import java.util.HashMap;
public class GraphWithAdjacencyList {

	static HashMap<Integer, GraphNode> adjNode = new HashMap();
	static ArrayList nodeList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addNode(1);
		addNode(9);
		addNode(2);
		addNode(4);
		addEdge(1,9);
		addEdge(1,2);
		addEdge(1,4);
		removeNode(9);
		removeNode(9);
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
}
