package com.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    public void add(T value) {
        Node<T> newNode = new Node<T>();
        newNode.data = value;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }
    public void show() {
        Node<T> node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    public void addAtStart(T value) {
        Node<T> newNode = new Node<>();
        newNode.data = value;
        newNode.next = head;
        head = newNode;
    }
    public void addAtIndex(int index, T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if (index == 0) {
            addAtStart(data);
        } else {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
    }
    public void pop() {
        if (null != head) {
            Node<T> newHead = head.next;
            head = newHead;
        }
    }
    public void popLast() {
        Node<T> tail = head;
        Node<T> prevNode = head;
        while (tail.next != null) {
            prevNode = tail;
            tail = tail.next;
        }
        prevNode.next = null;
    }

}