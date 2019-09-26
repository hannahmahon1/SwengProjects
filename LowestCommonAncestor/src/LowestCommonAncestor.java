
public class LowestCommonAncestor {
	
	public class Node {
		int data;
		Node leftNode;
		Node rightNode;
		
		Node(int value)
		{
			data = value;
			leftNode = null;
			rightNode = null;
		}
		
	}
	
	public Node LCA (Node root, Node x, Node y)
	{
		if (root == null)
		{
			return null;
		}
		
		if(root == x || root == y)
		{
			return root;
		}
		
		Node left = LCA(root.leftNode, x, y);
		Node right = LCA(root.rightNode, x, y);
		
		if(left !=null && right != null)
		{
			return root;
		}
		else if(left == null && right == null)
		{
			return null;
		}
		else if(left !=null)
		{
			return left;
		
		}
		else
		{
			return right;
		}
	}

}
