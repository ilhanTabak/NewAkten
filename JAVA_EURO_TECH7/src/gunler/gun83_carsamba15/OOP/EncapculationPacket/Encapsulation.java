package gunler.gun83_carsamba15.OOP.EncapculationPacket;

public class Encapsulation {

    private String name;
    private int age;


    public Encapsulation(String name,int age){

        this.name=name;
        this.age=age;
    }


    public String getName(){

        return this.name;
    }

    public void setName(String name){

        this.name=name;
    }
    public int getAge(){

        return this.age;
    }

    public void setAge(int Age){

        this.age=age;
    }

    public String NameUppercase(){

        this.name=name;
        return name.toUpperCase();
    }

   public String toString(){

        return "name= "+name+"  "+
                "age"+age;
   }



}
