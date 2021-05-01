package com.example.hypermetro.list;


public class Node<T> {

    private T data;
    private com.example.hypermetro.list.Node<T> previous;
    private com.example.hypermetro.list.Node<T> next;

    public Node(T data, com.example.hypermetro.list.Node<T> previous, com.example.hypermetro.list.Node<T> next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public boolean hasPrevious() {
        return previous != null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public com.example.hypermetro.list.Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(com.example.hypermetro.list.Node<T> previous) {
        this.previous = previous;
    }

    public com.example.hypermetro.list.Node<T> getNext() {
        return next;
    }

    public void setNext(com.example.hypermetro.list.Node<T> next) {
        this.next = next;
    }
}