package com.pierceecom.pgmtest;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implementation of ProgrammingTasks
 *
 * @author Joel Sewing
 */

public class ProgrammingTasksImpl implements ProgrammingTasks {

    /**
     * Will return the provided string in reversed order
     *
     * @param toReverse is String to be reversed
     * @return Reversed String
     */
    @Override
    public String reverse(final String toReverse) {

        // Avoid NullPointerException,
        // the reverse of null would be null
        // One might think it would be neat to return the String "llun"
        if (toReverse == null) {
            return null;
        }

        // Unnecessary to invent the wheel again
        // we'll use the reverse method of StringBuilder
        StringBuilder builder = new StringBuilder(toReverse);
        return builder.reverse().toString();
    }

    /**
     * Returns the fibonacci sum for provided number
     *
     * @param number is the number to calculate fibonacci sum for
     * @return integer representing the sum
     * @throws IllegalArgumentException when parameter number is out of bounds.
     */
    @Override
    public int fib(int number) throws IllegalArgumentException {
        int result = 0;
        int first = 0;
        int second = 1;
        for (int i = 1; i < number; i++) {
            result = first + second;
            first = second;
            second = result;
            if (result < 0) {
                throw new IllegalArgumentException("Provided number will give an erroneous result.");
            }
        }

        return result;
    }

    /**
     * Returns the sum of all the positive and negative numbers
     * in provided String
     *
     * @param numbers is the string to extract numbers from
     * @return The sum of all numbers in String.
     */
    @Override
    public int sumString(String numbers) {
        int result = 0;
        Pattern pattern = Pattern.compile("(-?[0-9]+)");
        Matcher matcher = pattern.matcher(numbers);

        while (matcher.find()) {
            result += Integer.valueOf(matcher.group());
        }
        return result;
    }

    /**
     * Reverse an array
     *
     * @param ints is the array of ints to be reversed
     * @return reversed version of parameter ints
     */
    @Override
    public int[] reverseArray(int[] ints) {
        int length = ints.length;
        int[] result = new int[length];
        for (int val : ints) {
            // handle zero indexation by subtracting length before using it
            result[--length] = val;
        }
        return result;
    }

    /**
     * Will find the highest number in provided array of ints
     *
     * @param nums is an array of ints
     * @return the highest number in provided array of ints
     */
    @Override
    public int findHigh(int[] nums) {
        // Lets use a well proven implementation of sort in Arrays
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }


    /**
     * Will convert provided parameters into an hex String on the format #HEHEHE
     * where HE is an hexadecimal representation of an integer. Valid values for r,g,b is 0 - 255
     *
     * @param r is the first int to be converted to hex
     * @param g is the second int to be converted to hex
     * @param b is the third int to be converted to hex
     * @return Hex representation of r g b, as a String
     * @throws IllegalArgumentException if any parameter is not within bounds for converting from rgb to hex.
     */
    @Override
    public String rgbToHex(int r, int g, int b) {
        if (validateRgb(r) &&
                validateRgb(g) &&
                validateRgb(b)) {
            return String.format("#%02X%02X%02X", r, g, b); // Lets convert to Hex
        } else {
            throw new IllegalArgumentException(String.format("Bad input for converting to rgbHex, values %s, %s, %s. Valid values are from 0 - 255", r, g, b));
        }
    }

    /**
     * Validation of input values for rgbToHex method.
     *
     * @param value   The value to be validated
     * @return boolean telling if the provided value is valid for rgbToHex conversion
     */
    private boolean validateRgb(int value) {
        return (value >= 0 && value <= 255);
    }

}
