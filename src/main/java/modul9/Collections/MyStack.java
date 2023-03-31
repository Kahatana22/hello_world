package main.java.modul9.Collections;

import java.util.Arrays;

public class MyStack<E> {
    private int size;
    private Object[] array;
    private int top;

    public MyStack(int s) {
        size = s;
        array = new Object[size];
        top = -1;
    }

    public void push(Object element) {
        int i = ++top;
        array[i] = element;
    }

    public Object remove(int index) {
        if (array == null || index < 0 || index >= size) {
            return array;
        }
        Object[] result = new Object[size - 1];
        System.arraycopy(array, 0, result, 0, index);
        System.arraycopy(array, index + 1, result, index, size - index -1);
        System.out.println("result = " + Arrays.toString(result));
        size--;
        array = result;
        return array;
    }

    public void clear() {
        size = 0;
        array = null;
    }

    public int  size() {
        return size;
    }

    public Object peek() {
        if (top == -1) {
            return 0;
        } else {
            return array[top];
        }
    }

    public Object pop() {
        if (top == -1) {
            return 0;
        } else {
            size--;
            return array[top--];
        }
    }
    public void print() {
        for (Object elem : array) {
            System.out.print(elem + " ");
        }
    }
}

