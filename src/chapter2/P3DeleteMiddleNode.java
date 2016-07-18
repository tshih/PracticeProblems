package chapter2;

/**
 * Created by Timothy Shih on 7/17/2016.
 */
public class P3DeleteMiddleNode {

    public void deleteMiddleNode(Node n) {
        if(n == null)
            return;

        Node next = n.getNext();
        n.setData(next.getData());
        n.setNext(next.getNext());
        next.setNext(null);
    }
}
