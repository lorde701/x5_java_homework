package ru.x5.homework5.task2.component.videocard;

public class VideoCardBuilder {
    private String producer;
    private VideoCardType type;
    private int memoryCapacity;
    private CoolingType coolingType;

    public VideoCardBuilder withProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public VideoCardBuilder withType(VideoCardType type) {
        this.type = type;
        return this;
    }

    public VideoCardBuilder withMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
        return this;
    }

    public VideoCardBuilder withCollingType(CoolingType coolingType) {
        this.coolingType = coolingType;
        return this;
    }

    public VideoCard build() {
        return new VideoCard(producer, type, memoryCapacity, coolingType);
    }
}
