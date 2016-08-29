package com.pierceecom.pgmtest;

import java.util.NoSuchElementException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pejo
 */
public class StackTest {

    Stack<String> cut = new StackImpl<>();

    public StackTest() {
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testStringStack() {
        assertTrue(cut.isEmpty());
        cut.push("A");
        assertEquals(1, cut.size());
        cut.push("B");
        assertEquals(2, cut.size());
        
        String stack = "";
        for (String item : cut) {
            stack += item;
        }
        assertEquals("BA", stack);
        
        assertEquals("B", cut.pop());
        assertEquals(1, cut.size());
        assertEquals("A", cut.pop());
        assertEquals(0, cut.size());
        assertTrue(cut.isEmpty());
        // Should throw exception NoSuchElementException
        cut.pop();
    }

}
