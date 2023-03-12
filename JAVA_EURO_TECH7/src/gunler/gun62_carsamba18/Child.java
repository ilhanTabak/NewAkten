package gunler.gun62_carsamba18;

public class Child extends Parent {


    int age;


    public Child(String name,String lastName,int age){

        super(name, lastName);
        this.age=age;



    }

    public void display(){
        super.display();
        System.out.println("age of child+"+age);
    }





}
