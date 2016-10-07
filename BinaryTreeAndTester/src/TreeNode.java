/**
 * Created on 10/5/2016, 2:29 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project BinaryTreeAndTester
 */

public class TreeNode<E extends Comparable> {
    private E data;
    private TreeNode<E> left;
    private TreeNode<E> right;

    public TreeNode(E data) {
        this.data = data;
        left = null;
        right = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public TreeNode<E> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<E> left) {
        this.left = left;
    }

    public TreeNode<E> getRight() {
        return right;
    }

    public void setRight(TreeNode<E> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode:{" + "data=" + data + '}';
    }
}
