package ru.x5.homework6.task2;

import ru.x5.homework6.task2.fruit.Apple;
import ru.x5.homework6.task2.fruit.Orange;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем корзину с 2 апельсинами");
        Box<Orange> boxWithOrange = new Box<>(Arrays.asList(new Orange(), new Orange()));
        System.out.println("Создаем корзину с 2 яблоками");
        Box<Apple> boxWithApple = new Box<>(Arrays.asList(new Apple(), new Apple()));
        System.out.println("Вес корзины с яблоками: " + boxWithApple.getWeight());
        System.out.println("Вес корзины с апельсинами: " + boxWithOrange.getWeight());
        System.out.println("Сравниваем корзины " + boxWithApple.compare(boxWithOrange));
        System.out.println("Добавляем яблоко");
        boxWithApple.add(new Apple());
        System.out.println("Вес корзины с яблоками: " + boxWithApple.getWeight());
        System.out.println("Вес корзины с апельсинами: " + boxWithOrange.getWeight());
        System.out.println("Сравниваем корзины " + boxWithApple.compare(boxWithOrange));
        System.out.println("Создаем пустую корзину для яблок");
        Box<Apple> newBox = new Box<>();
        System.out.println("Перекладываем яблоки в новую корзину");
        boxWithApple.putInto(newBox);
        System.out.println("Вес новой корзины с яблоками: " + newBox.getWeight());
        System.out.println("Вес старой корзины с яблоками: " + boxWithApple.getWeight());
    }
}
