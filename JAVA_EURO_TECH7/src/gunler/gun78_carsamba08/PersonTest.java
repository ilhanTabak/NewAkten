package gunler.gun78_carsamba08;

import java.util.Scanner;

public class PersonTest {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int age = 0;
        Person person = null;
        try {
            person = new Person("Ahmet",25,"Adres");
            System.out.println(person);

        }catch (AgeException ageException){
            System.err.println(ageException.getMessage());
        }
        catch (NameException nameException){
            System.out.println(nameException.getMessage());
        }


        boolean devam = true;
        while (devam){
            System.out.print("Yaş bilgisini giriniz : ");
            try {
                person.setAge(Integer.parseInt(scanner.nextLine())); //Checked exception fırlattığından setAge() metodunu kullananlar handling mekanızması yapmak zorundalar.
                devam = false;
            }catch (AgeException ageException){
                System.err.println(ageException.getMessage());
            }
        }

        devam = true;
        while (devam) {
            System.out.print("İsim bilgisini giriniz : ");
            try {
                person.setName(scanner.nextLine()); //Checked exception fırlattığından setName() metodunu kullananlar handling mekanızması yapmak zorundalar.
                devam = false;
            } catch (NameException nameException) {
                System.out.println(nameException.getMessage());
            }
        }

        //setAddress() metodu unchecked exception fırllattığından bu metodu kullananlar handling mekanızması yapmak zorunda değiller.
        System.out.print("Adres bilgisini giriniz : ");
        person.setAddress(scanner.nextLine());

        System.out.println(person);
    }
}