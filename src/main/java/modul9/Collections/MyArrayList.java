package main.java.modul9.Collections;

import java.util.Objects;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        elements = new Object[capacity];
    }

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public void add(T element) {
        resizeIdNeeded();
        elements[size] = element;
        size++;
    }
    private void resizeIdNeeded() {
        if (elements.length == size) {
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) elements[index];
    }
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement = (T) elements[index];
        System.arraycopy(elements, index+1, elements, index, size - index - 1);
        elements[size - 1] = null;
        size--;
        return removedElement;
    }
    public int size() {
        return size;
    }
    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void print() {
        for (Object elem : elements) {
            System.out.print(elem + " ");
        }
    }
}
