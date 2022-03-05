package kalinowski.krzysztof.kkspringbeans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleTestService {

    VehicleService vehicleService;

    @Autowired
    public VehicleTestService(@Qualifier("bikeServiceConfiguration") VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }


    public void testQualifierBike() {
        vehicleService.move();
        vehicleService.stop();
    }
}
