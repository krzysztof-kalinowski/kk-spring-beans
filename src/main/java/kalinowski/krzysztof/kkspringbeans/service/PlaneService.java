package kalinowski.krzysztof.kkspringbeans.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlaneService implements VehicleService {


    @Override
    public void move() {
        log.info("Plane move");
    }

    @Override
    public void stop() {
        log.info("Plane stop");
    }
}
