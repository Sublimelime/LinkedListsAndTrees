import java.util.Scanner;

/**
 * Created on 10/5/2016, 2:29 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project BinaryTreeAndTester
 */

@SuppressWarnings("WeakerAccess")
public class BinaryTree<E extends Comparable> {

    private TreeNode<E> root;

    public BinaryTree() {
        this.root = null;
    }

    /**
     * Recursively goes through the tree, printing it in pre-order format.
     *
     * @param t initial value to start from.
     */
    public void preOrder(TreeNode<E> t) { //todo -verify
        if (t == null)
            return;
        System.out.println(t.toString());
        preOrder(t.getLeft());
        preOrder(t.getRight());
    }

    /**
     * Recursively goes through the tree, printing it in in-order format.
     *
     * @param t initial value to start from.
     */
    public void inOrder(TreeNode<E> t) { //todo -verify
        if (t == null)
            return;
        inOrder(t.getLeft());
        System.out.println(t.toString());
        inOrder(t.getRight());
    }

    /**
     * Recursively goes through the tree, printing it in post-order format.
     *
     * @param t initial value to start from.
     */
    public void postOrder(TreeNode<E> t) { //todo -verify
        if (t == null)
            return;
        postOrder(t.getLeft());
        postOrder(t.getRight());
        System.out.println(t.toString());
    }

    /**
     * Get the smallest value in the tree.
     * @return Smallest value in tree
     */
    public E minValue() {
        TreeNode<E> nav = root; //start at root
        while (nav.getLeft()!=null) {
            nav = nav.getLeft();
        }
        return nav.getData();
    }

    /**
     * Gets the largest value in the tree
     * @return Largest value in tree
     */
    public E maxValue() {
        return null;
    }

    /**
     * Gets the deepest element in the tree
     * @return Deepest element in the tree (Node with most ancestors)
     */
    public int maxDepth() {
        return 0;
    }

    public void clear() {
        root = null;
    }

    public int size() {
        finalSize = 0;
        return sizeInternal(root);
    }

    int finalSize = 0;
    public int sizeInternal(TreeNode<E> t) {
        if (t == null)
            return 0;
        finalSize++;
        sizeInternal(t.getLeft());
        sizeInternal(t.getRight());
        return finalSize;
    }

    public boolean empty() {
        return root == null;
    }

    public boolean contains(E value) {
        if (root==null) //auto return false if root itself doesn't exist
            return false;

        TreeNode<E> nav = root; //start at root
        while (true) {
            if (value.compareTo(nav.getData()) == 0) { //if value is same, aka a match
                return true;
            } else if (value.compareTo(nav.getData()) >= 1) { //if value is larger
                if(nav.getRight() != null) nav = nav.getRight(); //move right if possible
                else return false;
            } else { //if value is smaller
                if(nav.getLeft() != null)nav = nav.getLeft(); //move left if possible
                else return false;
            }
        }
    }

    /**
     * Inserts a value into the tree
     *
     * @param value The value to attempt adding
     * @return Success of add, fails if already in tree.
     */
    public boolean insert(E value) {
        if (contains(value)) { //if tree already contains value
            return false;
        }
        if (root == null) { //if root doesn't exist
            root = new TreeNode<>(value);
            return true;
        }
        TreeNode<E> nav = root; //start at root
        while (true) {
            if (value.compareTo(nav.getData()) >= 1) { //if value is larger
                if (nav.getRight() == null) {
                    nav.setRight(new TreeNode<>(value));
                    return true;
                } else
                    nav = nav.getRight();
            } else if (value.compareTo(nav.getData()) <= -1) { //if value is smaller
                if (nav.getLeft() == null) {
                    nav.setLeft(new TreeNode<>(value));
                    return true;
                } else
                    nav = nav.getLeft();
            }
        }
    }

    public boolean add(E value) {
        return insert(value); //same as insert
    }

    public boolean remove(E value) { //todo -write
        return false;
    }

    /**
     * Prints a menu of print choices.
     */
    public void printSubMenu() {
        Scanner printChoice = new Scanner(System.in);
        System.out.println("What kind of print? 1. PreOrder, 2. InOrder, 3. PostOrder.");
        switch (printChoice.nextInt()) {
            case 1:
                preOrder(root);
                break;
            case 2:
                inOrder(root);
                break;
            case 3:
                postOrder(root);
                break;
            default:
                System.out.println("Invalid choice, not printing.");
        }
    }
}
