package ru.x5.homework5.task2.component.videocard;

import ru.x5.homework5.task2.CustomIllegalArgumentException;
import ru.x5.homework5.task2.component.ComponentType;

public class VideoCardFactory {
    public VideoCard getVideoCard(ComponentType type) {
        switch (type) {
            case IMPROVED:
                new VideoCardBuilder()
                        .withType(VideoCardType.GDDR6)
                        .withCollingType(CoolingType.ACTIVE)
                        .withMemoryCapacity(16384)
                        .withProducer("Gigabyte")
                        .build();
            case BASED:
                return new VideoCardBuilder()
                        .withType(VideoCardType.GDDR5)
                        .withCollingType(CoolingType.ACTIVE)
                        .withMemoryCapacity(4096)
                        .withProducer("Palit")
                        .build();
        }
        throw new CustomIllegalArgumentException("Не выбран тип видеокарты");
    }
}
