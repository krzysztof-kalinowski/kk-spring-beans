package kalinowski.krzysztof.kkspringbeans.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("femaleHumanService")
public class FemaleHumanService implements HumanService {

    Logger logger = LoggerFactory.getLogger(FemaleHumanService.class);

    @Override
    public void breath() {
        logger.info("Female breath");
    }
}
