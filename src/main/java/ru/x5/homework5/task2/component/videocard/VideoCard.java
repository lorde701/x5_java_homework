package ru.x5.homework5.task2.component.videocard;

import ru.x5.homework5.task2.component.Component;

public class VideoCard implements Component {
    private final String producer;
    private final VideoCardType type;
    private final int memoryCapacity;
    private final CoolingType coolingType;

    public VideoCard(String producer, VideoCardType type, int memoryCapacity, CoolingType coolingType) {
        this.producer = producer;
        this.type = type;
        this.memoryCapacity = memoryCapacity;
        this.coolingType = coolingType;
    }

    @Override
    public String getInfo() {
        return "VideoCard{" +
                "producer='" + producer + '\'' +
                ", type=" + type +
                ", memoryCapacity=" + memoryCapacity +
                ", coolingType=" + coolingType +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Видеокарта работает");
    }
}
