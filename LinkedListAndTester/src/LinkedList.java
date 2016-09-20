/**
 * Created on 9/20/2016, 2:18 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project LinkedListAndTester
 */

public class LinkedList<E> {
    private LLNode<E> first, last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public LinkedList(E data) {
        //todo Creates a new node with the given data and then sets the first and last node to it.
    }

    //getters
    public E getFirst() {
        return first.getData();
    }

    public E getLast() {
        return last.getData();
    }

    public LLNode<E> getFirstNode() {
        return first;
    }

    public LLNode<E> getLastNode() {
        return last;
    }


}