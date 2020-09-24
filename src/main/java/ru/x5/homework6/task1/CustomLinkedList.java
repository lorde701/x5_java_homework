package ru.x5.homework6.task1;

import java.util.Objects;

public class CustomLinkedList<E> implements CustomList<E> {

    private Node<E> first = null;
    private Node<E> last = null;
    private int size;

    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E item) {
        if (first == null) {
            Node<E> node = new Node<>(item, null, null);
            first = node;
            last = node;
        } else {
            Node<E> node = new Node<>(item, last, null);
            last.next = node;
            last = node;
        }
        size++;
    }


    @Override
    public void remove(int index) {
        Node<E> current = first;
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }
        removeCurrent(current);
    }

    @Override
    public void remove(E item) {
        Node<E> current = first;
        while (current !=null && !Objects.equals(current.element, item)) {
            current = current.next;
        }
        if (current != null) {
            removeCurrent(current);
        }
    }

    @Override
    public E get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node current = first;
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }
        return (E) current.element;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public void printElements() {
        Node<E> current = first;
        System.out.print("{");
        while (current != null) {
            System.out.print(current.element);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("}");
    }

    private void removeCurrent(Node<E> item) {
        if (item.prev == null && item.next == null) {
            first = null;
            last = null;
        } else if (item.prev == null) {
            item.next.prev = null;
        } else if (item.next == null) {
            item.prev.next = null;
        } else {
            item.prev.next = item.next.prev;
            item.next.prev = item.prev.next;
        }
        size--;
    }
}
