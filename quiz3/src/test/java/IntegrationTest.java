import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import quiz3.*;

public class IntegrationTest {
    private CarFactory carFactory;
    private MotorFactory motorFactory;
    private String type;
    private String type1;
    private String type2;


    @Test
    public void test() {
        type = "electric";
        motorFactory = new MotorFactory();
        Assertions.assertEquals(motorFactory.produceMotor(type).getPolutionCategory(), PolutionCategory.LOW);

        type1 = "diesel";
        motorFactory = new MotorFactory();
        Assertions.assertEquals(motorFactory.produceMotor(type1).getPolutionCategory(), PolutionCategory.HIGH);


        type2 = "petrol";
        motorFactory = new MotorFactory();
        Assertions.assertEquals(motorFactory.produceMotor(type2).getPolutionCategory(),PolutionCategory.MEDIUM);
    }
}
