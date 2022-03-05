package kalinowski.krzysztof.kkspringbeans.configuration;

import kalinowski.krzysztof.kkspringbeans.service.CarService;
import kalinowski.krzysztof.kkspringbeans.service.PlaneService;
import kalinowski.krzysztof.kkspringbeans.service.VehicleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MainConfiguration {


    @Bean
    VehicleService carServiceConfiguration() {
        return new CarService();
    }

    @Bean
    @Primary
    VehicleService planeServiceConfiguration() {
        return new PlaneService();
    }
}
