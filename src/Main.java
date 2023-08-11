import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(300, "V6");
        System.out.println(engine);
        Driver driver = new Driver(25, "Oleg", 2);
        System.out.println(driver);
        Car zhiguli = new Car("trash", engine, driver, "baklazhan");
        zhiguli.start();
        zhiguli.turnRight();
        zhiguli.turnRight();
        zhiguli.turnLeft();
        zhiguli.stop();
    }
}