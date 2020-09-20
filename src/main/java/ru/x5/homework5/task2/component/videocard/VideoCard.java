package ru.x5.homework5.task2.component.videocard;

public class VideoCard {
    private String producer;
    private VideoCardType type;
    private int memoryCapacity;
    private CoolingType coolingType;

    public VideoCard(String producer, VideoCardType type, int memoryCapacity, CoolingType coolingType) {
        this.producer = producer;
        this.type = type;
        this.memoryCapacity = memoryCapacity;
        this.coolingType = coolingType;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "producer='" + producer + '\'' +
                ", type=" + type +
                ", memoryCapacity=" + memoryCapacity +
                ", coolingType=" + coolingType +
                '}';
    }
}
