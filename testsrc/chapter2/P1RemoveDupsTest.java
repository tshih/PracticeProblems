package chapter2;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static javafx.scene.input.KeyCode.T;
import static org.junit.Assert.*;

/**
 * Created by Timothy Shih on 7/17/2016.
 */
public class P1RemoveDupsTest {

    private P1RemoveDups obj;

    @Before
    public void setUp() throws Exception {
        obj = new P1RemoveDups();
    }

    @Test
    public void removeDups() throws Exception {
        Integer[] data = {1,2,3,4,5,5,5,5,1};

        Set<Integer> dataset = new HashSet<Integer>();
        Collections.addAll(dataset, data);

        Node<Integer> prev = new Node(data[0]);
        Node<Integer> first = prev;

        for(int i = 1; i < data.length ; i++) {
            Node next = new Node(data[i], null, prev);
            prev.setNext(next);
            prev = next;
        }

        obj.removeDups(first);

        assertEquals(dataset.size(), getSize(first));
    }

    private int getSize(Node n) {
        if (n == null)
            return 0;
        int size = 0;
        while(n!= null) {
            size++;
            n = n.getNext();
        }
        return size;
    }

}