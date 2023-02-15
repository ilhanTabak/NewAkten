package gunler.gun83_carsamba15.OOP.InheritancePacket;

public class GrandFather {

    String name;
    int age;


    public GrandFather(String name,int age){

        this.name=name;
        this.age=age;
    }




    public void istAgeGross(int age){

        if(age>18){

            System.out.println("Sie sind Alt");
        }
    }






}
