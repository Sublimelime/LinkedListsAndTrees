import java.util.Scanner;

/**
 * Created on 10/5/2016, 2:29 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project BinaryTreeAndTester
 */

@SuppressWarnings({"WeakerAccess", "unchecked"})
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
     *
     * @return Smallest value in tree
     */
    public E minValue() {
        TreeNode<E> nav = root; //start at root
        while (nav.getLeft() != null) {
            nav = nav.getLeft();
        }
        return nav.getData();
    }

    /**
     * Gets the largest value in the tree
     *
     * @return Largest value in tree
     */
    public E maxValue() {
        TreeNode<E> nav = root; //start at root
        while (nav.getRight() != null) {
            nav = nav.getRight();
        }
        return nav.getData();
    }


    /**
     * Gets the deepest element in the tree
     *
     * @return Deepest element in the tree (Node with most ancestors)
     */
    public int maxDepth() { //todo -test
        int l,r;
        if (root == null)
                return 0;
        else {
            l = helperMD(root.getLeft(), 1);
            r = helperMD(root.getRight(), 1);
        }
        if (l>r) return l;
        else return r;
    }

    public int helperMD(TreeNode<E> t,int depth) {
        int l,r;
        if (t == null)
            return depth;

        l = helperMD(t.getLeft(),depth+1);
        r = helperMD(t.getRight(),depth+1);
        if (l>r) return l;
        else return r;
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
        if (root == null) //auto return false if root itself doesn't exist
            return false;

        TreeNode<E> nav = root; //start at root
        while (true) {
            if (value.compareTo(nav.getData()) == 0) { //if value is same, aka a match
                return true;
            } else if (value.compareTo(nav.getData()) >= 1) { //if value is larger
                if (nav.getRight() != null) nav = nav.getRight(); //move right if possible
                else return false;
            } else { //if value is smaller
                if (nav.getLeft() != null) nav = nav.getLeft(); //move left if possible
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

    public boolean remove(E value) {
        return false;
    }

    @SuppressWarnings("UnusedAssignment")
    public E removeHelper(E value) { //todo -write, clarify (Remove when two children are present)
        if (root == null) //auto return false if root itself doesn't exist
            return false;

        boolean found = false;

        //find the node that is to be removed
        TreeNode<E> nav = root; //start at root
        TreeNode<E> nodeToRemove = null;
        while (true) {
            if (value.compareTo(nav.getData()) == 0) { //if value is same, aka a match
                nodeToRemove = nav;
                found = true;
                break;
            } else if (value.compareTo(nav.getData()) >= 1) { //if value is larger
                if (nav.getRight() != null) nav = nav.getRight(); //move right if possible
                else break;
            } else { //if value is smaller
                if (nav.getLeft() != null) nav = nav.getLeft(); //move left if possible
                else break;
            }
        }
        if (!found) //if the node wasn't in the tree
            return false;

        if (nodeToRemove.getRight() == null && nodeToRemove.getLeft() == null) { //if no children, just wipe node
            nodeToRemove = null;
            return true;
        } else if (nodeToRemove.getRight() != null ^ nodeToRemove.getLeft() != null) { //holy cow, I actually used the XOR operator!
            //if only one child
            if (nodeToRemove.getLeft() == null) { //find out which one is not null, replace node with it
                nodeToRemove = nodeToRemove.getRight();
                return true;
            } else {
                nodeToRemove = nodeToRemove.getLeft();
                return true;
            }
        } else if (nodeToRemove.getRight() != null && nodeToRemove.getLeft() != null) {
            //todo swap value with (Smallest/deepest?) right descendant and remove value from new loc
            return true;
        }
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
