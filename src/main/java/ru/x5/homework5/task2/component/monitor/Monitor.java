package ru.x5.homework5.task2.component.monitor;

import ru.x5.homework5.task2.component.Component;

public class Monitor implements Component {
    private final String model;

    public Monitor(String model) {
        this.model = model;
    }

    @Override
    public String getInfo() {
        return "Monitor{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Монитор работает");
    }
}
