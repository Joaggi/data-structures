package decima_semana;

import java.nio.BufferUnderflowException;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable<? super T>>
{

    public void preOrder(BinaryNode<T> binaryNode){
        if(binaryNode != null){
            System.out.print(binaryNode.element + " -> ");
            preOrder(binaryNode.left);
            preOrder(binaryNode.right);
        }
    }

    public void postOrder(BinaryNode<T> binaryNode){
        if(binaryNode != null){
            postOrder(binaryNode.left);
            postOrder(binaryNode.right);
            System.out.print(binaryNode.element + " -> ");
        }
    }

    public void inorder(BinaryNode<T> binaryNode){
        if(binaryNode != null){
            inorder(binaryNode.left);
            System.out.print(binaryNode.element + " -> ");
            inorder(binaryNode.right);
        }
    }

    public void levelOrder(BinaryNode<T> binaryNode){
        ArrayList<BinaryNode<T>> arrayList = new ArrayList<>();
        arrayList.add(binaryNode);
        while(arrayList.size() > 0){
            BinaryNode<T> datoEnCola = arrayList.get(0);
            arrayList.remove(0);
            System.out.print(datoEnCola.element + " -> ");
            if(datoEnCola.left != null)
                arrayList.add(datoEnCola.left);
            if(datoEnCola.right != null)
                arrayList.add(datoEnCola.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        System.out.println(binarySearchTree.isEmpty());
        binarySearchTree.insert(10);
        System.out.println(binarySearchTree.root.element);
        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.println();

        binarySearchTree.insert(8);
        binarySearchTree.insert(15);
        binarySearchTree.insert(3);
        binarySearchTree.insert(9);
        binarySearchTree.insert(12);


        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.println();

        System.out.println("El dato 12 se encuentra dentro del árbol: " + binarySearchTree.contains(12));
        System.out.println("El dato 20 se encuentra dentro del árbol: " + binarySearchTree.contains(20));

        System.out.println("El dato menor del árbol es: " + binarySearchTree.findMin());

        binarySearchTree.levelOrder(binarySearchTree.root);
        System.out.println();

        System.out.println(binarySearchTree.height(binarySearchTree.root));


    }

    private static class BinaryNode<T>
    {
        T element;
        // The data in the node
        BinaryNode<T> left;
        // Left child
        BinaryNode<T> right; // Right child

        public BinaryNode(T element, BinaryNode<T> left, BinaryNode<T> right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }
    }



    private BinaryNode<T> root;

    public BinarySearchTree( ){
        root = null;
    }

    public void makeEmpty( ){
        root = null;
    }

    public boolean isEmpty( ){
        return root == null;
    }

    public void insert( T x ){
        root = insert( x, root );
    }


    private BinaryNode<T> insert( T x, BinaryNode<T> t ){
        if( t == null )
            return new BinaryNode<>( x, null, null );
        int compareResult = x.compareTo( t.element );
        if( compareResult < 0 )
            t.left = insert( x, t.left );
        if( compareResult > 0 )
            t.right = insert( x, t.right );
        return t;
    }

    public boolean contains( T x ){
        return contains( x, root );
    }

    private boolean contains( T x, BinaryNode<T> t ){
        if( t == null )
            return false;
        int compareResult = x.compareTo( t.element );
        if( compareResult < 0 )
            return contains( x, t.left );
        else if( compareResult > 0 )
            return contains( x, t.right );
        else
            return true;
        // Match
    }


    public T findMin( )
    {
        if( isEmpty( ) )
            throw new BufferUnderflowException( );
        return findMin( root ).element;
    }

    private BinaryNode<T> findMin( BinaryNode<T> t ){
        if( t == null )
            return null;
        else if( t.left == null )
            return t;
        return findMin( t.left );

//        if( t != null )
//            while( t.left != null )
//                t = t.left;
//        return t;
    }

    public void remove( T x ){
        root = remove( x, root );
    }


    private BinaryNode<T> remove( T x, BinaryNode<T> t ){
        if( t == null )
            return t;
        // Item not found; do nothing
        int compareResult = x.compareTo( t.element );
        if( compareResult < 0 )
            t.left = remove( x, t.left );
        else if( compareResult > 0 )
            t.right = remove( x, t.right );
        else if( t.left != null && t.right != null ) // Two children
        {
            t.element = findMin( t.right ).element;
            t.right = remove( t.element, t.right );
        }
        else
            t = ( t.left != null ) ? t.left : t.right;
        return t;
    }

    private int height( BinaryNode<T> t ){
        if( t == null )
            return -1;
        else
            return 1 + Math.max( height(t.left), height(t.right) );
    }

//    public T findMax( )
//
//
//
//    public void printTree( )
//
//
//    private BinaryNode<T> findMax( BinaryNode<T> t )
//
//    private void printTree( BinaryNode<T> t )


}