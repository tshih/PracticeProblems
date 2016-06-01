package chapter1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Timothy Shih on 5/31/2016.
 */
public class P4PalinPermTest {

    private P4PalinPerm testObj;

    @Before
    public void setUp() {
        testObj = new P4PalinPerm();
    }

    @Test
    public void testPermTrueBasic() throws Exception {
        String s = "asdf fdsa";
        assertTrue(testObj.testPerm(s));
    }

    @Test
    public void testPermFalseBasic() {
        String s = "adry";
        assertFalse(testObj.testPerm(s));
    }

}