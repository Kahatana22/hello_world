package main.java.modul9.Collections;

import java.util.Objects;
import java.util.StringJoiner;

public class MyHashMap<K, V> {

    static class Node<K, V> {
        int hash;
        K key;
        V value;
        Node<K, V> next;

        public Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public final int hashCode() {
            return Objects.hashCode(key);
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }
    }

    private Node<K, V>[] table;
    private static final int DEFAULT_CAPACITY = 16;
    public MyHashMap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        table = new Node[capacity];
    }

    public MyHashMap() {
        this(DEFAULT_CAPACITY);
    }

    public V put(K key, V value) {
        int backetKey;
        int h = 0;
        if (key == null) {
            for (int i = 0; i < table.length; i++) {
                if (table[i].key == null) {
                    table[i].value = value;
                }
            }
        } else {
            h = key.hashCode();
            h = h ^ (h >>> 16);
        }
        backetKey = h & (table.length - 1);
        Node node = table[backetKey];
        if (node == null) {
            table[backetKey] = new Node<>(h, key, value, null);
        } else {
            Node n = node;
            while (true) {
                if (n.hash == h && n.key.equals(key)) {
                    n.value = value;
                }
                if (n.next == null) {
                    n.next = new Node<>(h, key, value, null);
                } else {
                    n = n.next;
                }
            }
        }
        return (V) table;
    }

    public V remove(K key) {
        int backetKey;
        int h = 0;
        Node previosNode = null;
        if (key == null) {
            Node node = table[0];
            while (node != null) {
                if (node.key == null) {
                    if (previosNode != null) {
                        previosNode.next = node.next;
                    } else {
                        table[0] = node.next;
                    }
                } else {
                    previosNode = node;
                }
                node = node.next;
            }
        } else {
            h = key.hashCode();
            h = h ^ (h >>> 16);
        }
        backetKey = h & (table.length - 1);
        Node node = table[backetKey];
        if (node == null) {
        } else {
            while (true) {
                if (node.hash == h && node.key.equals(key)) {
                    if (previosNode != null) {
                        previosNode.next = node.next;
                    } else {
                        table[backetKey] = node.next;
                    }
                }
                if (node.next == null) {
                } else {
                    previosNode = node;
                    node = node.next;
                }
            }
        }
        return (V) table;
    }

    public int size() {
        int size = 0;
        for (Node node : table) {
            Node n = node;
            while (n != null) {
                size++;
            }
        }
        return size;
    }

    public V get(K key) {
        Object element = new Object();
        for (Node node : table) {
            Node n = node;
            while (n != null) {
                if (n.key == key) {
                    element = n.value;
                    return (V) element;
                } else {
                    return null;
                }
            }
        }
        return (V) element;
    }

    public void clear() {
        table = new Node[DEFAULT_CAPACITY];
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
