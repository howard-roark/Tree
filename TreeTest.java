

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

/**
 * The test class emptyConstructorTest.
 *
 * @author  (Matthew McGuire)
 * @version (0.1 16 September 2013)
 */
public class TreeTest
{   
    private Tree<Integer>tree1;
    private Tree<Integer>tree2;
    private Tree<Integer>tree3;
    private Tree<Integer>tree4;
    private Tree<Integer>tree5;
    private Tree<Integer>tree6;
    private Tree<Integer>tree7;
    private Tree<Integer>tree8;
    private Tree<Integer>tree9;
    
    private List<Tree<Integer>> list1;
    private List<Tree<Integer>> list2;
    private List<Tree<Integer>> list3;
    private List<Tree<Integer>> list4;
    private List<Tree<Integer>> list5;
    private List<Tree<Integer>> listA;
    private List<Tree<Integer>> listB;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp(){   
         tree1 = new Tree<Integer>(1);
         tree2 = new Tree<Integer>(2);
         tree3 = new Tree<Integer>(3);
         tree4 = new Tree<Integer>(4);
         tree5 = new Tree<Integer>(5);
         tree6 = new Tree<Integer>(6);
         tree7 = new Tree<Integer>(7);
         tree8 = new Tree<Integer>(8);
         tree9 = new Tree<Integer>(9);
         
         list1 = new ArrayList<Tree<Integer>>();
         list1.add(tree2);
         list1.add(tree3);
         tree1.setRootChildren(list1);
         
         list2 = new ArrayList<Tree<Integer>>();
         list2.add(tree4);
         tree2.setRootChildren(list2);
         
         list3 = new ArrayList<Tree<Integer>>();
         list3.add(tree5);
         list3.add(tree6);
         list3.add(tree5);
         list3.add(tree9);
         tree3.setRootChildren(list3);
         
         list4 = new ArrayList<Tree<Integer>>();
         list4.add(tree6);
         tree4.setRootChildren(list4);
         
         list5 = new ArrayList<Tree<Integer>>();
         list5.add(tree7);
         tree5.setRootChildren(list5);
         
         listA = new ArrayList<Tree<Integer>>();
         listA.add(tree8);
         tree7.setRootChildren(listA);
         
         listB = new ArrayList<Tree<Integer>>();
         listB.add(tree9);
         tree8.setRootChildren(listB);
    }
    
    /**
     * Default constructor for test class emptyConstructorTest
     */
    @Test
    public void testEmptyConstructor()
    {
        Tree<Integer> treeInt = new Tree<Integer>();
        assertEquals(null, treeInt.getRootValue());
    }
    
   /**
    * Testing Constructor
    */
   @Test
   public void testConstructor()
   {
       Tree<String> treeString = new Tree<String>("ROOT VALUE");
       assertEquals("ROOT VALUE", treeString.getRootValue());
   }
   
   /**
    * Test setRootChildren Method
    * @Exception NullPointerException for empty List
    */
   @Test 
   public void testSetRootChildren(){
       Tree<String> tree = new Tree<String>("First");
       Tree<String> tree2 = new Tree<String>("Second");
       Tree<String> tree3 = new Tree<String>("Third");
       
       List<Tree<String>> list = new ArrayList<Tree<String>>();
       list.add(tree2);
       tree.setRootChildren(list);
       
       List<Tree<String>> list2 = new ArrayList<Tree<String>>();
       list2.add(tree3);
       assertEquals(list, tree.setRootChildren(list2));
    }
  
    /**
     * Test setRootValue
     */
    @Test 
    public void testSetRootValue(){
        Tree<String> stringRootVal = new Tree<String>("Root Value");
        assertEquals("Root Value", stringRootVal.setRootValue("New Root Value"));
        assertEquals("New Root Value", stringRootVal.setRootValue("Another Value"));
    }
   
   /**
    * Test getRootValue method
    */
   @Test
   public void testGetRootValue(){
       Tree<String> sTree = new Tree<String>("root v");
       assertEquals("root v", sTree.getRootValue());
       
    }
    
    /**
     * Test numberOfNodes method
     */
    @Test 
    public void testNumberOfNodes(){
         assertEquals((int) 15, (int) tree1.numberOfNodes(), 0);
    }
    
    /**
     * Test number of nodes with empty list
     * @Exception
     */
    @Test (expected = NullPointerException.class)
    public void testExceptionNumberOfNodes(){
        Tree<Integer> intTree = new Tree<Integer>();
        assertEquals(0, intTree.numberOfNodes());
    }
    
    /**
     * Test get root children for empty list
     * @Exception
     */
    @Test (expected = NullPointerException.class)
    public void testExceptionGetRootChildren(){
        Tree<String> tree = new Tree<String>();
        assertEquals(null, tree.getRootChildren());
    }
    
    /**
     * Test getRootChildren method
     */
    @Test
    public void testGetRootChildren(){
        Tree<String> tree = new Tree<String>("One");
        Tree<String> tree2 = new Tree<String>("2");
        Tree<String> tree3 = new Tree<String>("3");
        Tree<String> tree4 = new Tree<String>("4");
        List<Tree<String>> list = new ArrayList<Tree<String>>();
        list.add(tree2);
        list.add(tree3);
        list.add(tree4);
        tree.setRootChildren(list);
        
        List<Tree<String>> expected = new ArrayList<Tree<String>>();
        expected.add(tree2);
        expected.add(tree3);
        expected.add(tree4);
        
        boolean equalLists = expected.equals(tree.getRootChildren());
        
        assertEquals(true, equalLists);
    }
    
    /**
     *Test depthFirstSubtrees
     */
    @Test
    public void testDepthFirstSubtrees(){
         List<Tree<Integer>> expected = new ArrayList<Tree<Integer>>();
         expected.add(tree1);
         expected.add(tree2);
         expected.add(tree4);
         expected.add(tree6);
         expected.add(tree3);
         expected.add(tree5);
         expected.add(tree7);
         expected.add(tree8);
         expected.add(tree9);
         expected.add(tree6);
         expected.add(tree5);
         expected.add(tree7);
         expected.add(tree8);
         expected.add(tree9);
         expected.add(tree9);
         
         assertEquals(expected, tree1.depthFirstSubtrees());
    }
    
    /**
     * Test method to recieve list of values in preorder traversal
     */
    @Test
    public void testDepthFirstValues(){
         List<Tree<Integer>> expected = new ArrayList<Tree<Integer>>();
         expected.add(tree1);
         expected.add(tree2);
         expected.add(tree4);
         expected.add(tree6);
         expected.add(tree3);
         expected.add(tree5);
         expected.add(tree7);
         expected.add(tree8);
         expected.add(tree9);
         expected.add(tree6);
         expected.add(tree5);
         expected.add(tree7);
         expected.add(tree8);
         expected.add(tree9);
         expected.add(tree9);
         
         assertEquals(expected, tree1.depthFirstSubtrees());
    }
    
    /**
     * Test to determine the height of the tree
     */
    @Test
    public void testHeight(){
         assertEquals((int) 6, (int) tree1.height(), 0);
    }
   

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}


