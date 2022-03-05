package kalinowski.krzysztof.kkspringbeans.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RabbitService implements AnimalService {

    Logger logger = LoggerFactory.getLogger(RabbitService.class);

    @Override
    public void eat() {
        logger.info("Rabbit eat");
    }

    @Override
    public void sleep() {
        logger.info("Rabbit sleep");
    }
}
