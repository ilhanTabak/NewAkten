package gunler.gun70_cuma27;

public class CarTest {

    public static void main(String[] args) {


        Engine engine=new Engine(180);
        Transmission transmission=new Transmission(5);
        Steering steering=new Steering(30);

        Car car=new Car(engine,transmission,steering,4);

        car.drive();
    }
}
