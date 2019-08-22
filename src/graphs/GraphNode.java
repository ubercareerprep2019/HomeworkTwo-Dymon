import java.util.ArrayList;

public class GraphNode {
	int data;
	ArrayList<GraphNode> list;
	
	public GraphNode(int data) 
	{
		this.data = data;
		list = new ArrayList<>();
	}

	public void setList(ArrayList<GraphNode> list) {
		this.list = list;
	}
	
	

}
