package chapter1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Timothy Shih on 5/31/2016.
 */
public class P5OneAwayTest {

    private P5OneAway testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new P5OneAway();
    }

    @Test
    public void oneAwayInsert() throws Exception {
        assertTrue(testObj.oneAway("blake", "bake"));
    }

    @Test
    public void oneAwayRemove() {
        assertTrue(testObj.oneAway("bake", "blake"));
    }

    @Test
    public void oneAwayReplace() {
        assertTrue(testObj.oneAway("true", "brue"));
    }

}