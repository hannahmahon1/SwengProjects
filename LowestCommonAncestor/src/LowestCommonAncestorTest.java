import static org.junit.Assert.*;

import org.junit.Test;

public class LowestCommonAncestorTest 
{
	@Test
	public void testEmpty() 
	{
		LowestCommonAncestor.BinaryTree tree = new LowestCommonAncestor.BinaryTree();
		assertEquals(tree.findLCA(1,2), -1);
		
		assertEquals(tree.findLCA(2, 4), -1);
		
	}
	
	@Test
	public void testForTwoNodes()
	{
		LowestCommonAncestor.BinaryTree tree = new LowestCommonAncestor.BinaryTree();
		tree.root =  new LowestCommonAncestor.Node(1);
		tree.root.left = new LowestCommonAncestor.Node(2);
		assertEquals(tree.findLCA(1,2), 1);
		
		LowestCommonAncestor.BinaryTree treeTwo = new LowestCommonAncestor.BinaryTree();
		treeTwo.root = new LowestCommonAncestor.Node(1);
		treeTwo.root.right = new LowestCommonAncestor.Node(3);
		assertEquals(tree.findLCA(1, 3), 1);
	}
	

}
