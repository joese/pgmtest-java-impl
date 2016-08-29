package com.pierceecom.pgmtest;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pejo
 */
public class ProgrammingTasksTest {

    // Class Under Test => cut
    ProgrammingTasks cut;

    public ProgrammingTasksTest() {
        cut = new ProgrammingTasksImpl();
    }

    /**
     * Test of reverse method, of class ProgrammingTasks.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testReverse() {
        System.out.println("testReverse");
        String s = "reverse";
        String expResult = "esrever";
        String result = cut.reverse(s);
        assertEquals(expResult, result);
    }

    /**
     * Test of fib method, of class ProgrammingTasks.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testFib() {
        System.out.println("testFib");
        int n = 4;
        int expResult = 3;
        int result = cut.fib(n);
        assertEquals(expResult, result);

        n = 5;
        expResult = 5;
        result = cut.fib(n);
        assertEquals(expResult, result);

        n = 6;
        expResult = 8;
        result = cut.fib(n);
        assertEquals(expResult, result);

        n = 7;
        expResult = 13;
        result = cut.fib(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of sumString method, of class ProgrammingTasks.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testSumString() {
        System.out.println("testSumString");
        String numbers = "1 2 3 4  5  6 7 8 9";
        int expResult = 45;
        int result = cut.sumString(numbers);
        assertEquals(expResult, result);

        numbers = "a 10 2  b 23 c  29";
        expResult = 64;
        result = cut.sumString(numbers);
        assertEquals(expResult, result);
    }

    /**
     * Test of findHigh method, of class ProgrammingTasks.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testFindHigh() {
        System.out.println("testFindHigh");
        int[] nums = new int[]{1, 23, 3, 14, 15, 24, 23};
        int expResult = 24;
        int result = cut.findHigh(nums);
        assertEquals(expResult, result);
    }

    /**
     * Test of findHigh method, of class ProgrammingTasks.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testFindHigh2() {
        System.out.println("testFindHigh");
        int[] nums = new int[]{1, 1, 1, 2, 1};
        int expResult = 2;
        int result = cut.findHigh(nums);
        assertEquals(expResult, result);
    }

    /**
     * Test of reverseArray method, of class ProgrammingTasks.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testReverseArray() {
        System.out.println("testReverseArray");
        int[] arr = new int[]{1, 23, 3, 14, 15, 24, 23};
        int[] expResult = new int[]{23, 24, 15, 14, 3, 23, 1};
        int[] result = cut.reverseArray(arr);
        assertArrayEquals(expResult, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRgbToHex() {
        System.out.println("testRgbToHex");

        String expResult = "#000000";
        String result = cut.rgbToHex(0, 0, 0);
        assertEquals(expResult, result);

        expResult = "#1E1E1E";
        result = cut.rgbToHex(30, 30, 30);
        assertEquals(expResult, result);

        expResult = "#141E28";
        result = cut.rgbToHex(20, 30, 40);
        assertEquals(expResult, result);
    }

}
