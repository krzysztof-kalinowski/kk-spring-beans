package kalinowski.krzysztof.kkspringbeans.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BearService implements AnimalService {

    @Override
    public void eat() {
        log.info("Bear eat");
    }

    @Override
    public void sleep() {
        log.info("Bear sleep");
    }
}
