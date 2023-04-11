package main.java.modul9.Collections;

import java.util.StringJoiner;

public class MyHashMap<K, V> {

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node( K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<K, V>[] table;
    private static final int DEFAULT_CAPACITY = 16;
    private int size;

    public MyHashMap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        table = new Node[capacity];
    }

    public MyHashMap() {
        this(DEFAULT_CAPACITY);
    }

    private int hash(K key) {
        return hashCode() % table.length;
    }

    public void put(K key, V value) {
        int element = hash(key);
        Node<K, V> node = table[element];
        Node<K, V> newNode = new Node<>(key, value);

        if (node == null) {
            table[element] = newNode;
        } else {
            Node<K, V> prev = node;
            while (node != null) {
                if (key == null || node.key.equals(key)) {
                    node.value = value;
                }
                prev = node;
                node = node.next;
            }
            prev.next = newNode;
        }
        size++;
    }

    public V remove(K key) {
        int element = hash(key);
        Node<K, V> node = table[element];

        if (node != null) {
            if (key == null || node.key.equals(key)) {
                table[element] = node.next;
                size--;
                return node.value;
            }
            while (node.next != null) {
                if (node.next.key.equals(key)) {
                    node.next = node.next.next;
                    size--;
                    return node.value;
                }
                node = node.next;
            }
        }
        return null;
    }

    public void clear() {
        size = 0;
        table = new Node[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int element = hash(key);
        Node<K, V> node = table[element];

        while (node != null) {
            if (key == null || node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    @Override
    public String toString() {
        StringJoiner builder = new StringJoiner(" ");
        for (Node node : table) {
            Node n = node;
            while (n != null) {
                builder.add("{key:" + n.key + ",value:" + n.value + "}");
                n = n.next;
            }
        }
        return builder.toString();
    }
}
