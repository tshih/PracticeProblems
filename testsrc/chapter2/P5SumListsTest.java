package chapter2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Timothy Shih on 8/7/2016.
 */
public class P5SumListsTest {

    private P5SumLists obj;

    @Before
    public void setUp() throws Exception {
        obj = new P5SumLists();
    }

    @Test
    public void sumLists() throws Exception {
        Integer[] one = {1,2,3};
        Integer[] two = {9,8,7};

        Node<Integer> n1 = NodeUtils.createLinkedList(one);
        Node<Integer> n2 = NodeUtils.createLinkedList(two);

        Integer total = obj.sumLists(n1, n2);
        assertEquals(total, (Integer)1000);
    }

}