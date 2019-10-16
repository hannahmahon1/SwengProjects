import static org.junit.Assert.*;

import org.junit.Test;

public class dagTest {
	
	@Test
	public void testEmpty() {
		dag dag = new dag(10);
		assertEquals(-1, dag.findLCA(2, 3));
		assertEquals(-1, dag.findLCA(2, 9));
	}


	@Test 
	public void addEdge()
	{
		dag dag = new dag(10);
		dag.addEdge(4, 5);
		assertEquals(1, dag.E());
	}
	
	@Test
	public void addNegativeEdge()
	{
		dag dag = new dag(5);
		dag.addEdge(7, 5);
		assertEquals(0, dag.E()); //won't add edge cause has a negative value 
	}
	
	
	@Test 
	public void testIndegree()
	{
		dag dag = new dag(10);
		dag.addEdge(1, 2);
		dag.addEdge(2, 3);
		dag.addEdge(3, 5);
	
		assertEquals(1, dag.indegree(3));
		
	}
	@Test
	public void testOutDegree()
	{
		dag dag = new dag(10);
		dag.addEdge(1, 2);
		dag.addEdge(2, 3);
		dag.addEdge(3, 5);
	
		assertEquals(1, dag.outdegree(3));
		
	}
	
	@Test
	public void testForCycle()
	{
		dag dag = new dag(10);

		dag.addEdge(0, 1);
		dag.addEdge(1, 2);
		dag.addEdge(2, 2);
		dag.addEdge(3, 3);
		dag.addEdge(4, 4);
		
		dag.findCycle(1);
		assertTrue(dag.hasCycle());
		
		
	}

	

}