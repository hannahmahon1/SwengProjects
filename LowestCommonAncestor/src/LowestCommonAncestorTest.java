import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LowestCommonAncestorTest {

	@Test
	public void testEmpty() {
		LowestCommonAncestor LCA = new LowestCommonAncestor();
		assertNull(LCA.LCA(LCA.root, 6, 3));
	}

}
