package kalinowski.krzysztof.kkspringbeans.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoatService implements VehicleService {

    Logger logger = LoggerFactory.getLogger(BoatService.class);

    @Override
    public void move() {
        logger.info("Boat move");
    }

    @Override
    public void stop() {
        logger.info("Boat stop");
    }
}
