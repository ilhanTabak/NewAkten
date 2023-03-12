package gunler.gun59_cuma13;


import java.util.ArrayList;
import java.util.Arrays;

public class JobTest {


    public static void main(String[] args) {

        Job job1=new Job("ali","ali",6000);
        Job job2=new Job("Developer","apple",7000);
        Job job3=new Job("sdet","google",10000);
        Job job4=new Job("ayse","vestel",3000);
        Job job5=new Job("selim","sony",60000);


        ArrayList<Job> isler=new ArrayList<>(Arrays.asList(job1,job2,job3,job4,job5));


        System.out.println(isler.toString());


            double max=Double.MIN_VALUE;

        for (int i = 0; i <isler.size() ; i++) {


            if(isler.get(i).getSalary()>max){

                max=isler.get(i).getSalary();

            }



        }

        System.out.println(max);



        }






    }

