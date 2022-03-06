package kalinowski.krzysztof.kkspringbeans.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Primary
public class MaleHumanService implements HumanService {


    @Override
    public void breath() {
        log.info("Male breath");
    }
}
