package ru.x5.homework5.task2.computer;

import ru.x5.homework5.task2.component.Component;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private final List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    public void start() {
        components.forEach(Component::start);
    }

    public void getInfo() {
        System.out.println("-----Информация о компьютере-----");
        components.forEach(comp -> System.out.println(comp.getInfo()));
        System.out.println("---------------------------------");
    }
}
