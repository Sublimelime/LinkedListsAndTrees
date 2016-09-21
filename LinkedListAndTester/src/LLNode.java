/**
 * Created on 9/20/2016, 2:18 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project LinkedListAndTester
 */

public class LLNode<E> {
    private E data;
    private LLNode<E> next;

    public LLNode(E data) {
        this.data = data;
        next = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public LLNode<E> getNext() {
        return next;
    }

    public void setNext(LLNode<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node:{data=" + data + '}';
    }
}
