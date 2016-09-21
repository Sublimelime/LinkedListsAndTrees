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
        LLNode<E> newNode = new LLNode<E>(data);
        first = newNode;
        last = newNode;
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

    //manipulation methods

    
    public LLNode<E> removeFirst() {
        LLNode<E> oldFirst = first;
        first = first.getNext();
        return oldFirst;
    }

    public LLNode<E> removeLast() {
        LLNode<E> oldLast = first;
        last = null;
        return oldLast;
    }

    public void addFirst(E data) {

    }
    public void addLast(E data) {

    }
    public void clear() {
        first = null;
        first = null;
    }
    public int size() {
        /*int finalSize = 0;

        while () {
            finalSize++;
        }

        return finalSize;*/
        return 0;
    }
    public boolean empty() {
        return false;
    }
    public E get(int x) {
        return null;
    }
    public E remove(int x) {
        return null;
    }
    public void add(int x, E data) {
    }
    public E set(int x,E data) {
        return null;
    }

    public boolean hasNext() {
        return (last!=null); //todo i think this is right?
    }

    public E next() {
        return null;
    }
}