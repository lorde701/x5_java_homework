package ru.x5.homework5.task2.component.drive;

public class Drive {
    private String producer;
    private int memoryCapacityMb;
    private DriveType type;
    private DriveFormFactor formFactor;

    public Drive(String producer, int memoryCapacityMb, DriveType type, DriveFormFactor formFactor) {
        this.producer = producer;
        this.memoryCapacityMb = memoryCapacityMb;
        this.type = type;
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "Drive{" +
                "producer='" + producer + '\'' +
                ", memoryCapacityMb=" + memoryCapacityMb +
                ", type=" + type +
                ", formFactor=" + formFactor +
                '}';
    }
}
