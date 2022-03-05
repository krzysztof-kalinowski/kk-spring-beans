package kalinowski.krzysztof.kkspringbeans;

import kalinowski.krzysztof.kkspringbeans.service.CarService;
import kalinowski.krzysztof.kkspringbeans.service.VehicleService;
import kalinowski.krzysztof.kkspringbeans.service.VehicleTestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KkSpringBeansApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(KkSpringBeansApplication.class, args);

        VehicleService vehicle = context.getBean(VehicleService.class); //Using @Primary
        vehicle.move();
        vehicle.stop();

        VehicleService vehicle2 = context.getBean(CarService.class); // Using specific class
        vehicle2.move();
        vehicle2.stop();


        VehicleTestService vehicleTestService = context.getBean(VehicleTestService.class);
        vehicleTestService.testQualifierBike(); //Using Qualifier
        vehicleTestService.testConditionalOnPropertyBear(); //Using ConditionalOnProperty

    }

}
