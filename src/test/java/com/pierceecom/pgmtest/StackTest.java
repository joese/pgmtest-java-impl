package com.pierceecom.pgmtest;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 *
 * @author pejo
 */
public class StackTest {

    private Stack<String> cut = new StackImpl<>();

    public StackTest() {
    }

    @Test(expected = NoSuchElementException.class)
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

    @Test()
    public void testStringStack2() {
        assertTrue(cut.isEmpty());
        String expected = "";
        for (int i = 0; i < 10; i++) {
            cut.push(String.valueOf(i));
            expected += String.valueOf(i);
        }
        assertEquals(10, cut.size());
        String stack = "";
        for (String item : cut) {
            stack += item;
        }
        StringBuilder builder = new StringBuilder(expected);
        assertEquals(builder.reverse().toString(), stack);
        assertFalse(cut.isEmpty());
    }

}
