package chapter2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Timothy Shih on 8/7/2016.
 */
public class P6PalindromeTest {

    private P6Palindrome obj;

    @Before
    public void setUp() throws Exception {
        obj = new P6Palindrome();
    }

    @Test
    public void isPalindrome() throws Exception {
        Integer[] t = {1,3,5,7,9};

        Node<Integer> n = NodeUtils.createLinkedList(t);

        assertFalse(obj.isPalindrome(n));
    }

    @Test
    public void isPalindromeEven() throws Exception {
        Integer[] t = {1,3,5,7};

        Node<Integer> n = NodeUtils.createLinkedList(t);

        assertFalse(obj.isPalindrome(n));
    }

    @Test
    public void isPalindromeTrue() throws Exception {
        Integer[] t = {1,3,5,3,1};

        Node<Integer> n = NodeUtils.createLinkedList(t);

        assertTrue(obj.isPalindrome(n));
    }

    @Test
    public void isPalindromeEvenTrue() throws Exception {
        Integer[] t = {1,3,3,1};

        Node<Integer> n = NodeUtils.createLinkedList(t);

        assertTrue(obj.isPalindrome(n));
    }

}