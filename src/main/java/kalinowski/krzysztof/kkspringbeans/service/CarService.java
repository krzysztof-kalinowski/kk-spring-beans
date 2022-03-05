package kalinowski.krzysztof.kkspringbeans.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService implements VehicleService {

    Logger logger = LoggerFactory.getLogger(CarService.class);

    @Override
    public void move() {
        logger.info("Car move");
    }

    @Override
    public void stop() {
        logger.info("Car stop");
    }
}
