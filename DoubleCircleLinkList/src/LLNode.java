/**
 * Created on 9/29/2016, 2:26 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project DoubleCircleLinkList
 */

@SuppressWarnings("WeakerAccess")

public class LLNode<E> {
    private E data;
    private LLNode<E> next;
    private LLNode<E> previous;

    public LLNode(E data) {
        this.data = data;
        next = null;
        previous = null;
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

    public LLNode<E> getPrevious() {
        return previous;
    }

    public void setPrevious(LLNode<E> newPre) {
        this.previous=newPre;
    }

    public void setNext(LLNode<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node:{data=" + data + "; previousData="+previous.getData()+"; nextData="+next.getData()+'}';
    }
}
