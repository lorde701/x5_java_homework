package ru.x5.homework5.task2.component.videocard;

public class ExpensiveVideoCardStrategy implements VideoCardStrategy {
    @Override
    public VideoCard getVideoCard() {
        return new VideoCardBuilder()
                .withType(VideoCardType.GDDR6)
                .withCollingType(CoolingType.ACTIVE)
                .withMemoryCapacity(16384)
                .withProducer("Gigabyte")
                .build();
    }
}
