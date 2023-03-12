package gunler.gun73_carsamba01.Weichle;

public class WeichleTest {

    public static void main(String[] args) {


        Plane plane=new Plane();
        plane.color="mavi";
        plane.reifen=8;

        Car car=new Car();
        car.color="beyaz";
        car.reifen=4;

        MotorBike motorBike=new MotorBike();
        motorBike.color="sari";
        motorBike.reifen=2;

        plane.drive();
        plane.color(car.color);




    }
}
