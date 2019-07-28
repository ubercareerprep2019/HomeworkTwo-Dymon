
public class BinarySearchTree <T>{
	static Node root;
	
	public BinarySearchTree(Node root) {
		// TODO Auto-generated constructor stub
			this.root = root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(16);
		BinarySearchTree tree = new BinarySearchTree(root);
		tree.insert(10);
		tree.insert(21);
		tree.insert(7);
		tree.insert(13);
		tree.insert(18);
		tree.insert(29);
		tree.insert(99);
		
		//print(root);
		
		find(7);
	}	
	
	public void insert (int key)
	{
		findPosition(root,key);	
	}
	
	
	public void findPosition(Node root, int key)
	{
		if(root == null)
		{
		   root = new Node(key);
		   
		}
		
		if(root.key < key)
		{
			if(root.right == null)
			{
				root.right = new Node(key);
			}else {
				
				findPosition(root.right, key);
			}
			
		}else if(root.key > key ) {
			
			if(root.left == null)
			{
				root.left = new Node(key);
			}else {
				
				findPosition(root.left, key);
			}
		}
		
	}
	
	
	public static boolean find(int key)
	{
	return false;
	}
	
	public static void print(Node root)
	{
		Node rootNode  = root;
		
		if(rootNode == null) //Base case
		{
			
		}else {
	
			System.out.println(rootNode.key);
			rootNode = root.left;
			print(rootNode);
			rootNode = root.right;
			print(rootNode);
		}
	}

}
