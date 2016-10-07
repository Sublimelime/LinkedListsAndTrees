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

    public void preOrder(TreeNode<E> t)
    {
        if(t==null)
            return;
        System.out.println(t.toString());
        preOrder(t.getLeft());
        preOrder(t.getRight());
    }

    private String inOrder() {
        return null;
    }
    private String postOrder() {
        return null;
    }

    public E minValue() {
        return null;
    }
    public E maxValue() {
        return null;
    }
    public int maxDepth() {
        return 0;
    }
    public void clear() {
        root = null;
    }

    public int size() {
        return 0;
    }

    public boolean empty() {
        return root==null;
    }

    public boolean contains(E value) { //todo -write
        return false;
    }

    public boolean insert(E value) { //todo -test
        if (contains(value)) { //if tree already contains value
            return false;
        }
        if (root == null) { //if root doesn't exist
            root = new TreeNode<>(value);
            return true;
        }
        TreeNode<E> nav = root; //start at root
        while (true) {
            if (value.compareTo(nav.getData())>=1) { //if value is larger
                if (nav.getRight() == null) {
                    nav.setRight(new TreeNode<>(value));
                    return true;
                } else
                    nav = nav.getRight();
            } else if(value.compareTo(nav.getData())<=-1) { //if value is smaller
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

    public void printSubMenu() {
        Scanner printChoice = new Scanner(System.in);
        System.out.println("What kind of print? 1. Preorder, 2. Inorder, 3. Postorder.");
        switch (printChoice.nextInt()) {
            case 1:
                preOrder(root);
                break;
            case 2:
                inOrder();
                break;
            case 3:
                postOrder();
                break;
            default:
                System.out.println("Invalid choice, not printing.");
        }
    }
}
