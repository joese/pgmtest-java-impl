package com.pierceecom.pgmtest;

/**
 * Methods to implement for programming test. Implement these in ProgramminTasksImpl
 * @author pejo
 */
public interface ProgrammingTasks {
    /**
     * Vänder på en sträng, ex: "sträng" => "gnärts"
     * @param s
     * @return
     */
    default String reverse(String s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Räknar ut fibonacci-talet för n. 0,1,1,2,3,5,8,13....
     * @param n
     * @return
     */
    default int fib(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Summerar värden som är "tal" i en sträng och ignorerar bokstäver
     * @param numbers
     * @return
     */
    default int sumString(String numbers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Vänder ordningen i en array
     * @param arr
     * @return
     */
    default int[] reverseArray(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Hittar högsta talet i en array
     * @param nums
     * @return
     */
    default int findHigh(int[] nums) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Omvandlar RGB tal till en hexadecimal sträng med inledande #
     * tal under F (16) inleds med "0"
     * @param r
     * @param g
     * @param b
     * @return
     */
    default String rgbToHex(int r, int g, int b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
