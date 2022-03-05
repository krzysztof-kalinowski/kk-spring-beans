package kalinowski.krzysztof.kkspringbeans.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlaneService implements VehicleService {

    Logger logger = LoggerFactory.getLogger("PlaneService");

    @Override
    public void move() {
        logger.info("Plane move");
    }

    @Override
    public void stop() {
        logger.info("Plane stop");
    }
}
