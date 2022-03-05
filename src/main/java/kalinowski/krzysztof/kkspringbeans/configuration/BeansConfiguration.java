package kalinowski.krzysztof.kkspringbeans.configuration;

import kalinowski.krzysztof.kkspringbeans.service.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeansConfiguration {


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
    @ConditionalOnProperty(value = "animal.service.mode", havingValue = "bear", matchIfMissing = false)
    AnimalService bearServiceConfiguration() {
        return new BearService();
    }

    @Bean
    @ConditionalOnProperty(value = "animal.service.mode", havingValue = "rabbit", matchIfMissing = true)
    AnimalService rabbitServiceConfiguration() {
        return new RabbitService();
    }



}
