package com.example.hypermetro;


public class SinglyLinkedList<T> {

    Node<T> head;
    Node<T> tail;

    public void addNode(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            setHead(newNode);
        } else {
            tail.setNext(newNode);
        }
        setTail(newNode);
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
}