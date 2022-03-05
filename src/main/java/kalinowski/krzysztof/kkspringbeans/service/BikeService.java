package kalinowski.krzysztof.kkspringbeans.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BikeService implements VehicleService {

    Logger logger = LoggerFactory.getLogger(BikeService.class);

    @Override
    public void move() {
        logger.info("Bike move");
    }

    @Override
    public void stop() {
        logger.info("Bike stop");
    }
}
