package main.java.modul9.Collections;

public class MyQueue<T> {
    static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }
    private Node<T> first;
    private Node<T> last;
    private int size;

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (size == 0) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        first = last = null;
        size = 0;
    }

    public T peek() {
        if (first == null) {
            return null;
        }
        T element = first.element;
        return element;
    }

    public  T poll() {
        if (first == null) {
            return null;
        }
        T element = first.element;
        first = first.next;
        if (first == null) {
            last = null;
        }
        size--;
        return element;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }
}
