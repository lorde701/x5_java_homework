package ru.x5.homework5.task2.component.memory;

public class Memory {
    private String producer;
    private int capacityMb;
    private int frequency;
    private MemoryType type;

    public Memory(String producer, int capacityMb, int frequency, MemoryType type) {
        this.producer = producer;
        this.capacityMb = capacityMb;
        this.frequency = frequency;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "producer='" + producer + '\'' +
                ", capacityMb=" + capacityMb +
                ", frequency=" + frequency +
                ", type=" + type +
                '}';
    }
}
