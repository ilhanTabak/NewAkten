package gunler.gun76_pazartesi04;

public class WorkerCanDrive extends Worker{

    public WorkerCanDrive(String name, int age, String department) {
        super(name, age, department);
    }



    public void drive(){


        System.out.println("ich kann fahren");
    }
}
