package gunler.gun83_carsamba15.OOP.InheritancePacket;

public class TestClass {
    public static void main(String[] args) {


        Son son = new Son(45, 125, "Huseyin", 25, "Male", 41);



        son.altRechner();
        System.out.println(son.name);

        System.out.println(son.toString());

        son.name="hakki";

        System.out.println(son.toString());


    }
}