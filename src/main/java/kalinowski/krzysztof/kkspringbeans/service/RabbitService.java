package kalinowski.krzysztof.kkspringbeans.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RabbitService implements AnimalService {


    @Override
    public void eat() {
        log.info("Rabbit eat");
    }

    @Override
    public void sleep() {
        log.info("Rabbit sleep");
    }
}
