package org.exercicios.AP2;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeFromBeginning() {
        if (head == null) {
            System.out.println("A lista está vazia.");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeFromEnd() {
        if (tail == null) {
            System.out.println("A lista está vazia.");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public int getValueAtPosition(int position) {
        if (head == null || position < 0) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }

        Node current = head;
        for (int i = 0; i < position; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Posição inválida.");
            }
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }

        return current.data;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printReverseList() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
