package ru.x5.homework5.task2.component.drive;

import ru.x5.homework5.task2.component.Component;

public class Drive implements Component {
    private final String producer;
    private final int memoryCapacityMb;
    private final DriveType type;
    private final DriveFormFactor formFactor;

    public Drive(String producer, int memoryCapacityMb, DriveType type, DriveFormFactor formFactor) {
        this.producer = producer;
        this.memoryCapacityMb = memoryCapacityMb;
        this.type = type;
        this.formFactor = formFactor;
    }

    @Override
    public String getInfo() {
        return "Drive{" +
                "producer='" + producer + '\'' +
                ", memoryCapacityMb=" + memoryCapacityMb +
                ", type=" + type +
                ", formFactor=" + formFactor +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Диск начала работать");
    }
}
