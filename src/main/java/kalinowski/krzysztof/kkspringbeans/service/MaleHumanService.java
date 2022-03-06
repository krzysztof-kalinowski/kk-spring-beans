package kalinowski.krzysztof.kkspringbeans.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MaleHumanService implements HumanService {

    Logger logger = LoggerFactory.getLogger(MaleHumanService.class);

    @Override
    public void breath() {
        logger.info("Male breath");
    }
}
