package kalinowski.krzysztof.kkspringbeans;

import kalinowski.krzysztof.kkspringbeans.service.VehicleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KkSpringBeansApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(KkSpringBeansApplication.class, args);

        VehicleService vehicle = context.getBean(VehicleService.class);
        vehicle.move();
        vehicle.stop();
    }

}
