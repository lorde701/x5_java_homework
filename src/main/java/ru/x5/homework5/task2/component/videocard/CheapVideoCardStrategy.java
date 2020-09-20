package ru.x5.homework5.task2.component.videocard;

public class CheapVideoCardStrategy implements VideoCardStrategy {
    @Override
    public VideoCard getVideoCard() {
        return new VideoCardBuilder()
                .withType(VideoCardType.GDDR5)
                .withCollingType(CoolingType.ACTIVE)
                .withMemoryCapacity(4096)
                .withProducer("Palit")
                .build();
    }
}
