package kalinowski.krzysztof.kkspringbeans.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Qualifier("femaleHumanService")
public class FemaleHumanService implements HumanService {

    @Override
    public void breath() {
        log.info("Female breath");
    }
}
