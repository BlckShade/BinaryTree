package BT_pack;
import BT_pack.BinaryTree;
import static org.junit.Assert.*;
import org.junit.*;
public class Tes_Tree {
	@Test
	public void testTreeWithOneVertexWithoutChildren()//testing tree with one vertex and without children
	{
		BinaryTree test_tree = new BinaryTree(0.5);
		assertNotNull(test_tree);
		assertNotNull(test_tree.value);
		assertNull(test_tree.left);
		assertNull(test_tree.right);
	}
	@Test
	public void testZeroTree()//testing tree with 0 vertices
	{
		BinaryTree test_tree = null;
		assertNull(test_tree);
	}
	@Test
	public void testTreeWithChildren()//testing tree with 1 vertex and 2 children
	{
		BinaryTree test_tree = new BinaryTree(0.5);
		test_tree.insert(test_tree, 25);
		assertNotNull(test_tree.right);
		test_tree.insert(test_tree, 0.25);
		assertNotNull(test_tree.left);
		assertEquals(test_tree.left.value,0.25,0);
		assertEquals(test_tree.right.value,25,0);
	}
	@Test
	public void testInsert()//testing method insert()
	{
		double temp_left=0.1;
		BinaryTree test_tree = new BinaryTree(0.5);
		test_tree.insert(test_tree, temp_left);
		assertNotNull(test_tree.left);
		assertNull(test_tree.right);
		assertEquals(test_tree.left.value,temp_left,0);//testing the left branche of tree
		double temp_right=0.7;
		test_tree.insert(test_tree, temp_right);
		assertNotNull(test_tree.right);
		assertEquals(test_tree.right.value,temp_right,0);//testing the right branche of tree
	}
	@Test
	public void testBinaryTreeRun()//testing method BinaryTreeRun
	{
		int temp_count = 27;
		BinaryTree test_tree = new BinaryTree(0.5);
		test_tree.BinaryTreeRun(test_tree, temp_count);
		test_tree.walk(test_tree);
		assertEquals(temp_count+1,test_tree.get_count());//temp_count+1 cause method get_count consist a main vertex
	}
}
