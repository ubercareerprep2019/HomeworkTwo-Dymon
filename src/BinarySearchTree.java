
public class BinarySearchTree {
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
		
		print(root);
	}	
	
	public void insert (int key)
	{
		if(root == null)
		{
			System.out.println("The Root is Null");
			root = new Node(key);
			
		}else {
			
			if(root.key > key)
			{
				root.left = new Node(key);
				root = root.left;
				System.out.println("New left node is:" +root.key);
			}else{
				
				
				root.right = new Node(key);
				root = root.right;
				System.out.println("New right node is:" +root.key);
			}
		}
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
