package kalinowski.krzysztof.kkspringbeans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleTestService {

    private final VehicleService vehicleService;
    private final AnimalService animalService;
    private final HumanService humanService;

    @Autowired
    public VehicleTestService(@Qualifier("bikeServiceConfiguration") VehicleService vehicleService,
                              AnimalService vehicleService2,
                              @Qualifier("femaleHumanService") HumanService humanService) {
        this.vehicleService = vehicleService;
        this.animalService = vehicleService2;
        this.humanService = humanService;
    }

    public void testQualifierBike() {
        vehicleService.move();
        vehicleService.stop();
    }

    public void testConditionalOnPropertyAnimal() {
        animalService.eat();
        animalService.sleep();
    }

    public void anotherQualifierTestOnHuman(){
        humanService.breath();
    }

}
