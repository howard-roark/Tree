/*
*Sources Used:
*   -Core Java: Volume I -- Fundamentals 9th Edition Chapter 6
*       Interfaces, Chapter 13 Collections
*   -Java API: Interface List<E>
*   -The Java Tutorials The List Interface
*   -The Java Tutorials The Set Interface
*   -A lot of guessing from Console error reports
*/

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Queue;

/**
*A general purpose tree with arbitrary degree. The empty tree contains no nodes.
*A non empty tree has exactly one node designated as its root and zero or more
*child subtrees each of whose are connected with the root by a directed edge.
*
*@version initial(0.1) [10 September 2013]
*@author McGuire, Matthew (mmcgui36@msudenver.edu)
*/
public class Tree<V> implements Iterable<Tree<V>>{
    /*
    *Making Lists/Variables to be used to return values
    *(Doing this so code compiles)
    */
    List<Tree<V>> treeList = new ArrayList<Tree<V>>();
    List<Tree<V>> childrenList = new ArrayList<Tree<V>>();
    List<V> valuesList = new ArrayList<V>();
    Set<Tree<V>> subTreeSet = new TreeSet<Tree<V>>();
    Set<V> valuesSet = new TreeSet<V>();


    /**
    *Tree Constructor Method
    */
    public Tree(){
    }

    /**Tree Constructor passing in value of V as root value
    *@param rootValue will be the root value of the tree
    */
    public Tree(final V rootValue){
    }

    /**
    *Copy of orignal Tree
    *@param original create a duplicate Tree
    */
    public Tree(final Tree<V> original){
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
    return false;
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
    public final List<Tree<V>> getRootChildren(){
        return childrenList;
    }

    /**
    *Returns a value for the root node of this tree
    *@return Value at Root
    */
    public final V getRootValue(){
        return null;
    }

    /**
    *Return the height of the Tree
    *@return Height of Tree
    */
    public final int height(){
        return -1;
    }

    /**
    *Returns an iterator over the subtrees of the Tree
    *@return returns an iterator to move through treeList
    */
    @Override
    public java.util.Iterator<Tree<V>> iterator(){
    return null;
    }

    /**
    *Return the maximum amount of children for Tree
    *@return Max amount of children for tree
    */
    public int maxDegree(){
        return -1;
    }

    /**
    *Return the number of parents in the Tree
    *@return amount of parent nodes
    */
    public final int numberOfInternalNodes(){
        return -1;
    }

    /**
    *Return the number of all nodes other than parent nodes
    *@return number of all non-parent nodes in tree
    */
    public final int numberOfLeafNodes(){
        return -1;
    }

    /**
    *Return total number of nodes in tree
    *@return Total number of nodes in tree
    */
    public final int numberOfNodes(){
        return -1;
    }

    /**
    *Restore a tree from a file
    *<br /><em>Postconditions:</em>
    *<blockquote>If successful, previous contents of this tree have
    *been replaced by the contents of the file.
    *If unsuccessful, content of the tree is unchanged.</blockquote>
    *@param filename filename to restore tree from
    *@return <code>true</code> if successful restore;
    *        <code>false</code> otherwise
    *@throws java.io.IOException if unexpected IO error
    */
    public final boolean restore(final String filename) throws java.io.IOException{
        if (false){throw new java.io.IOException();}
        return false;
    }

    /**
    *Save this tree to a file
    *@param filename filename to store this tree to
    *@return <code>true</code> successfully saved
    *        <code>false</code> otherwise
    *@throws java.io.IOException if unexpected IO error
    */
    public final boolean save(final String filename) throws java.io.IOException{
        if (false){throw new java.io.IOException();}
        return false;
    }

    /**
    *Pass in new children nodes to tree
    *@param children new list of children
    *@return     return the value of the old children
    *            that were replaced
    */
    public final List<Tree<V>> setRootChildren(final List<Tree<V>> children){
        return childrenList;
    }

    /**
    *Set value for root
    *@param value new value of root
    *@return  previous value of root
    */
    public final V setRootValue(final V value){
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

