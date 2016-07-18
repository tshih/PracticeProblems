package chapter2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Timothy Shih on 7/17/2016.
 */
public class P2KthToLastTest {

    P2KthToLast obj;

    @Before
    public void setUp() throws Exception {
        obj = new P2KthToLast();
    }

    @Test
    public void getKthFromEndTest() throws Exception {
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        Node first = Node.createLinkedList(data);

        int k = 3;
        int value = obj.getKthFromEnd(first ,k).getData();
        assertEquals("Expected: " + 8 + " , Actual: " + value,8 ,value);
    }

}