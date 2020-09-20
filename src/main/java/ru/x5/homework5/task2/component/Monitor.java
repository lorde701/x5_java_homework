package ru.x5.homework5.task2.component;

public class Monitor {
    private String model;

    public Monitor(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                '}';
    }
}
