package gunler.gun62_carsamba18;

public class VehicleTesst {

    public static void main(String[] args) {


        Car car1=new Car();
        car1.name="Toyota";
        car1.move();

        System.out.println(car1.name);

        Plane plane1=new Plane();
        plane1.name="Mazda";

        System.out.println(plane1.name);

        plane1.move();




    }
}
