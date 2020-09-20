package ru.x5.homework5.task2.component;

public class Processor {
    private String name;
    private long clockSpeedMHz;
    private int numberOfCores;
    private int cacheMb;
    private String producer;

    public Processor(String name, long clockSpeedMHz, int numberOfCores, int cacheMb, String producer) {
        this.name = name;
        this.clockSpeedMHz = clockSpeedMHz;
        this.numberOfCores = numberOfCores;
        this.cacheMb = cacheMb;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", clockSpeedMHz=" + clockSpeedMHz +
                ", numberOfCores=" + numberOfCores +
                ", cacheMb=" + cacheMb +
                ", producer='" + producer + '\'' +
                '}';
    }
}
