package chapter2;

/**
 * Created by Timothy Shih on 7/17/2016.
 */
public class P2KthToLast {

    public Node getKthFromEnd(Node first, int k) {
        if (first == null)
            return null;

        Node i = first;
        Node j = first;

        for(int x = 0; x < k; x ++ ) {
            i = i.getNext();
        }

        while(i != null) {
            i = i.getNext();
            j = j.getNext();
        }
        return j;
    }

}
