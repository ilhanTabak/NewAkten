package gunler.gun83_carsamba15.OOP.EncapculationPacket;

public class EncapsulationTest {

    public static void main(String[] args) {

        Encapsulation enc=new Encapsulation("John",25);

        System.out.println(enc.NameUppercase());

        System.out.println(enc.getAge());
        enc.setName("Hasan");
        System.out.println(enc.getName());
        System.out.println(enc.toString());


    }
}
