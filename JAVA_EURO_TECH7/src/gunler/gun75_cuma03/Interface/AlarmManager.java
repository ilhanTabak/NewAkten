package gunler.gun75_cuma03.Interface;

import java.util.ArrayList;

public class AlarmManager {


    public void inform(Alarm alarm,Sensor sensor){

        alarm.inform(sensor);


    }
    public void informList(ArrayList<Alarm>alarms,Sensor sensor){


        System.out.println("information ist gegeben");

        for(Alarm alarm:alarms){


            alarm.inform(sensor);
        }




    }
}
