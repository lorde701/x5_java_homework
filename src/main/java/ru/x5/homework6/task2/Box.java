package ru.x5.homework6.task2;

import ru.x5.homework6.task2.fruit.Apple;
import ru.x5.homework6.task2.fruit.Fruit;
import ru.x5.homework6.task2.fruit.Orange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public Box() {
    }

    public Box(List<T> fruits) {
        this.fruits.addAll(fruits);
    }

    public List<T> getFruits() {
        return fruits;
    }

    private Map<Class, Float> fruitCost = new HashMap<Class, Float>() {{
       put(Orange.class, 1.5f);
       put(Apple.class, 1.0f);
    }};

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void putInto(final Box<T> anotherBox) {
        fruits.forEach(anotherBox::add);
        fruits.clear();
    }

    public double getWeight() {
        if (fruits.size() == 0) {
            return 0;
        }
        Float cost = fruitCost.get(fruits.get(0).getClass());
        if (cost == null) {
            throw new IllegalArgumentException("Для данного типа не определена стоимость");
        }
        return cost * fruits.size();
    }

    public boolean compare(Box anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }
}
