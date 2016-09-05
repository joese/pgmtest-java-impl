package com.pierceecom.pgmtest;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Implementation of Stack
 *
 * @author Joel Sewing
 * @param <T>
 */
public class StackImpl<T> implements Stack<T> {

    private final static int INITIAL_SIZE = 16;

    // Holding the amount of elements on stack
    private int counter = 0;

    // The data structure to be used
    private T[] data;

    /**
     * Adds an item to the stack
     *
     * @param item to be added
     */
    @SuppressWarnings("unchecked")
    @Override
    public void push(T item) {
        if (data == null) {
            data = (T[]) new Object[INITIAL_SIZE];
        } else if (data.length == counter) {
            int newSize = data.length * 2; // Possible int overflow, would reach OutOfMemoryException before overflow
            data = copyOf(newSize, data);
        }
        
        data[counter++] = item;
    }

    /**
     * Creating a new copy of T array with provided size
     *
     * @param data    to copy
     * @param newSize of the returned array
     * @return new array of type T with a capacity of newSize
     * containing the elements from the parameter data
     */
    @SuppressWarnings("unchecked")
    private T[] copyOf(final int newSize, final T... data) {
        // Not using System.arraycopy or Array.copyOf
        // they might be considered as members of Java Standard Lib
        T[] newData = (T[]) new Object[newSize];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        return newData;
    }

    /**
     * Pops an element from the stack
     *
     * @return T
     */
    @Override
    public T pop() {
        if (counter == 0 || data == null) {
            throw new NoSuchElementException("No element found");
        }
        return data[--counter];
    }

    /**
     * Checks if the stack is empty
     *
     * @return boolean true if the stack is empty
     */
    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    /**
     * Returns the size of elements on the stack
     * @return the size of elements
     */
    @Override
    public int size() {
        return counter;
    }

    /**
     * Returns an iterator to this stack that iterates through the items in LIFO
     * order.
     *
     * @return an iterator to this stack that iterates through the items in LIFO
     * order
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int position = counter;

            @Override
            public boolean hasNext() {
                return position > 0;
            }

            @Override
            public T next() {
                return data[--position];
            }
        };
    }
}
