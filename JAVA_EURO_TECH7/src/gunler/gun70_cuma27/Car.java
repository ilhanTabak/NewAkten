package gunler.gun70_cuma27;

public class Car {

    private Engine engine;
    private Transmission transmission;
    private Steering steering;
    private int wheels;

    public Car(Engine engine, Transmission transmission, Steering steering, int wheels) {
        this.engine = engine;
        this.transmission = transmission;
        this.steering = steering;
        this.wheels = wheels;
    }

    public void drive(){

        engine.start();
        transmission.shiftGear(1);
        steering.turn(90);

        System.out.println("Driving with"+wheels+"wheels");

    }
}
