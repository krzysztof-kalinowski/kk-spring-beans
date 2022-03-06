package kalinowski.krzysztof.kkspringbeans.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BikeService implements VehicleService {

    @Override
    public void move() {
        log.info("Bike move");
    }

    @Override
    public void stop() {
        log.info("Bike stop");
    }
}
