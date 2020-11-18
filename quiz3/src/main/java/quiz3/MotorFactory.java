package quiz3;


import org.springframework.stereotype.Component;

@Component
public class MotorFactory {

    public Motor produceMotor(String type) {
        if (type.equals("electric")) {
            return new ElectricMotor();
        } else if (type.equals("diesel")) {
            return new DieselMotor();
        } else {
            return new PetrolMotor();
        }

    }

}
