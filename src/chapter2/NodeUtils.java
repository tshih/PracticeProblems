package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Timothy Shih on 7/17/2016.
 */
public class NodeUtils {

    public static <T> Node createLinkedList(T[] data) {

        Node prev = new Node(data[0]);
        Node first = prev;

        for(int i = 1; i < data.length ; i++) {
            Node next = new Node(data[i], null, prev);
            prev.setNext(next);
            prev = next;
        }

        return first;
    }

    public static <T> void printLinkedList(Node<T> node) {
        List<T> values = new ArrayList<T>();
        while(node != null) {
            values.add(node.getData());
            node = node.getNext();
        }

        System.out.println(values);
    }
}
