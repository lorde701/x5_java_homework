package ru.x5.homework5.task2.component.memory;

import ru.x5.homework5.task2.component.Component;

public class Memory implements Component {
    private final String producer;
    private final int capacityMb;
    private final int frequency;
    private final MemoryType type;

    public Memory(String producer, int capacityMb, int frequency, MemoryType type) {
        this.producer = producer;
        this.capacityMb = capacityMb;
        this.frequency = frequency;
        this.type = type;
    }

    @Override
    public String getInfo() {
        return "Memory{" +
                "producer='" + producer + '\'' +
                ", capacityMb=" + capacityMb +
                ", frequency=" + frequency +
                ", type=" + type +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Память начала работать");
    }
}
