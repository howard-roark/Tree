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
import java.util.LinkedList;

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
    List<V> valuesList = new ArrayList<V>();
    Set<Tree<V>> subTreeSet = new TreeSet<Tree<V>>();
    Set<V> valuesSet = new TreeSet<V>();

    /** Value of the root of this tree*/
    private V rootValue;
    /**Value of previous root value after setRootValue is called*/
    private V prevRootVal;
    /**Number of nodes in this tree, 0 indicates empty tree*/
    private int numberOfNodes;
    /**Children of the root of this tree*/
    private List<Tree<V>> childrenList;
    /**List to return for resetting childrenList*/
    private List<Tree<V>> prevChildrenList;
    /**Tree object for duplication*/
    private Tree<V> dupTree;

    /**
    *Tree Constructor Method
    */
    public Tree(){
        this.numberOfNodes = 0;
    }

    /**Tree Constructor passing in value of V as root value
    *@param rootValue will be the root value of the tree
    */
    public Tree(final V rootValue){
        this.rootValue = rootValue;
        this.childrenList = new ArrayList<Tree<V>>();
        /*this.childrenList.add(rootValue);*/
        this.numberOfNodes = 1;
        /*Are we not passing the rootValue into the ArrayList?*/
        /*If so how since when you pass a Collection into ArrayList it uses the
         * collections iterator to place the items into the Arraylist,
         * if not what implications does this have for finding rootValue
         * since each "node" is potentially a root*/
    }

    /**
    *Copy of orignal Tree
    *@param original create a duplicate Tree
    */
    public Tree(final Tree<V> original){
        this.dupTree = original;
    }

    /**
    *Returns a collection of subtrees in breadth first order
    *@return List of subtrees
    */
    public List<Tree<V>> breadthFirstSubtrees(){
        /*I am having a hard time seeing beyond the first level of the tree.  I think
         * this may be because I am having a hardtime understanding where rootValue is, is
         * it just a instance varialble attached to the object when it is created, I feel
         * this cannot be the case due to the fact that each node is a possible root.
         * How do we determine if it is a rootValue, how do we use that rootValue once found
         * to add another Tree underneath that rootValue?
         * Also while using recursion how can we tell if we have dropped a level or if
         * we have just been going straight across one level of the tree?*/
        /*I think this question may be unclear, I have drawn out what I visualize in my
         * head as to what is going on with the tree that I will bring Monday*/
    return treeList;
    }

    /**
    *Returns a collection of values in breadth first order
    *@return list of values
    */
    public List<V> breadthFirstValues(){
        /*Same question as breadthfirstsubtrees()*/
    return valuesList;
    }

    /**
    *Search for specific value in tree
    *@param value The value to be searched in the Tree
    *@return boolean value for found / not found value
    */
    public boolean contains(V value){
        /*I know this is not correct, I do not know how to use inclusive or logic
         * to compare the value being passed in and the values in the tree*/
        if(value.equals(rootValue)){
            return true;}
        else{
            for(Tree<V> v : childrenList){
                if(v.equals(value));
                return true;
            }
        }
    return false;
    }

    /**
    *Column order of nodes in tree
    *@return list of subtrees
    */
    public List<Tree<V>> depthFirstSubtrees(){
        /*Same issues as breadthfirstsubtrees()*/
        return treeList;
    }

    /**
    *Returns a collection of values in the subtree nodes in
    *column first order
    *@return list of values in tree
    */
    public List<V> depthFirstValues(){
        /*Same issues as breadthfirstsubtrees()*/
        return valuesList;
    }

    /**
    *Return a list of all children of particular root
    *@return List of children in this tree
    */
    public final List<Tree<V>> getRootChildren(){
        /*This is also a problem for me not being able to see how to single out a single
         * root*/
        return childrenList;
    }

    /**
    *Returns a value for the root node of this tree
    *@return Value at Root
    */
    public final V getRootValue(){
        return rootValue;
    }

    /**
    *Return the height of the Tree
    *@return Height of Tree
    */
    public final int height(){
        /*How do I know if I have dropped a level while using recursion?*/
        /*Do we need the iterator to be able to write this method?*/
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
        int count = 0;
        /*Where to start count to account for first rootValue not being added to
         * list, unless it is?*/
        for(Tree<V> v : childrenList){
            count++;
        }
        return count;
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
        prevChildrenList = this.childrenList;
        this.childrenList = children;
        return prevChildrenList;
    }

    /**
    *Set value for root
    *@param value new value of root
    *@return  previous value of root
    */
    public final V setRootValue(final V value){
        prevRootVal = rootValue;
        this.rootValue = value;
        return prevRootVal;
    }

    /**
    *Returns the set of subtrees for this tree
    *@return the set of subtrees
    */
    public Set<Tree<V>> subtrees(){
        /*If I return a set does it automatically remove duplicates or does
         * this method have to remove duplicates, place the nodes back into
         * the set in the same order as the list and return that as the set?*/
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

