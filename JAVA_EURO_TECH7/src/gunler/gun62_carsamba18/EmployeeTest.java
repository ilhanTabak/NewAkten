package gunler.gun62_carsamba18;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.name="Ahmet";
        employee1.employeeId=12345;

        System.out.println(employee1.name);
        System.out.println(employee1.employeeId);

        Developer dev1=new Developer();
        dev1.name="Ali";
        dev1.employeeId=1238;
        dev1.projectName="Chip";

        System.out.println(dev1.name);
        System.out.println(dev1.employeeId);
        System.out.println(dev1.projectName);

        Lawyer law1=new Lawyer();
        law1.name="Murat";
        law1.caseStatus="Open";

        System.out.println(law1.name);
        System.out.println(law1.caseStatus);

        Secretery sec1=new Secretery();
        sec1.officeName="Fatma";
        sec1.name="Gamze";

        sec1.leaveHoliday();
        sec1.giveReport();


    }
}
