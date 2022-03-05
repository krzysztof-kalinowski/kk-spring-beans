package kalinowski.krzysztof.kkspringbeans.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BearService implements AnimalService {

    Logger logger = LoggerFactory.getLogger(BearService.class);

    @Override
    public void eat() {
        logger.info("Bear eat");
    }

    @Override
    public void sleep() {
        logger.info("Bear sleep");
    }
}
