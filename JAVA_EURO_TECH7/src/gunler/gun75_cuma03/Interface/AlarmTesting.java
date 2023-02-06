package gunler.gun75_cuma03.Interface;

import java.util.ArrayList;

public class AlarmTesting {


    public static void main(String[] args) {

        System.out.println("Alarm System ver.1.0");
        System.out.println("---------------------");

        AlarmManager alarmManager=new AlarmManager();

        Sensor sensor1=new Sensor("abc Platz");

        alarmManager.inform(new Feuerwehr(),sensor1);
        alarmManager.inform(new Polizei(),sensor1);
        alarmManager.inform(new ErsteHilfe(),sensor1);


        System.out.println("-----------------------");

        ArrayList<Alarm>alarms=new ArrayList<>();

        alarms.add(new Polizei());
        alarms.add(new Feuerwehr());


        alarmManager.informList(alarms,sensor1);


    }



}
