package kalinowski.krzysztof.kkspringbeans.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarService implements VehicleService {

    @Override
    public void move() {
        log.info("Car move");
    }

    @Override
    public void stop() {
        log.info("Car stop");
    }
}
