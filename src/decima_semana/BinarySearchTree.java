package decima_semana;

import java.nio.BufferUnderflowException;

public class BinarySearchTree<T extends Comparable<? super T>>
{
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
        else if( compareResult > 0 )
            t.right = insert( x, t.right );
        else
            ; // Duplicate; do nothing
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