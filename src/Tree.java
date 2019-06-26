public class Tree {
	static TreeNode root;
	
	public Tree(TreeNode root) {
		this.root = root;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode leftgrandChild = new TreeNode(6, null, null);
		TreeNode rightgrandChild = new TreeNode(3, null, null);
		TreeNode leftChild = new TreeNode(5, null, null);
		TreeNode rightChild = new TreeNode(2, rightgrandChild,leftgrandChild);
		TreeNode left = new TreeNode(7, null, null);
		TreeNode right = new TreeNode(17, leftChild, rightChild);
		TreeNode root = new TreeNode(1, left, right);
		Tree tree = new Tree(root);
		
		print(root);
		
	
	}
	
	
	public static void print(TreeNode root) // takes not argument
	{
		TreeNode rootNode  = root;
		
		if(rootNode == null) //Base case
		{
			
		}else {
	
			System.out.println(rootNode.data);
			rootNode = root.left;
			print(rootNode);
			rootNode = root.right;
			print(rootNode);
		}

	}

}
