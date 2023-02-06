package gunler.gun75_cuma03.Interface;

public class UnitService implements Alarm{

    public void inform(Sensor sensor){


        System.out.println("Station die Alarm schickt  :"+sensor.getPlace());

        System.out.println("Information wurde gegeben");



    }


}
