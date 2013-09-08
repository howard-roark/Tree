/*
*Sources Used:
*	-Core Java: Volume I -- Fundamentals 9th Edition Chapter 6
*		Interfaces, Chapter 13 Collections
*	-Java API: Interface List<E>
*	-The Java Tutorials The List Interface
*	-The Java Tutorials The Set Interface
*	-A lot of guessing from Console error reports 
*/

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
*This is the framework for the tree that we will build and use in CS_390I
*
*@author McGuire, Matthew (mmcgui36@msudenver.edu)
*/
public class Tree<V> extends Object implements Iterable<Tree<V>>{
	/*
	*Making Lists/Variables to be used to return values
	*(Doing this so code compiles)
	*/
	List<Tree<V>> treeList = new ArrayList<Tree<V>>();
	List<Tree<V>> childrenList = new ArrayList<Tree<V>>();
	List<V> valuesList = new ArrayList<V>();
	Set<Tree<V>> subTreeSet = new HashSet<Tree<V>>();
	Set<V> valuesSet = new HashSet<V>();
	Iterator<Tree<V>> iterator = treeList.iterator();
	int value = 0;
	boolean boolValue = true;

	/**
	*Tree Constructor Method
	*/
	public Tree(){
	}

	/**Tree Constructor passing in value of V as root value 
	*@param rootValue will be the root value of the tree
	*/
	public Tree(V rootValue){
	}

	/**
	*Copy of orignal Tree
	*@param original create a duplicate Tree
	*/
	public Tree(Tree<V> original){
	}

	/**
	*Returns a collection of subtrees in breadth first order
	*@return List of subtrees
	*/
	public List<Tree<V>> breadthFirstSubtrees(){
		return treeList;
	}

	/**
	*Returns a collection of values in breadth first order
	*@return list of values
	*/
	public List<V> breadthFirstValues(){
		return valuesList;
	}

	/**
	*Search for specific value in tree
	*@param value The value to be searched in the Tree
	*@return boolean value for found / not found value
	*/
	public boolean contains(V value){
		return boolValue;
	}

	/**
	*Column order of nodes in tree
	*@return list of subtrees
	*/
	public List<Tree<V>> depthFirstSubtrees(){
		return treeList;
	}

	/**
	*Returns a collection of values in the subtree nodes in
	*column first order
	*@return list of values in tree
	*/
	public List<V> depthFirstValues(){
		return valuesList;
	}

	/**
	*Return a list of all children of particular root
	*@return List of children in this tree
	*/
	public List<Tree<V>> getRootChildren(){
		return childrenList;
	}

	/**
	*Returns a value for the root node of this tree
	*@return Value at Root
	*/
	public V getRootValue(){
		return null; 
	}

	/**
	*Return the height of the Tree
	*@return Height of Tree
	*/
	public int height(){
		return value;
	}

	/**
	*Returns an iterator over the subtrees of the Tree 
	*@return returns an iterator to move through treeList 
	*/
	public Iterator<Tree<V>> iterator(){
		return iterator;
		/*
		*This iterator will only be able to iterate through
		*the Tree list, it will not iterate through a set
		*or the childList, Not sure if this is how we need it
		*it to work. 
		*/
	}

	/**
	*Return the maximum amount of children for Tree
	*@return Max amount of children for tree
	*/
	public int maxDegree(){
		return value;
	}

	/**
	*Return the number of parents in the Tree
	*@return amount of parent nodes
	*/
	public int numberOfInternalNodes(){
		return value;
	}

	/**
	*Return the number of all nodes other than parent nodes
	*@return number of all non-parent nodes in tree
	*/
	public int numberOfLeafNodes(){
		return value;
	}

	/**
	*Return total number of nodes in tree
	*@return Total number of nodes in tree
	*/
	public int numberOfNodes(){
		return value;
	}

	/**
	*Restore a tree from saved file
	*@param filename filename to restore tree from
	*@return 	 returned whether a tree exists in file
	*/
	public boolean restore(String filename){
		return boolValue;
	}

	/**
	*Save a tree to a file
	*@param filename filename to store tree to
	*@return 	 boolean values to confirm save
	*/
	public boolean save(String filename){
		return boolValue;
	}

	/**
	*Pass in new children nodes to tree
	*@param children new list of children
	*@return 	 return the value of the old children 
	*		 that were replaced
	*/
	public List<Tree<V>> setRootChildren(List<Tree<V>> children){
		return childrenList; 
	}

	/**
	*Set value for root
	*@param value new value of root
	*@return  previous value of root
	*/
	public V setRootValue(V value){
		return null;
	}

	/**
	*Returns the set of subtrees for this tree
	*@return the set of subtrees
	*/
	public Set<Tree<V>> subtrees(){
		return subTreeSet;	
	}

	/**
	*Returns the values of the set for this tree
	*@return the values of the set
	*/
	public Set<V> values(){
		return valuesSet;
	}
}

