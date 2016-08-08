package chapter2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Timothy Shih on 7/25/2016.
 */
public class P4PartitionTest {

    private P4Partition obj;

    @Before
    public void setUp() throws Exception {
        obj = new P4Partition();
    }

    @Test
    public void testPartition() {
        Integer[] vals = {1,3,4,6,5,2,7};

        Node<Integer> n = NodeUtils.createLinkedList(vals);

        Node result = obj.partition(n, 8);
        NodeUtils.printLinkedList(result);
    }

}