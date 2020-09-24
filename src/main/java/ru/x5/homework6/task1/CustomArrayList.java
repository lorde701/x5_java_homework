package ru.x5.homework6.task1;

import java.util.Objects;

public class CustomArrayList<E> implements CustomList<E> {
    private final int ARRAY_SIZE = 16;
    private Object[] array;
    private int lastIndex = 0;


    public CustomArrayList() {
        array = new Object[ARRAY_SIZE];
    }

    @Override
    public int size() {
        return lastIndex;
    }

    @Override
    public void add(E item) {
        if (array.length < lastIndex) {
            Object[] tempArray = new Object[array.length + ARRAY_SIZE];
            System.arraycopy(array, 0, tempArray, 0, array.length);
            array = tempArray;
        }
        array[lastIndex++] = item;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < lastIndex - 1; i++) {
            array[i] = array[i + 1];
        }
        lastIndex--;
    }

    @Override
    public void remove(E item) {
        for(int i = 0; i < lastIndex; i++) {
            if (Objects.equals(item, array[i])) {
                remove(i);
            }
        }
    }

    @Override
    public E get(int index) {
        if (index >= lastIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) array[index];
    }

    @Override
    public void clear() {
        array = new Object[ARRAY_SIZE];
        lastIndex = 0;
    }

    @Override
    public void printElements() {
        System.out.print("{");
        for( int i = 0; i < lastIndex; i++) {
            System.out.print(array[i]);
            if (i != lastIndex - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
