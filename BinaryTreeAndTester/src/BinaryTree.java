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

    private String preOrder() {
        return null;
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

    public boolean contains() { //todo -write
        return false;
    }

    public boolean insert(E value) { //todo -write
        if (root == null) { //if root doesn't exist
            root = new TreeNode<E>(value);
            return true;
        }

        

        return false;
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
                System.out.println(preOrder());
                break;
            case 2:
                System.out.println(inOrder());
                break;
            case 3:
                System.out.println(postOrder());
                break;
            default:
                System.out.println("Invalid choice, not printing.");
        }
    }
}
