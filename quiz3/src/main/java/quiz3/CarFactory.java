package quiz3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarFactory {
    private MotorFactory motorFactory;

    @Autowired
    public CarFactory(MotorFactory motorFactory) {
        this.motorFactory = motorFactory;
    }

    public Car createCar(String type){
        if (type.equals("electric")) {
            return new Car(new ElectricMotor(),"Electric Car");
        } else if (type.equals("diesel")) {
            return new Car(new DieselMotor(),"Diesel Car");
        } else {
            return new Car(new PetrolMotor(),"Petrol Car");
        }
    }

}
