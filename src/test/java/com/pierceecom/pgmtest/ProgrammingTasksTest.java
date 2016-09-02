package com.pierceecom.pgmtest;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author pejo
 */
public class ProgrammingTasksTest {

    // Class Under Test => cut
    private ProgrammingTasks cut;

    public ProgrammingTasksTest() {
        cut = new ProgrammingTasksImpl();
    }

    /**
     * Test of reverse method, of class ProgrammingTasks.
     */
    @Test
    public void testReverse() {
        System.out.println("testReverse");
        String s = "reverse";
        String expResult = "esrever";
        String result = cut.reverse(s);
        assertEquals("Returned value is not in reverse order.", expResult, result);
    }

    /**
     * Test of reverse method, of class ProgrammingTasks with bad input
     * Tests bad input in form of null
     */
    @Test
    public void testReverseBadInput() {
        System.out.println("testReversBadInput");
        String expResult = null;
        String result = cut.reverse(null);
        assertEquals("Reversing null should result in null", expResult, result);
    }

    /**
     * Test of fib method, of class ProgrammingTasks.
     */
    @Test
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
     * Test of fib method, of class ProgrammingTasks
     * Tests highest number that will return in an correct result
     */
    @Test
    public void testFibHighestValueFor64BitInt() {
        // The highest value of fibonacci series that could be represented by an 64bit int.
        // Using any higher number would result in an negative number
        int n = 46;
        int expResult = 1836311903;
        int result = cut.fib(n);
        assertEquals(expResult, result);
    }

    /**
     * Test to ensure that providing an high number that results in an overflow will cause an exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFibOverflow() {
        System.out.println("testFibOverFlow");
        cut.fib(47);
    }

    /**
     * Test of sumString method, of class ProgrammingTasks.
     */
    @Test
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
     * Test of sumString method, of class ProgrammingTasks
     * Tests if leading zeroes will be handled correct
     */
    @Test
    public void testSumStringLeadingZeroes() {
        System.out.println("testSumStringLeadingZeroes");
        String numbers = "0 Gurka 2 Bananer 005 äpplen";
        int expResult = 7;
        int result = cut.sumString(numbers);
        assertEquals(expResult, result);

    }

    /**
     * Test of sumString method, of class ProgrammingTasks
     * Tests if trailing zeroes will be handled correct
     */
    @Test
    public void testSumStringTrailingZeroes() {
        System.out.println("testSumStringLeadingZeroes");
        String numbers = "0 Gurka 2 Bananer 005 äpplen 50 0";
        int expResult = 57;
        int result = cut.sumString(numbers);
        assertEquals(expResult, result);

    }

    /**
     * Test of sumString method, of class ProgrammingTasks
     * Tests if misc input will be handled correct
     */
    @Test
    public void testSumStringMiscInput() {
        System.out.println("testSumStringLeadingZeroes");
        String numbers = "%23 gurka (03) [2] {0}";
        int expResult = 28;
        int result = cut.sumString(numbers);
        assertEquals(expResult, result);

    }

    /**
     * Test of sumString method, of class ProgrammingTasks
     * Tests if negative numbers will be handled correct
     */
    @Test
    public void testSumStringWithNegativeValues() {
        System.out.println("testSumStringWithNegativeValues");
        String numbers = "a 20Gurka-10 4";
        int expResult = 14;
        int result = cut.sumString(numbers);
        assertEquals(expResult, result);

    }

    /**
     * Test of findHigh method, of class ProgrammingTasks.
     */
    @Test
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
    @Test
    public void testFindHigh2() {
        System.out.println("testFindHigh");
        int[] nums = new int[]{1, 1, 1, 2, 1};
        int expResult = 2;
        int result = cut.findHigh(nums);
        assertEquals(expResult, result);
    }

    /**
     * Test of findHigh method, of class ProgrammingTasks.
     */
    @Test
    public void testFindHighNegative() {
        System.out.println("testFindHighNegative");
        int[] nums = new int[]{-1, -3, -4, -2222, 0};
        int expResult = 0;
        int result = cut.findHigh(nums);
        assertEquals(expResult, result);

        nums = new int[]{-3, -10000, -44, -4, -9003};
        expResult = -3;
        result = cut.findHigh(nums);
        assertEquals(expResult, result);
    }


    /**
     * Test of findHigh method, of class ProgrammingTasks.
     */
    @Test(expected = RuntimeException.class)
    public void testFindHighBadinput() {
        System.out.println("testFindHighBadinput");
        int[] nums = new int[]{};
        int result = cut.findHigh(nums);
    }

    /**
     * Test of findHigh method, of class ProgrammingTasks.
     */
    @Test(expected = RuntimeException.class)
    public void testFindHighBadinput2() {
        System.out.println("testFindHighBadinput");
        int[] nums = null;
        int result = cut.findHigh(nums);
    }

    /**
     * Test of reverseArray method, of class ProgrammingTasks.
     */
    @Test
    public void testReverseArray() {
        System.out.println("testReverseArray");
        int[] arr = new int[]{1, 23, 3, 14, 15, 24, 23};
        int[] expResult = new int[]{23, 24, 15, 14, 3, 23, 1};
        int[] result = cut.reverseArray(arr);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of rgbToHex, of class ProgrammingTasks.
     */
    @Test
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

        expResult = "#FFFFFF";
        result = cut.rgbToHex(255, 255, 255);
        assertEquals(expResult, result);

        expResult = "#0F0F0F";
        result = cut.rgbToHex(15, 15, 15);
        assertEquals(expResult, result);
    }


    /**
     * Test of rgbToHex, of class ProgrammingTasks.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRgbToHexHigh1() {
        System.out.println("testRgbToHexHigh1");
        cut.rgbToHex(256, 1, 1);
    }

    /**
     * Test of rgbToHex, of class ProgrammingTasks.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRgbToHexHigh2() {
        System.out.println("testRgbToHexHigh2");
        cut.rgbToHex(1, 256, 1);
    }

    /**
     * Test of rgbToHex, of class ProgrammingTasks.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRgbToHexHigh3() {
        System.out.println("testRgbToHexHigh3");
        cut.rgbToHex(1, 1, 256);
    }

    /**
     * Test of rgbToHex, of class ProgrammingTasks.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRgbToHexNegative1() {
        System.out.println("testRgbToHexNegative1");
        cut.rgbToHex(-2, 1, 2);
    }

    /**
     * Test of rgbToHex, of class ProgrammingTasks.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRgbToHexNegative2() {
        System.out.println("testRgbToHexNegative2");
        cut.rgbToHex(1, -2, 1);
    }

    /**
     * Test of rgbToHex, of class ProgrammingTasks.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRgbToHexNegative3() {
        System.out.println("testRgbToHexNegative3");
        cut.rgbToHex(1, 1, -3);
    }

}
