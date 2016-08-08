package chapter2;

/**
 * Created by Timothy Shih on 7/25/2016.
 */
public class P4Partition {

    public Node partition(Node<Integer> n, int partition) {

        if(n != null && !n.hasNext()) {
            return n;
        }

        Node<Integer> greater = new Node<Integer>();
        Node<Integer> less = new Node<Integer>();
        Node first = less;

        while(n != null) {
            int value = n.getData();
            if (value >= partition) {
                greater.setData(value);
                Node<Integer> newNode = new Node<Integer>(null, greater);
                greater = newNode;
            } else {
                less.setData(value);
                Node<Integer> newNode = new Node<Integer>(null);
                less.setNext(newNode);
                less = newNode;
            }
            n = n.getNext();
        }

        less.setNext(null);

        if(!first.hasNext()) {
            first = greater;
        }

        if(greater.hasNext()) {
            less.setNext(greater);
            less.setData((Integer) greater.getNext().getData());
            less.setNext(greater.getNext().getNext());
        }

        return first;
    }
}
