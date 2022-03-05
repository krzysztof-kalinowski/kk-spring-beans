package kalinowski.krzysztof.kkspringbeans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleTestService {

    VehicleService vehicleService;
    AnimalService animalService;

    @Autowired
    public VehicleTestService(@Qualifier("bikeServiceConfiguration") VehicleService vehicleService, AnimalService vehicleService2) {
        this.vehicleService = vehicleService;
        this.animalService = vehicleService2;
    }

    public void testQualifierBike() {
        vehicleService.move();
        vehicleService.stop();
    }

    public void testConditionalOnPropertyAnimal() {
        animalService.eat();
        animalService.sleep();
    }


}
