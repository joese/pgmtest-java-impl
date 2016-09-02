package com.pierceecom.pgmtest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Implementation of Stack
 *
 * @author Joel Sewing
 * @param <T>
 */
public class StackImpl<T> implements Stack<T> {

    private final Deque<T> data;

    public StackImpl() {
        data = new ArrayDeque<>();
    }

    /**
     * Adds an item to the stack
     *
     * @param item to be added
     */
    @Override
    public void push(T item) {
        data.add(item);
    }

    /**
     * Pops an element from the stack
     *
     * @return T
     */
    @Override
    public T pop() {
        return data.removeLast();
    }

    /**
     * Checks if the stack is empty
     *
     * @return boolean true if the stack is empty
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Returns the size of elements on the stack
     * @return the size of elements
     */
    @Override
    public int size() {
        return data.size();
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
        return data.descendingIterator();
    }

}
