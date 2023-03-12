package gunler.gun12_sali1;

import java.util.Scanner;

public class Java_while_loop {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        String name=" ";

        while(name.isBlank()){


            System.out.print("enter your name:");

            name= scan.nextLine();





        }

        System.out.println("hello "+name);
    }



}
