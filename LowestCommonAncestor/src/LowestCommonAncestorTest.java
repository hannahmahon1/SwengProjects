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
	

}
