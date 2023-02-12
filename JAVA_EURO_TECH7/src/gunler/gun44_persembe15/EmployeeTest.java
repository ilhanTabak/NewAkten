package gunler.gun44_persembe15;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeTest {

    public static void main(String[] args) {

       /* Employee employee1=new Employee("John","Müller",1500);

        Employee employee2=new Employee("Hans","Günter",1800);


        System.out.println(employee1.getSalary());
        System.out.println(employee2.getSalary());


        System.out.println(employee1.zamliMaas(employee1.getSalary()));
        System.out.println(employee2.zamliMaas(employee2.getSalary()));*/

        Date date=new Date();
        System.out.println(date.toString());


        Date simdikiZaman = new Date();
        System.out.println(simdikiZaman.toString());
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(df.format(simdikiZaman));


    }
}
