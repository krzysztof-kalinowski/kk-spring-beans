package kalinowski.krzysztof.kkspringbeans.configuration;

import kalinowski.krzysztof.kkspringbeans.service.*;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Bean
    @Qualifier("bikeServiceConfiguration")
    VehicleService bikeServiceConfiguration() {
        return new BikeService();
    }

    @Bean
    @Qualifier("boatServiceConfiguration")
    VehicleService boatServiceConfiguration() {
        return new BoatService();
    }

}
